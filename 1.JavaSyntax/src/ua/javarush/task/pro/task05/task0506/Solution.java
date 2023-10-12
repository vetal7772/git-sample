package ua.javarush.task.pro.task05.task0506;

import java.util.Arrays;
import java.util.Scanner;

/* 
Мінімальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
         array = new int[size];


        while (size > 0) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scn.nextInt();
                size--;
            }
        }

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
        //System.out.println(Arrays.toString(array));
    }
}

