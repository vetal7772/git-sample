package ua.javarush.task.jdk13.task15.task1512;

/* 
Порядок завантаження змінних
*/

public class Solution {

    static {
        init();
    }

    public static void init() {
        System.out.println("static void init()");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public int i = 6;

    public String name = "First name";


    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");

        System.out.println(obj.i);
        System.out.println(obj.name);
    }
}
