package org.javarush.vitaliy.island.config;

import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.annotations.GameObjectEntity;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.reflections.Reflections;

import java.util.Set;

/**
 * Scans all classes in the project
 * and returns all classes that are implementing {@link GameObject}
 * with {@link GameObjectEntity} annotation.
 */
public class GameObjectsScanner {
    private static final Reflections reflections = new Reflections("org.javarush.vitaliy.island");
    private static GameObjectsScanner instance;

    private GameObjectsScanner() {
    }

    public static GameObjectsScanner getInstance() {
        if (instance == null) {
            instance = new GameObjectsScanner();
        }
        return instance;
    }

    /**
     * Returns all classes that are implementing {@link GameObject}
     * annotated with {@link GameObjectEntity}.
     *
     * @return set of classes extending GameObject and annotated with {@link GameObjectEntity}.
     */
    public Set<Class<? extends GameObject>> getAllGameObjectsClasses() {
        return reflections.getSubTypesOf(GameObject.class)
                .stream()
                .filter(a -> a.isAnnotationPresent(GameObjectEntity.class))
                .filter(a -> a.isAnnotationPresent(Config.class))
                .collect(java.util.stream.Collectors.toSet());
    }
//    public Set<Class<? extends GameObjectLabel>> getAllGameObjectsClasses() {
//        return reflections.getSubTypesOf(GameObjectLabel.class);
//    }
}
