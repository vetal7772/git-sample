package ua.javarush.task.jdk13.task16.task1613;

import java.util.ArrayList;
import java.util.List;

/* 
Список і потоки
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
//        SpecialThread specialThread1 = new SpecialThread();
//        SpecialThread specialThread2 = new SpecialThread();
//        SpecialThread specialThread3 = new SpecialThread();
//
//
//        Thread thread1= new Thread(specialThread1);
//        Thread thread2= new Thread(specialThread2);
//        Thread thread3= new Thread(specialThread3);
//
//
//        list.add(thread1);
//        list.add(thread2);
//        list.add(thread3);

        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));
        list.add(new Thread(new SpecialThread()));  // так щвидше

//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's a run method inside SpecialThread");
        }
    }
}
