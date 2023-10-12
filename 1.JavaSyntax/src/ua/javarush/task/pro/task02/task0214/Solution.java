package ua.javarush.task.pro.task02.task0214;

import java.util.Scanner;

import static java.lang.System.in;

/* 
Читання і перетворення рядків
*/

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(in);
        String number1 = scn.nextLine();
        String number2 = scn.nextLine();
        String number3 = scn.nextLine();

        System.out.println(number3);
        System.out.println(number2.toUpperCase());
        System.out.println(number1.toLowerCase());

    }
}
