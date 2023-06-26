package ua.javarush.task.jdk13.task14.task1404;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static ua.javarush.task.jdk13.task14.task1404.Solution.CatFactory.getCatByKey;

/* 
Коти
*/

public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        String key;
//
//        while (!(key = reader.readLine()).equals("")) {
//            Cat cat = CatFactory.getCatByKey(key);
//            System.out.println(cat.toString());
//        }
//
//    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String catSName;
        while (!(catSName = scn.nextLine()).equals("")) {
            System.out.println(getCatByKey(catSName));
          //  Cat cat = getCatByKey(catSName);
            // System.out.println(cat.toString());
        }
    }


    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat;
            switch (key) {
                case "vaska":
                    cat = new MaleCat("Василь");
                    break;
                case "murka":
                    cat = new FemaleCat("Мурочка");
                    break;
                case "kiska":
                    cat = new FemaleCat("Кицюнька");
                    break;
                default:
                    cat = new Cat(key);
                    break;
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я вуличний кіт " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солідний кошак на ім'я " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - мила кішечка на ім'я " + getName();
        }
    }
}
