package ua.javarush.task.jdk13.task06.task0627;

import java.util.Arrays;
import java.util.Scanner;

/* 
Оце так переворот!
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array[0].length; j++) {
                int tmp=array[j][i];
                    array[j][i] = array[i][j];
                array[i][j]=tmp;

            }
        }

//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = i + 1; j < array[0].length; j++) {
//                int temp = array[i][j];
//                array[i][j] = array[j][i];
//                array[j][i] = temp;
//            }
//        }

        for (int[] ints : array) {
            String delimeter = "";
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(delimeter + ints[j]);
                delimeter = " ";
            }
            System.out.println();
        }
    }
}

// for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                int tmp=array[j][i];
//                    array[j][i] = array[i][j];
//                array[i][j]=tmp;
//
//            }
//        }
//        for (int[] number : array) {
//            System.out.println(Arrays.toString(number));
//        }