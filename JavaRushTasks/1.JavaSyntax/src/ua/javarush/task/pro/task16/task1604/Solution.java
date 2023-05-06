package ua.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
День тижня твого народження
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1975,Calendar.OCTOBER, 7);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result="";
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        Date date = calendar.getTime();
      int calend = date.getDay();

      //  int day = calendar.get(Calendar.DAY_OF_WEEK); Щоб не використовувати клас Date

        switch (calend){
            case 0: result = "Неділя";
            break;
            case 1: result= "Понеділок";
            break;
            case 2: result= "Вівторок";
            break;
            case 3: result ="Середа";
            break;
            case 4: result ="Четвер";
            break;
            case 5: result ="П'ятниця";
            break;
            case 6: result= "Субота";
            break;
        }
        return result;
    }
}
