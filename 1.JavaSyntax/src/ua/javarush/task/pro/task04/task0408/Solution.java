package ua.javarush.task.pro.task04.task0408;

import java.util.Scanner;

/* 
Максимум серед уведених чисел
*/

public class Solution {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);
       int max = Integer.MIN_VALUE;
       while (scn.hasNextInt()){
           int number = scn.nextInt();
           if ((number%2==0)&&number>max){
               max=number;
           }
       }
        System.out.println(max);
    }
}