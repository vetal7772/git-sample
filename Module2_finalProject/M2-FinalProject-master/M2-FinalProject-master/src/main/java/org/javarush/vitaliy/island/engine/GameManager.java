package org.javarush.vitaliy.island.engine;


import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.map.GameMap;
import org.javarush.vitaliy.island.entity.oraganism.animals.Animal;
import org.javarush.vitaliy.island.entity.oraganism.plants.Plant;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class GameManager {
    public void runGameManage() {
        Cell[][] cells = GameMap.getInstance().getCells();

        for (Cell[] row : cells) {
            for (Cell cell : row) {
                synchronized (cell.getLock()) {
                    Map<Class<? extends GameObject>, Set<GameObject>> residents = new HashMap<>(cell.getResidents());
                    for (Map.Entry<Class<? extends GameObject>, Set<GameObject>> entry : residents.entrySet()) {
                        Class<? extends GameObject> residentType = entry.getKey();
                        Set<GameObject> residentSet = new HashSet<>(entry.getValue());
                        for (GameObject resident : residentSet) {
                            if (Animal.class.isAssignableFrom(residentType)) {
                                Animal animal = (Animal) resident;
                                synchronized (animal.getLock()) {
                                    animal.play();
                                }
                            } else {
                                if (Plant.class.isAssignableFrom(residentType)) {
                                    Plant plant = (Plant) resident;
                                    synchronized (plant.getLock()) {
                                        plant.play();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
