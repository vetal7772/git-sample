package ua.javarush.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Виводимо в консоль елементи множини
*/

public class Solution {

    public static void print(HashSet<String> words) {
       Iterator it = words.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
           // Можна і так
//           String string = (String) it.next();
//           System.out.println(string);
       }

    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Програмування зазвичай навчають на прикладах.".split(" ")));
        print(words);
    }
}
