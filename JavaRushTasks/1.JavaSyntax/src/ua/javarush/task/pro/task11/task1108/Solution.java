package ua.javarush.task.pro.task11.task1108;

/* 
Утилітний калькулятор
*/

import static ua.javarush.task.pro.task11.task1108.Solution.Calculator.*;

public class Solution {
    public static final String EQUAL = " = ";

    public static void main(String[] args) {
        int a = 45;
        int b = 15;
        add(a, b);
        subtract(a, b);
        multiply(a, b);
        divide(a, b);
    }

    public static class Calculator {
        public static void add(int a, int b) {
            System.out.println(a + " + " + b + EQUAL + (a + b));
        }

        public static void subtract(int a, int b) {
            System.out.println(a + " - " + b + EQUAL + (a - b));
        }

        public static void multiply(int a, int b) {
            System.out.println(a + " * " + b + EQUAL + (a * b));
        }

        public static void divide(int a, int b) {
            System.out.println(a + " / " + b + EQUAL + (a / b));
        }
    }
}