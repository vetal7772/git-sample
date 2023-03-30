package ua.javarush.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Знайти і знешкодити
*/

public class Solution {
    public static String bug = "bug";

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);

        removeBugWithFor(copyWordsFirst);
        removeBugWithWhile(copyWordsSecond);
        removeBugWithCopy(copyWordsThird);

        copyWordsFirst.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        copyWordsSecond.forEach(System.out::println);
        System.out.println(line);
        copyWordsThird.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
       for (int i = list.size() - 1; i >= 0; i--) {
       // for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String str = it.next();
            if (bug.equalsIgnoreCase(str)) {
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for (String str : listCopy) {
            if (bug.equalsIgnoreCase(str)) {
                list.remove(str);
            }
        }
    }
}
