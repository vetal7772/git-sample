package ua.javarush.task.jdk13.task06.task0625;

import java.util.Scanner;

/* 
Мінімальна сума
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int minSum = Integer.MAX_VALUE;

        // сума за рядками
        for (int j = 0; j < array[0].length; j++) {
            int currentSum = 0;
            for (int i = 0; i < array.length; i++) {
                currentSum += array[i][j];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        // сума за стовпцями
        for (int i = 0; i < array.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < array[i].length; j++) {
                currentSum += array[i][j];
            }
            if (currentSum < minSum) {
                minSum = currentSum;
            }
        }

        System.out.println(minSum);
    }
}

// for (int i = 0; i < array.length; i++) {
//            int sumRow = 0;
//            for (int j = 0; j < array[i].length; j++) {
//
//                sumRow += array[i][j];
//                if (sumRow < minSum) {
//                    minSum = sumRow;
//                }
//            }
//        }
//        for (int j = 0; j < array[0].length; j++) {
//            int sumColumn = 0;
//            for (int i = 0; i < array.length; i++) {
//
//                sumColumn += array[j][i];
//                if (sumColumn < minSum) {
//                    minSum = sumColumn;
//                }
//            }
//        }