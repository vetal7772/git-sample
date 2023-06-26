package ua.javarush.task.jdk13.task15.task1508;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {

    public static Map<Double, String> labels = new HashMap<>();
     static {
        labels.put(1.0, "Hello");
        labels.put(2., "Good morning");
        labels.put(3d, "Good afternoon");
        labels.put(4.0D, "Good evening");
        labels.put(5D, "Good night");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
