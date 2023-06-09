package ua.javarush.task.pro.task13.task1326;

import java.util.Queue;

public class Solution {

    public static void main(String[] args) {
        Queue<String> queue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            queue.offer("елемент " + i);
        }
        System.out.println("довжина черги: " + queue.size());

        System.out.println("*** iterator ***");
        for (Object o : queue) {
            System.out.println(o);
        }

        System.out.println("*** peek ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.peek());
        }

        System.out.println("*** poll ***");
        for (int i = 0; i < 12; i++) {
            System.out.println(queue.poll());
        }

        System.out.println("довжина черги: " + queue.size());
    }
}
