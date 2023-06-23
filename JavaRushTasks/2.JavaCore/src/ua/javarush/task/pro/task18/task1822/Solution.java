package ua.javarush.task.pro.task18.task1822;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/* 
З потоку даних до списку
*/

public class Solution {

    public static void main(String[] args) {
        var numbers = Stream.of(-1, 10, 43, 0, -32, -4, 22);

        getPositiveNumbers(numbers).forEach(System.out::println);
    }

    public static List<Integer> getPositiveNumbers(Stream<Integer> numbers) {
        //напишіть тут ваш код
        List<Integer> integers = numbers.filter(x -> x > 0)
                .collect(Collectors.toList());
        return integers;
    }
}
