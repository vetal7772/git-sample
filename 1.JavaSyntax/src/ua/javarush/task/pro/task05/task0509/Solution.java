package ua.javarush.task.pro.task05.task0509;

/* 
Таблиця множення
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                MULTIPLICATION_TABLE[i-1][j-1] = i*j;
                System.out.print(MULTIPLICATION_TABLE[i-1][j-1]);
                System.out.print(" ");
            }
            System.out.println();
                   }


        }
    }

//for (int i = 1; i <MULTIPLICATION_TABLE.length; i++) {
//            for (int j = 1; j <MULTIPLICATION_TABLE[i].length; j++) {
//                System.out.print(MULTIPLICATION_TABLE[i][j] + " ");
//            }
//            System.out.println();
//        }

