package ua.javarush.task.jdk13.task06.task0624;

import java.util.Scanner;

/* 
Максимальний елемент
*/

public class Solution {
    public static int[][] array = new int[3][3];

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int maxElem = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j]=scn.nextInt();
            if(array[i][j]>maxElem){
                maxElem = array[i][j];
            }
            }
        }
        System.out.println(maxElem);
    }
}
