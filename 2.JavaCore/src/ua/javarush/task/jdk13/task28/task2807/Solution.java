package ua.javarush.task.jdk13.task28.task2807;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

/* 
Оркестр з бубонцями
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        List<FutureTask<String>> taskList = new ArrayList<>();
       List<String> instruments = Arrays.asList("скрипка", "тромбон", "бубонці", "контрабас");


//               new ArrayList() {{
//            add("New York");
//            add("Rio");
//            add("Tokyo");
//        }};


       // List<String> list = List.of("foo", "bar", "baz");   не хоче чомусь!

//        List<String> instruments =
//        Stream.of("скрипка", "тромбон", "бубонці", "контрабас")
//                .collect(Collectors.toList());

        for (String instrument : instruments) {
            taskList.add(startPlaying(instrument));
        }

        Thread.sleep(1000);
        completeConcert(taskList);
    }

    public static FutureTask<String> startPlaying(String name) {
        FutureTask<String> task = new FutureTask<>(new MusicalInstrument(name));
        new Thread(task).start();
        return task;
    }

    public static void completeConcert(List<FutureTask<String>> taskList) {
        for (FutureTask<String> task: taskList){
           if (!task.isDone()){
               task.cancel(true);
           }
//
//            taskList.stream()
//                    .filter(task -> !task.isDone())
//                    .forEach(task -> task.cancel(true));
        }
    }
}