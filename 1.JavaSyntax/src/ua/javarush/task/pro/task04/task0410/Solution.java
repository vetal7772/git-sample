package ua.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Друге мінімальне число серед уведених
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min1 = scn.nextInt();
        int min2 = scn.nextInt();
        int tmp;
        if (min2 < min1) {
            tmp = min1;
            min1 = min2;
            min2 = tmp;
        }
        while (scn.hasNextInt()) {
            tmp = scn.nextInt();
            if (tmp < min1) {
                min2 = min1;
                min1 = tmp;

            } else if (tmp > min1 && tmp < min2) {
                min2 = tmp;
            }
        }
        System.out.println(min2);
//        System.out.println(min1);
    }
}