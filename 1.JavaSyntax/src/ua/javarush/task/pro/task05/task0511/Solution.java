package ua.javarush.task.pro.task05.task0511;

import java.util.Scanner;

/* 
Створюємо двовимірний масив
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rawNumber = scn.nextInt();
        multiArray = new int[rawNumber][];
        for (int i = 0; i < multiArray.length; i++) {
            int rawLength = scn.nextInt();
            multiArray[i] = new int[rawLength];
        }
    }
}