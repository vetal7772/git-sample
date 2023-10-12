package ua.javarush.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Читання чисел
*/

public class Solution {

    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int number1 = 0;
       int number2 = 0;
       int number3 = 0;


        number1 = scn.nextInt();
        number2 = scn.nextInt();
        number3 = scn.nextInt();


   int avrResult = (number1 + number2 + number3) / 3;
        System.out.println(avrResult);
    }
}
