package org.javarush.vitaliy.island.entity.oraganism.plants;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.abstraction.interfaces.Organism;
import org.javarush.vitaliy.island.abstraction.interfaces.Reproducible;
import org.javarush.vitaliy.island.config.Probably;
import org.javarush.vitaliy.island.config.Statistics;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.map.CellHelper;
import org.javarush.vitaliy.island.entity.oraganism.Limits;
import org.javarush.vitaliy.island.factory.GameObjectPrototypeFactory;


import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

@NoArgsConstructor
@SuperBuilder
@Getter
@EqualsAndHashCode
@ToString
public abstract class Plant implements Organism, Reproducible {
    private static final int PROBABILITY_OF_PLANT_REPRODUCTION = 20;

    private static long serialUID = 1L;
    private int lastReproductionYear = 0;
    /**
     * it's a serial Unique ID for each object of this class.
     * it's needed for generating different hash codes.
     * Annotation @Builder.Default is needed for excluding this field from builder.
     */
    @Builder.Default
    private final long UID = serialUID++;

//
//    public int getLastReproductionYear() {
//        return lastReproductionYear + Statistics.getInstance().getYear();
//    }

    @Builder.Default
    private ReentrantLock lock = new ReentrantLock();

    @JsonIgnore
    private Cell cell;
    private String icon;
    private Limits limits;

    private boolean isEaten = false;

    public boolean getIsEaten() {
        return isEaten;
    }



    @Override
    public void play() {
        this.reproducePlant(this);
    }

    @Override
    public void setGameObjectCell(Cell cell) {
        this.cell = cell;
    }

    @Override
    public String getGameObjectIcon() {
        return icon;
    }


    public void reproducePlant(Plant parentPlant) {
        GameObject newPlant = parentPlant.multiply();
        if (newPlant != null) {
            Cell currentCell = parentPlant.getCell();
            if (currentCell != null) {
                synchronized (currentCell.getLock()) {


                    if (isReproduceUnderLimit(newPlant, currentCell)) {
                        Statistics.getInstance().gameObjectsReproduce(this);
                        CellHelper.addOrganism(currentCell, newPlant);
                    } else {
                        newPlant = null;
                        CellHelper.addOrganism(currentCell, newPlant);

                    }

                }
            }
        }
    }

    public boolean isReproduceUnderLimit(GameObject newPlant, Cell cell) {
        Map<Class<? extends GameObject>, Set<GameObject>> residentsCell = cell.getResidents();
        int numRes = 0;
        for (Set<GameObject> residentSet : residentsCell.values()) {

            for (GameObject resident : residentSet) {
                numRes++;
                if (numRes < newPlant.getLimits().getMaxAmount()) {
                    return true;
                }
            }
        }
        return false;
    }

    public GameObject multiply() {
        if (Probably.calculate(PROBABILITY_OF_PLANT_REPRODUCTION)) { //Ймовірність розмноження
            return GameObjectPrototypeFactory.getInstance().createPrototype(this.getClass());
        } else {
            return null;
        }
    }
}

