package ua.javarush.task.pro.task09;

public class Main {
    public static void main(String[] args) {
        int x = 7;
        Integer y = 111;
        x = y; // автораспаковка
        System.out.println("x = "+x);
        y = x * 123; // автоупаковка
        System.out.println("y = "+y);
    }
}