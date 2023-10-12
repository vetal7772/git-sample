package ua.javarush.task.jdk13.task06.task0632;


import java.io.IOException;
import java.util.Scanner;

/* 
Піраміда
*/

public class Solution {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        array = new char[number][2 * number - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (j < array.length - i - 1 || j > array[0].length - array.length + i) {
                    System.out.print(array[i][j] = ' ');
                } else {
                    System.out.print(array[i][j] = '#');
                }
            }
            System.out.println();
        }
    }
}
