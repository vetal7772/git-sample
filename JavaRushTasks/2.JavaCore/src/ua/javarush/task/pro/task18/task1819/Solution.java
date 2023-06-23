package ua.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Як бути, якщо в списку є елемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Цей елемент дорівнює null";
        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
    }

// 2 варіант - не проход компілятор, бо все має бути в одному методі!
//    public static void printString(String s) {
//        Optional<String> str = Optional.ofNullable(s);
//        System.out.println(str.orElse("Цей елемент дорівнює null"));
//    }
//
//    public static void printList(List<String> list) {
//             list.forEach(s -> printString(s));
//    }
}