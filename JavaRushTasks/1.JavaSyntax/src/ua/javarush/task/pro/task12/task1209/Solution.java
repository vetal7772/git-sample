package ua.javarush.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Бухгалтерія
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();


    public static void initEmployees() {
        waitingEmployees.add("Гвінно");
        waitingEmployees.add("Гунігерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Ніфрод");
        waitingEmployees.add("Альбіуф");
        waitingEmployees.add("Іногрім");
        waitingEmployees.add("Фріле");
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary("Фріле");
    }

    public static void paySalary(String name) {
        if(waitingEmployees.contains(name)&&!alreadyGotSalaryEmployees.contains(name)) {
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    alreadyGotSalaryEmployees.add(name);
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
