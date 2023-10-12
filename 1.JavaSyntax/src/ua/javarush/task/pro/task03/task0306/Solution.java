package ua.javarush.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Трикутник
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "трикутник існує";
    private static final String TRIANGLE_NOT_EXISTS = "трикутник не існує";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int side1 = scn.nextInt();
        int side2 = scn.nextInt();
        int side3 = scn.nextInt();

        if (side1 < side2 + side3 && side2 < side1 + side3 && side3 < side1 + side2) {
            System.out.println(TRIANGLE_EXISTS);
        } else {
            System.out.println(TRIANGLE_NOT_EXISTS);
        }
    }
}
