package ua.javarush.task.pro.task03.task0311;

import java.util.Scanner;

/* 
Висока точність
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double number1 = scn.nextDouble();
        double number2 = scn.nextDouble();

        if (Math.abs(number1 - number2) < 0.000001) //напишіть тут ваш код
        {
            System.out.println("числа рівні");
        } else//напишіть тут ваш код
        {
            System.out.println("числа не рівні");
        }
    }
}
