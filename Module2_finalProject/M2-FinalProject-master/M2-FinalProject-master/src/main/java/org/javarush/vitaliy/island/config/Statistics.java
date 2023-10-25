package org.javarush.vitaliy.island.config;

import lombok.Getter;
import lombok.Setter;
import org.javarush.vitaliy.island.abstraction.interfaces.AnimalBehaviour;
import org.javarush.vitaliy.island.entity.map.Cell;
import org.javarush.vitaliy.island.entity.map.GameMap;


import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.entity.oraganism.animals.Animal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Getter
public class Statistics {
    @Setter
    private int year;
    private final Map<Class<? extends GameObject>, Integer> gameObjectEatenMap = new HashMap<>();
    private final Map<Class<? extends GameObject>, Integer> diedFromStarvationMap = new HashMap<>();
    private final Map<Class<? extends GameObject>, Integer> gameObjectsReproduceMap = new HashMap<>();

    private static Statistics instance;

    public static Statistics getInstance() {
        if (instance == null) {
            instance = new Statistics();
        }
        return instance;
    }

    private Statistics() {
    }

//    public static int calculateTotalAnimals(GameMap gameMap) {
//        int totalAnimals = 0;
//        Cell[][] cells = gameMap.getCells();
//
//        for (int row = 0; row < cells.length; row++) {
//            for (int column = 0; column < cells[row].length; column++) {
//                Map<Class<? extends GameObject>, Set<GameObject>> residentsMap = cells[row][column].getResidents();
//                for (Set<GameObject> residentSet : residentsMap.values()) {
//                    totalAnimals += residentSet.size();
//                }
//            }
//        }
//        return totalAnimals;
//    }

    public void resetCounters() {
        gameObjectEatenMap.clear();
        diedFromStarvationMap.clear();
        gameObjectsReproduceMap.clear();
    }

    public void gameObjectEaten(GameObject gameObject) {
        Class<? extends GameObject> objectType = gameObject.getClass();
        gameObjectEatenMap.put(objectType, gameObjectEatenMap.getOrDefault(objectType, 0) + 1);
    }

    public void diedFromStarvation(GameObject gameObject) {
        Class<? extends GameObject> objectType = gameObject.getClass();
        diedFromStarvationMap.put(objectType, diedFromStarvationMap.getOrDefault(objectType, 0) + 1);
    }

    public void gameObjectsReproduce(GameObject gameObject) {
        Class<? extends GameObject> objectType = gameObject.getClass();
        gameObjectsReproduceMap.put(objectType, gameObjectsReproduceMap.getOrDefault(objectType, 0) + 1);
    }
    public static int calculateTotalObjects(GameMap gameMap) {
        int totalObjects = 0;
        Cell[][] cells = gameMap.getCells();

        for (int row = 0; row < cells.length; row++) {
            for (int column = 0; column < cells[row].length; column++) {
                Map<Class<? extends GameObject>, Set<GameObject>> residentsMap = cells[row][column].getResidents();
                for (Set<GameObject> residentSet : residentsMap.values()) {
                    totalObjects += residentSet.size();
                }
            }
        }

        return totalObjects;
    }

//    public static int calculateTotalAnimals(GameMap gameMap) {
//        int totalAnimals = 0;
//        Cell[][] cells = gameMap.getCells();
//
//        for (int row = 0; row < cells.length; row++) {
//            for (int column = 0; column < cells[row].length; column++) {
//                Map<Class<? extends AnimalBehaviour>, Set<GameObject>> residentsMap =  cells[row][column].getResidents();
//                for (Set<GameObject> residentSet : residentsMap.values()) {
//                    totalAnimals += residentSet.size();
//                }
//            }
//        }
//
//        return totalAnimals;
//    }
}
