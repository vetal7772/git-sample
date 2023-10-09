package ua.javarush.task.pro.task13.task1312;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
ArrayList і HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
        Set<Map.Entry<Integer, String>> testEntry = getProgrammingLanguages().entrySet();
        for (var entry : testEntry) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишіть тут ваш код
        HashMap<Integer, String> programmingLanguages = new HashMap<>();
        programmingLanguages.put(0, "Java");
        programmingLanguages.put(1, "Kotlin");
        programmingLanguages.put(2, "Go");
        programmingLanguages.put(3, "Javascript");
        programmingLanguages.put(4, "Typescript");
        programmingLanguages.put(5, "Python");
        programmingLanguages.put(6, "PHP");
        programmingLanguages.put(7, "C++");
        return programmingLanguages;
    }

    public static Set<Map.Entry<Integer, String>> testEntry = getProgrammingLanguages().entrySet();


}
