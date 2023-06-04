package ua.javarush.task.pro.task12.task1210;

import java.util.ArrayList;

/* 
Перевертання даних
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {

        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
          int temp2 = numbers.get(n - i);
            numbers.set(n-i,temp );
            numbers.set(i,temp2 );
        }
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
