package ua.javarush.task.jdk13.task28.task2812;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* 
ShutdownNow!
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 1; i <= 10; i++) {
            final int localId = i;
            executor.submit(() -> doExpensiveOperation(localId));

        }

        List<Runnable> incomplete = executor.shutdownNow();
        Thread.sleep(100);
        for (Runnable runnable : incomplete){
            System.out.println(runnable.toString() + " was not completed");
        }
//        if (executor.isShutdown()){
//            notCompletedeOperation();
//        }
    }

    private static void doExpensiveOperation(int localId) {
        System.out.println(Thread.currentThread().getName() + ", localId=" + localId);
    }

    private static void notCompletedeOperation() {
        System.out.println(Thread.currentThread().getName() + ", was not completed" );
    }
}
