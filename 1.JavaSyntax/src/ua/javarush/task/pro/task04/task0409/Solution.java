package ua.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Мінімум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while (scn.hasNextInt()) {
            int res = scn.nextInt();
            if (res < min) {
                min = res;
            }
        }
        System.out.println(min);


    }
}