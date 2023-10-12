package ua.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int numberOfCoke = scn.nextInt();
        int numberOfStaff = scn.nextInt();
        String test = scn.nextLine();
        double result = numberOfCoke * 1.0 / numberOfStaff;
        System.out.println(result);
        System.out.println(test);

    }
}