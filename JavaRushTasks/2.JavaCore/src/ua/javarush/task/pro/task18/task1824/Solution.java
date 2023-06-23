package ua.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
З потоку даних до map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
       Map<String, Integer> result = stringStream
               .collect(Collectors.toMap(s -> s, s -> s.length()));
        return result;
    }
}

//    Map<String, String> result = list.stream()
//            .map( e -> e.split("=") )
//            .filter( e -> e.length == 2 )
//            .collect( Collectors.toMap(e -> e[0], e -> e[1]) );