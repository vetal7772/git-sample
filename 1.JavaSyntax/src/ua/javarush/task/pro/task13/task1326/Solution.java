package ua.javarush.task.pro.task13.task1326;

import java.util.Objects;
import java.util.Queue;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) {
        Queue<String> queue = new MyQueue();

        for (int i = 0; i < 10; i++) {
            System.out.println(queue.offer("елемент " + i)); // output "true" without elements
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

        for (int i =0; i <5; i++){
            System.out.println(queue.stream().filter(Predicate.isEqual("елемент 3")));
        }
    }
}
