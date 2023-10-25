package org.javarush.vitaliy.island.config;

import org.javarush.vitaliy.island.abstraction.interfaces.GameObject;
import org.javarush.vitaliy.island.engine.Simulation;
import org.javarush.vitaliy.island.entity.map.GameMap;
import org.javarush.vitaliy.island.factory.GameObjectPrototypeFactory;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * This class is responsible for application configuration at the startup.
 * <p>
 * It is responsible for:
 * <ul>
 * <li>Registering all prototypes of game objects</li>
 * </ul>
 */
public class AppConfigurator {

    private static AppConfigurator instance;
    private final GameObjectsScanner gameObjectsScanner = GameObjectsScanner.getInstance();
    private final PrototypeFactory prototypeFactory = PrototypeFactory.getInstance();
    private final GameObjectPrototypeFactory gameObjectFactory = GameObjectPrototypeFactory.getInstance();
    private final GameMapGenerator gameMapGenerator = GameMapGenerator.getInstance();
    private final CellGenerator cellGenerator = CellGenerator.getInstance();
    private final Simulation simulation = Simulation.getInstance();


    private AppConfigurator() {
    }

    public static AppConfigurator getInstance() {
        if (instance == null) {
            instance = new AppConfigurator();
        }
        return instance;
    }

    /**
     * This method is responsible for making all necessary configurations at the application startup.
     */

//    Island island = new Island();
//    Console console = new Console(island);
//    Simulation simulation = new Simulation(island);
//    PlantGrowth plantGrowth = new PlantGrowth(island);
//
//    ScheduledExecutorService service = Executors.newScheduledThreadPool(3);
//        service.scheduleAtFixedRate(plantGrowth, 0, 1, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(simulation, 1, 1, TimeUnit.SECONDS);
//        service.scheduleAtFixedRate(console, 0, island.getMsToReloadConsole(), TimeUnit.MILLISECONDS);


    public void init() {


        registerPrototypes();
     //  gameObjectFactory.printPrototypes();  // test method

        GameMap.setInstance(generateGameMap());
       simulation.startSimulation();
        // TODO: implement gameField config loading.
        // TODO: implement gameField initialization with cells.
    }


    private void registerPrototypes() {
        gameObjectsScanner.
                getAllGameObjectsClasses()
                .stream()
                .map(prototypeFactory::loadPrototype)
                .forEach(prototype -> gameObjectFactory.registerPrototype((GameObject) prototype));
    }

    private GameMap generateGameMap() {
        return gameMapGenerator.createGameMap();
    }
}
