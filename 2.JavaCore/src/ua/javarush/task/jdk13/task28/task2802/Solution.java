package ua.javarush.task.jdk13.task28.task2802;

import java.util.concurrent.ThreadLocalRandom;

/* 
ThreadLocalRandom
*/

public class Solution {
    public static int getRandomIntegerBetweenNumbers(int from, int to) {
        int random = ThreadLocalRandom.current().nextInt(from, to);
        return random;
    }

    public static double getRandomDouble() {
        double random = ThreadLocalRandom.current().nextDouble(0,1);
        return random;
    }

    public static long getRandomLongBetween0AndN(long n) {
        long random = ThreadLocalRandom.current().nextLong(0,n);
        return random;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" int= "+getRandomIntegerBetweenNumbers(5,20));
                System.out.println(" double= "+getRandomDouble());
                System.out.println(" long= "+getRandomLongBetween0AndN(77));
            }
        });
        thread.start();
    }
}
