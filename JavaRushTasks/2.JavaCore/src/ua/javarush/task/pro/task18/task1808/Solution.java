package ua.javarush.task.pro.task18.task1808;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Consumer;

/* 
Знайомство з посиланнями на методи
*/

public class Solution {
    public static void main(String[] args) {
        var strings = new ArrayList<String>();
        Collections.addAll(strings, "Hello", "Amigo", "JavaRush", "CodeGym");

        print(strings);
    }

    public static void print(ArrayList<String> strings) {
        //1
        strings.forEach(System.out::println);
// 2       strings.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        // 3  strings.forEach(string -> System.out.println(string));
    }
}
