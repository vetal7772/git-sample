package ua.javarush.task.jdk13.task28.task2808;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* 
Мені не встигнути
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
        List<String> instruments = Arrays.asList("скрипка", "тромбон", "бубонці", "контрабас");
        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        System.out.println("Встигли дограти: " + completeConcert(taskList));
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static List<String> completeConcert(List<FutureTask<String>> taskList) {
        List<String> completedTask = new ArrayList<>();
        for (FutureTask<String> task : taskList) {
            try {
                completedTask.add(task.get(800, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
                task.cancel(true);
            }
        }
        return completedTask;
    }
}