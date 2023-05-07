package ua.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успішність студентів
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Bill Gates",4.2);
        grades.put("John Smith", 3.8);
        grades.put("John James", 3.3);
        grades.put("John Hendrics", 3.4);
        grades.put("Johny Depp", 4.3);
    }
}
