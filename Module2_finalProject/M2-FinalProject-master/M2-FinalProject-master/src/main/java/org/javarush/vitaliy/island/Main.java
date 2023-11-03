package org.javarush.vitaliy.island;

import org.javarush.vitaliy.island.config.AppConfigurator;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(100);
        service.submit( AppConfigurator.getInstance());

        service.shutdown();
        System.out.println("All tasks submitted");
     service.awaitTermination(1, TimeUnit.MINUTES);

    }
}