package ua.javarush.task.jdk13.task34.task3401;

/* 
Числа Фібоначчі за допомогою рекурсії
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.fibonacci(-9));     //34
        System.out.println(solution.fibonacci(5));     //5
        System.out.println(solution.fibonacci(2));     //1
        System.out.println(solution.fibonacci(1));     //1
    }

    public int fibonacci(int n) {
        if (n <= 0) {
            System.out.println("Incorrrect input");
            return 0;
        } else if (n == 2 || n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);

        }

    }
}