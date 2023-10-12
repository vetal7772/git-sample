package ua.javarush.task.pro.task06.task0608;

/* 
Кубічний калькулятор
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(5));
    }

    public static long cube(long number) {
long result = (long) Math.pow(number,3);
return result;
    }
}

