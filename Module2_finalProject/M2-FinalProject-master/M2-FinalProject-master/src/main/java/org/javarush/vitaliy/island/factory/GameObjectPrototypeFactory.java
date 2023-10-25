package org.javarush.vitaliy.island.factory;

import lombok.Getter;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Factory for creating organisms.
 * <p>  It can be replaced by Factory Method pattern.</p>
 */
@Getter
public class GameObjectPrototypeFactory implements PrototypeFactory<GameObject> {
    private static GameObjectPrototypeFactory instance;
    private final Map<Class<? extends GameObject>, GameObject> prototypes = new HashMap<>();

    private GameObjectPrototypeFactory() {
    }

    public static GameObjectPrototypeFactory getInstance() {
        if (instance == null) {
            instance = new GameObjectPrototypeFactory();
        }
        return instance;
    }
@Override
    public void registerPrototype(GameObject prototype) {
        prototypes.put(prototype.getClass(), prototype);
    }

    /**
     * Test method to print all prototypes from Factory
     */
//    public void printPrototypes(){
//        System.out.println(prototypes.keySet());
//    }

    @Override
    public GameObject createPrototype(Class<? extends GameObject> type) {
        if (!prototypes.containsKey(type)) {
            throw new IllegalArgumentException();
        }
        return prototypes.get(type).reproduce();
    }


    @Override
    public Collection<GameObject> getPrototypes() {
        return prototypes.values();
    }
}
