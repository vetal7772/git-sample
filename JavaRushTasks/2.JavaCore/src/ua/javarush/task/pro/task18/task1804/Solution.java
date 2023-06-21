package ua.javarush.task.pro.task18.task1804;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* 
Знайомство з лямбда-виразом
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = new ArrayList<Integer>();

        Collections.addAll(numbers, 123, -6, 12, 0, 44, 5678, -350);

        sortNumbers(numbers);

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }

    public static void sortNumbers(ArrayList<Integer> numbers) {

        Comparator<Integer> comparator = (o1, o2) -> o1 - o2;

//               Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer i1, Integer i2) {
//                return i1 - i2;
//            }
//        };
        Collections.sort(numbers, comparator);
    }
}
