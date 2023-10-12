package ua.javarush.task.pro.task03.task0305;

import java.util.Scanner;

/* 
Три числа
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number1 = scn.nextInt();//напишіть тут ваш код
        int number2 = scn.nextInt();
        int number3 = scn.nextInt();
        if (number1 == number2 && number1 == number3) {
            System.out.println(number1 + " " + number2 + " " + number3);
        } else if (number1 == number2) {
            System.out.println(number1 + " " + number2);
        } else if (number1 == number3) {
            System.out.println(number1 + " " + number3);
        } else if (number2 == number3) {
            System.out.println(number2 + " " + number3);
        }
    }
}
