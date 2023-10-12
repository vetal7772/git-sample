package ua.javarush.task.pro.task03.task0301;

import java.util.Scanner;

/* 
Тепло чи холодно
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "на вулиці холодно";
        String warm = "на вулиці тепло";
        Scanner scn = new Scanner(System.in);
        int temperature = scn.nextInt();
        if (temperature >= 0) {
            System.out.println(warm);
        } else {
            System.out.println(cold);
        }
        //напишіть тут ваш код
    }
}
