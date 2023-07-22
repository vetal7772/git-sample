package ua.javarush.task.jdk13.task28.task2804;

/* 
Пріоритети в Threads
*/

public class Solution {

    public static void main(String[] args) {

        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread().getPriority() + " ");
        }
        //output
        //1 2 3 4 5 6 7 8 9 10 1 2

        System.out.println();
        ThreadGroup group = new ThreadGroup("someName");
        group.setMaxPriority(7);
        for (int i = 0; i < 12; i++) {
            System.out.print(new MyThread(group, "name" + i).getPriority() + " ");
        }
        //output
        //3 4 5 6 7 7 7 7 1 2 3 4
        Solution solution = new Solution();
       MyThread thread1 = new MyThread();
       MyThread thread2 = new MyThread();
       MyThread thread3 = new MyThread();
       MyThread thread4 = new MyThread();
       MyThread thread5 = new MyThread();
       thread1.start();
       thread2.start();
       thread3.start();
       thread4.start();
       thread5.start();
    }

}
