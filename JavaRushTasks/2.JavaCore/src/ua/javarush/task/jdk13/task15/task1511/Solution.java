package ua.javarush.task.jdk13.task15.task1511;

/* 
Статики і котики
*/

public class Solution {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Пушок";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
    public String name;
    }
}
