package org.javarush.vitaliy.island.entity.oraganism.animals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.config.Probably;
import org.javarush.vitaliy.island.config.Statistics;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.map.CellHelper;
import org.javarush.vitaliy.island.entity.oraganism.Limits;
import org.javarush.vitaliy.island.abstraction.interfaces.Movable;
import org.javarush.vitaliy.island.abstraction.interfaces.Organism;
import org.javarush.vitaliy.island.entity.oraganism.plants.Plant;
import org.javarush.vitaliy.island.factory.GameObjectPrototypeFactory;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

import static org.javarush.vitaliy.island.entity.map.CellHelper.removeOrganism;

@NoArgsConstructor
@SuperBuilder
@Getter
@ToString
public abstract class Animal implements Organism, Movable {
    private static long serialUID = 1L;
    @Builder.Default
    private final long UID = serialUID++;
    @Builder.Default
    private ReentrantLock lock = new ReentrantLock();
    @JsonIgnore
    private Cell cell;
    private String icon;
    private Limits limits;

    @Setter
    private double famine;


    private boolean isAlive;

    public boolean getIsAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }


    private int reproductionProbability;

    public int getReproductionProbability() {
        return Probably.randomInt(5, 20);
    }

       private  int hungerDecreased;

    public int getHungerDecreased() {
        return Probably.randomInt(10, 25);
    }


    @Builder.Default
    private Map<String, Integer> stringTargetMatrix = new HashMap<>();
    @Builder.Default
    private Map<Class<? extends GameObject>, Integer> targetMatrix = new HashMap<>();

    @Override
    public void setGameObjectCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String getGameObjectIcon() {
        return icon;
    }

    @Override
    public void play() {
        this.eat();
        this.decreaseFamine();
        this.reproduceAnimal(this);
        this.move();
    }

    private void eat() {
        GameObject potentialFood = findPotentialFood();
        if (canEatFood(potentialFood)) {
            assert potentialFood != null;
            eatFood(potentialFood);
            Statistics.getInstance().gameObjectEaten(potentialFood);
        }
    }

    private void eatFood(GameObject food) {
        Cell currentCell = getCell();
        if (currentCell != null) {
            synchronized (currentCell.getLock()) {
                double currentFamine = Math.random() * limits.getMaxFood();
                // double currentFamine = getFamine();
                double maxFood = limits.getMaxFood();
                double foodWeight = food.getLimits().getMaxWeight();

                double newFamine = currentFamine + foodWeight;
                if (newFamine > maxFood) {
                    newFamine = maxFood;
                }
                if (foodWeight == 0) {
                    newFamine = currentFamine - (double) food.getLimits().getMaxWeight() / 6;
                }
                setFamine(newFamine);
                removeOrganism(currentCell, food);
            }
        }
    }

    private int calculateFoodProbability(GameObject foodObject) {
        if (foodObject instanceof Organism) {
            String foodName = foodObject.getClass().getSimpleName();
            Integer probability = stringTargetMatrix.get(foodName);
            return probability != null ? probability : 0;
        }
        return 0;
    }

    private Organism findPotentialFood() {
        Cell currentCell = getCell();
        if (currentCell != null) {
            synchronized (currentCell.getLock()) {
                Map<Class<? extends GameObject>, Set<GameObject>> residentsMap = currentCell.getResidents();

                List<Organism> potentialFood = residentsMap.entrySet().stream()
                        .filter(entry -> entry.getKey() != this.getClass()) // Відмінний від поточного виду
                        .flatMap(entry -> entry.getValue().stream())
                        .filter(resident -> resident instanceof Organism)
                        //     .filter(resident -> resident.getTargetMatrix.get(Organism). instanceof Organism)
                        .map(resident -> (Organism) resident)
                        .toList();

                if (!potentialFood.isEmpty()) {
                    int randomIndex = Probably.randomInt(0, potentialFood.size());
                    return potentialFood.get(randomIndex);
                }
            }
        }
        return null;
    }

    private boolean canEatFood(GameObject food) {
        int foodProbability = calculateFoodProbability(food);
        return Probably.calculate(foodProbability);
    }

    public void decreaseFamine() {
        double maxFood = limits.getMaxFood();
        double decreaseAmount = maxFood * getHungerDecreased() / 100; // % від maxFood
        setFamine(getFamine() - decreaseAmount);
        dieFromStarvation();
    }

    public void dieFromStarvation() {
        if (getFamine() < 0) {
            Cell currentCell = getCell();
            if (currentCell != null) {
                synchronized (currentCell.getLock()) {
                    CellHelper.removeOrganism(currentCell, this);
                    Statistics.getInstance().diedFromStarvation(this);
                }
            }
        }
    }

    @Override
    public void move() {
        if (limits.getMaxSpeed() < 1) {
            return;
        }
        Cell currentCell = getCell();
        if (currentCell == null) {
            return;
        }
        synchronized (currentCell.getLock()) {
            List<Cell> neighborCells = new ArrayList<>(CellHelper.getNeighborCells(currentCell));
            if (!neighborCells.isEmpty()) {
                int distance = Probably.randomInt(1, limits.getMaxSpeed() + 1);
                Cell nextCell = CellHelper.chooseNextCell(neighborCells, distance);
                if (nextCell != null) {
                    synchronized (nextCell.getLock()) {
                        CellHelper.moveOrganismToCell(currentCell, nextCell, this);
                    }
                }
            }
        }
    }

    public void reproduceAnimal(Animal parentAnimal) {
        GameObject newAnimal = parentAnimal.multiply();
        if (newAnimal != null) {
            Cell currentCell = parentAnimal.getCell();
            if (currentCell != null) {
                synchronized (currentCell.getLock()) {


                    if (isReproduceUnderLimit(newAnimal, currentCell)) {
                        Statistics.getInstance().gameObjectsReproduce(this);
                        CellHelper.addOrganism(currentCell, newAnimal);
                    } else {
                        newAnimal = null;
                        CellHelper.addOrganism(currentCell, newAnimal);

                    }

                }
            }
        }
    }


    public boolean isReproduceUnderLimit(GameObject newAnimal, Cell cell) {
        Map<Class<? extends GameObject>, Set<GameObject>> residentsCell = cell.getResidents();
        int numRes = 0;
        for (Set<GameObject> residentSet : residentsCell.values()) {

            for (GameObject resident : residentSet) {
                numRes++;
                if (numRes < resident.getLimits().getMaxAmount()) {

                    return true;
                }
            }
        }

        return false;
    }


    public GameObject multiply() {
        if (Probably.calculate(getReproductionProbability())) {
            return GameObjectPrototypeFactory.getInstance().createPrototype(this.getClass());
        } else {
            return null;
        }
    }

}
