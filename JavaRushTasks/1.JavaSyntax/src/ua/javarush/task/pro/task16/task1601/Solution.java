package ua.javarush.task.pro.task16.task1601;

import java.util.Calendar;
import java.util.Date;

/* 
Аби не в понеділок:)
*/

public class Solution {

    static Date birthDate=new Date(75,Calendar.OCTOBER,7);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Date date) {
                String result = "";

        int day = date.getDay();
        switch (day) {
            case 0:
                return "неділя";
            case 1:
                return "понеділок";
            case 2:
                return "вівторок";
            case 3:
                return "середа";
            case 4:
                return "четвер";
            case 5:
                return "п'ятниця";
            case 6:
                return "субота";
        }

       // String editBirthDate = birthDate.toLocaleString();
        return result;
    }
}
