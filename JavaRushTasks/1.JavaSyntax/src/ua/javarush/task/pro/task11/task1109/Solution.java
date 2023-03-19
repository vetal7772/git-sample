package ua.javarush.task.pro.task11.task1109;

/* 
Об'єкти внутрішніх і вкладених класів
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested();
        Outer.Inner inner = new Outer().new Inner();
    }
}
