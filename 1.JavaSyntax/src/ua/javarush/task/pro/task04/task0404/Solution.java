package ua.javarush.task.pro.task04.task0404;

/* 
Заповнений прямокутник
*/

public class Solution {
    public static void main(String[] args) {
        int high = 5;
        while (high > 0) {
            int width = 10;//напишіть тут ваш код
            while (width > 0) {
                System.out.print("Q");
                width--;
            }
            System.out.println();
            high--;
        }
    }
}