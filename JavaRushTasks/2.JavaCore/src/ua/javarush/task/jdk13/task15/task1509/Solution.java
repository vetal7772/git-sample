package ua.javarush.task.jdk13.task15.task1509;

/* 
Дефолтні значення
*/

public class Solution {

       public  int intVar;
        double doubleVar;
        Double DoubleVar;
        boolean booleanVar;
        Object ObjectVar;
        Exception ExceptionVar;
        String StringVar;

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);

    }
}
