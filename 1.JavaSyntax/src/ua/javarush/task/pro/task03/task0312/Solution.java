package ua.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Порівняймо рядки
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String line1 = scn.nextLine();
        String line2 = scn.nextLine();
        if (line1.equals(line2)) {
            System.out.println("рядки однакові");
        } else {//напишіть тут ваш код
            System.out.println("рядки різні");
        }
    }
}