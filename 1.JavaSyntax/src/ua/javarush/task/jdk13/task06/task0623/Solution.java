package ua.javarush.task.jdk13.task06.task0623;

/* 
Знайомство з двовимірним масивом
*/

public class Solution {
    public static int[][] array = {{22,33,44}, {55,66,77}};//напишіть тут ваш код
//{{22,33},{44,55},{66,77}} - it 3x2
    public static void main(String[] args) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }
    }
}
