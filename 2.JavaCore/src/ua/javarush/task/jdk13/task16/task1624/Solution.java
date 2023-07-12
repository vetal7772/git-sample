package ua.javarush.task.jdk13.task16.task1624;

/* 
Відлік на перегонах
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
       Thread.sleep(3500);
       clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            //while (!isInterrupted() && numSeconds >= 0) { замість циклу for
            if(numSeconds==3){
                for (;numSeconds>=1;numSeconds--){
                    try {
                        System.out.print(numSeconds+" ");
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                System.out.println("Марш!");
            }else {
                for (;numSeconds>=1;numSeconds--){
                    try {
                        System.out.print(numSeconds+" ");
                        Thread.sleep(1000);

                    } catch (InterruptedException e) {
                        System.out.println("Перервано!");
                    }

                }

            }
        }
    }
}
