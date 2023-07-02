package ua.javarush.task.jdk13.task34.task3402;

/* 
Факторіал за допомогою рекурсії
*/

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

       System.out.println(solution.factorial(9));     //362880
//        System.out.println(solution.factorial(0));     //1
//        System.out.println(solution.factorial(1));     //1
    }

    public int factorial(int n) {
        int result = 1;
        if (n == 0 || n == 1) {
            return result;
        }

        result *= n * factorial(n - 1);
        System.out.println(result);
        return result;
    }
}
