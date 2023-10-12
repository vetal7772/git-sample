package ua.javarush.task.pro.task04.task0414;

import java.util.Scanner;

/* 
Хорошого забагато не буває
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);//напишіть тут ваш код
        String line = scn.nextLine();
        int number = scn.nextInt();

        if (number <= 0 || number >= 5) {
            System.out.println(line);
        } else {
            do {
                System.out.println(line);
                number--;
            } while (number > 0);
        }
    }
}