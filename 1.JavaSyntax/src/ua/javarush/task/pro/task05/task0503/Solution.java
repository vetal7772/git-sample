package ua.javarush.task.pro.task05.task0503;

/* 
Працюємо з елементами масиву
*/

public class Solution {

    public static int[] array = new int[]{-1, 2, 3, -4, -5};

    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = -array[i];
            }
        }//напишіть тут ваш код
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }
}

//{
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 == 0) {
//                array[i] = -array[i];
//            }
//        }/