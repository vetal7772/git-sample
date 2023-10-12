package ua.javarush.task.pro.task05.task0505;

import java.util.Arrays;
import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int arrsSize = scn.nextInt();
        int[] arr = new int[arrsSize];
        if (arrsSize > 0) {
            int size = arrsSize;
            while (size > 0) {
                for (int i = 0; i < arrsSize; i++) {
                    arr[i] = scn.nextInt();
                    size--;
                }
            }
        }
        if (arrsSize%2!=0){
            for (int i = 0; i < arrsSize; i++) {
                System.out.println(arr[i]);
            }
        }else {
            for (int i = arrsSize-1; i >=0 ; i--) {
                System.out.println(arr[i]);
            }
        }
//        System.out.println(arr.toString());
//        System.out.println(Arrays.toString(arr));
    }
}
