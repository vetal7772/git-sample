package ua.javarush.task.jdk13.task20.task2005;

import java.io.Serializable;

/* 
Як серіалізувати щось своє?
*/

public class Solution {
    public static int stringCount;


    public static void main(String[] args) {
        Solution.String test = new Solution.String();
        System.out.println(test.number);
    }

    public static class Object implements Serializable {
        public String string1;
        public String string2;
    }

    public static class String implements Serializable {
        private final int number;

        public String() {
            number = ++stringCount;
        }

        public void print() {
            System.out.println("string #" + number);
        }
    }
}
