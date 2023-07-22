package ua.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.*;

/* 
Багатопотоковий факторіал
*/

public class Solution {

    public static void main(String[] args) throws Exception {
      //  System.out.println(CalculateFactorial.calculate(35L));
       ExecutorService service = Executors.newFixedThreadPool(6);

       for (long i =1; i<40; i++) {
           service.submit(new FutureTask<>(new CalculateFactorial(i)));
       }

       service.awaitTermination(10,TimeUnit.SECONDS);
        service.shutdown();
//        FutureTask<Long> future2 = new FutureTask<>(new CalculateFactorial(10L));
//        FutureTask<Long> future3 = new FutureTask<>(new CalculateFactorial(35L));
//        FutureTask<Long> futureTask = new FutureTask<>(new CalculateFactorial(42L));
//        new Thread(future1).start();
//        new Thread(future2).start();
//        new Thread(future3).start();
//
//        new Thread((futureTask)).start();
//        System.out.println(future1.get());
//        System.out.println(future2.get());
//        System.out.println(future3.get());
//        System.out.println(futureTask.get());
    }
}