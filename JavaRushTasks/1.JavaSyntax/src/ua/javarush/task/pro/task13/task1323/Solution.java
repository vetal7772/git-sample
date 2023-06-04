package ua.javarush.task.pro.task13.task1323;

import java.util.ArrayList;
import java.util.HashSet;

import static java.util.Arrays.asList;

/* 
Перетворення списку на множину
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> listOfWords = new ArrayList<>(asList(
                "Світ побачила нова серія книг по програмуванню на Java: \"Java для початківців\", \"Java для тих, хто продовжує\", \"Java для тих, хто закінчує\""
                        .split(" ")));
        System.out.println("Кількість слів у списку: " + listOfWords.size());
        System.out.println(listOfWords);

        HashSet<String> setOfWords = listToSet(listOfWords);
        System.out.println("Кількість слів у множині: " + setOfWords.size());
        System.out.println(setOfWords);
    }

    public static HashSet<String> listToSet(ArrayList<String> listOfWords) {
        HashSet<String> result = new HashSet<>(listOfWords);
        //напишіть тут ваш код

        return result;
    }
}