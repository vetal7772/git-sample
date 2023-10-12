package ua.javarush.task.jdk13.task06.task0634;

import java.util.Scanner;

/* 
Шахівниця
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        array = new char[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print( array[i][j] = '#');
                } else {
                    System.out.print(array[i][j] = ' ');
                }
            }
            System.out.println();
        }

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[0].length; j++) {
//                System.out.print(array[i][j]);
//            }
//            System.out.println();
//        }


    }
}

