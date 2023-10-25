package org.javarush.vitaliy.island.engine;

import lombok.Setter;
import org.javarush.vitaliy.island.config.Statistics;
import org.javarush.vitaliy.island.entity.map.GameMap;
import org.javarush.vitaliy.island.view.StatisticMonitor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class Simulation {
    private static Simulation instance;
    @Setter
    private Boolean isEmptyIsland = false;
    private final ExecutorService simulationExecutor;
    private final ExecutorService outputExecutor;
    private final Object lock = new Object();
    private boolean shouldPrintStats = true;

    public static Simulation getInstance() {
        if (instance == null) {
            instance = new Simulation();
        }
        return instance;
    }

    private Simulation() {
        simulationExecutor = Executors.newSingleThreadExecutor();
        outputExecutor = Executors.newSingleThreadExecutor();
    }

    public void startSimulation() {
        StatisticMonitor.printGameMapWithStatistics(GameMap.getInstance());

        outputExecutor.execute(() -> {
            while (!isEmptyIsland) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock) {
                    if (shouldPrintStats) {
                        System.out.println("__________N__E__X__T__________");
                        StatisticMonitor.printGameMapWithStatistics(GameMap.getInstance());
                        shouldPrintStats = false;
                        lock.notify();
                    }
                }
            }
        });

        simulationExecutor.execute(() -> {
            while (!isEmptyIsland) {
                Statistics.getInstance().resetCounters();

                int year = Statistics.getInstance().getYear();
                year++;
                if (year>30){
                    System.out.println("\n" +
                            "-------------ALL THE ANIMALS DIED OF OLD AGE-----------\n" +
                            "\n");
                    break;
                }
                Statistics.getInstance().setYear(year);
                GameManager gameManager = new GameManager();
                gameManager.runGameManage();

                synchronized (lock) {
                    shouldPrintStats = true;
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            // Завершити виконання програми
            simulationExecutor.shutdown();
            outputExecutor.shutdown();
        });
    }
}
