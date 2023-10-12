package ua.javarush.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Площа круга
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int radius = scn.nextInt();
       double pi = 3.14;
       int square = (int) Math.floor( pi * radius * radius);
        System.out.println(square);
    }
}