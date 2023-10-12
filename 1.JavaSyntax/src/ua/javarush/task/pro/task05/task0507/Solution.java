package ua.javarush.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Максимальне з N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        array = new int[size];
        while (size>0){
            for (int i = 0; i < array.length; i++) {
                array[i] = scn.nextInt();
                size--;
            }
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
}
