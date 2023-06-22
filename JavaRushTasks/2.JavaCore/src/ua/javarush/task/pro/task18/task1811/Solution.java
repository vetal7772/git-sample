package ua.javarush.task.pro.task18.task1811;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Отримання потоку Stream
*/

public class Solution {

    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Зима", "Весна", "Літо", "Осінь");

        Stream<String> stringStream = getStreamFromArrayList(strings);
        stringStream.forEach(System.out::println);

        var integers = new Integer[]{12, 34, 56, 78, 90};

        Stream<Integer> integerStream = getStreamFromArray(integers);
        integerStream.forEach(System.out::println);
    }

    public static Stream<String> getStreamFromArrayList(ArrayList<String> list) {
       Stream<String> stringStream = list.stream();
        return stringStream;
    }

    public static Stream<Integer> getStreamFromArray(Integer[] array) {
//        Stream<Integer> integerStream = Arrays.stream(array);
//        return integerStream;
        return Arrays.stream(array);
    }
}
