package ua.javarush.task.jdk13.task06.task0637;

import java.io.IOException;
import java.util.Arrays;

/* 
Прямокутник
*/

public class Solution {
    public static char[][] array = new char[5][6];

    public static void main(String[] args) {
        Arrays.fill(array[0], 'X');
        Arrays.fill(array[1], 'X');
        Arrays.fill(array[1], 1, 5, ' ');
        Arrays.fill(array[2], 'X');
        Arrays.fill(array[2], 1, 5, ' ');
        Arrays.fill(array[3], 'X');
        Arrays.fill(array[3], 1, 5, ' ');
        Arrays.fill(array[4], 'X');
    }
}


// while (height > 0) {
//            Arrays.fill(array[height - 1], 'X');
//            if (height < 5 && height > 1) {
//                Arrays.fill(array[height - 1], 1, 5, ' ');
//            }
//            height--;
//        }                    output:
//[X, X, X, X, X, X]
//[X,  ,  ,  ,  , X]
//[X,  ,  ,  ,  , X]
//[X,  ,  ,  ,  , X]
//[X, X, X, X, X, X]
//

//                    Arrays.fill(array, 'X');
//        if (height < 1 || height > array.length - 2) {
//                }
//                if (width < 1 || width > array[0].length - 2) {
//                    Arrays.fill(array, 'X');
//                }


//

//        for (char[] ch : array) {
//            System.out.println(Arrays.toString(ch));
//
//        }


