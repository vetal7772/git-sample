package org.javarush.vitaliy.island.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.javarush.vitaliy.island.abstraction.annotations.Config;
import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.exceptions.InitGameException;
import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Loads prototype objects from yaml files.
 */
public class PrototypeFactory {

    private static PrototypeFactory instance;

    private final ObjectMapper objectMapper = new YAMLMapper();

    private PrototypeFactory() {
    }

    public static PrototypeFactory getInstance() {
        if (instance == null) {
            instance = new PrototypeFactory();
        }
        return instance;
    }


    /**
     * Loads prototype object from yaml file.
     *
     * @param type class of prototype object you want to load.
     * @param <T>  type of prototype object.
     * @return prototype object.
     */


    public <T> T loadPrototype(@NotNull Class<T> type) {
        if (!type.isAnnotationPresent(Config.class)) {
            throw new IllegalArgumentException(String.format("Prototype class %s must have @Config annotation", type));
        }
        return loadObject(getConfigFilePath(type), type);
    }


    private URL getConfigFilePath(@NotNull Class<?> type) {
        Config config = type.getAnnotation(Config.class);
        return type.getClassLoader().getResource(config.fileName());
    }

    private <T> T loadObject(@NotNull URL configFilePath, Class<T> type) {
        T gameObject;
        try {
            gameObject = objectMapper.readValue(configFilePath, type);
        } catch (IOException e) {
            String message = String.format("Cannot find config file %s for class %s",
                    configFilePath.getFile(),
                    type);
            throw new InitGameException(message, e);
        }
        return gameObject;
    }

//    public GameObject[] getPrototypes() {
//        return null;
//    }

    // @Override
//    public GameObject reproduce() {
//        return null;
//    }
}