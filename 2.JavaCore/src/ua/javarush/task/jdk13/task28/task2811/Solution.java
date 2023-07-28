package ua.javarush.task.jdk13.task28.task2811;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

/* 
Знайомство з Executors
*/

public class Solution {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            final int localID = i;

            executorService.submit(new Runnable() {
                @Override
                public void run() {

                    doExpensiveOperation(localID);
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(5, SECONDS);


        System.out.println(executorService);
    }


    private static void doExpensiveOperation(int localID) {
        System.out.println(Thread.currentThread().getName() + ", localID=" + localID);
    }
}
