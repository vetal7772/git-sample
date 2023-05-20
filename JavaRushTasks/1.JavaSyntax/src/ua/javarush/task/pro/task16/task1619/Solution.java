package ua.javarush.task.pro.task16.task1619;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/* 
Простий шаблон
*/

public class Solution {

    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {

        //LocalDateTime time = LocalDateTime.of(2020, Month.MARCH, 19, 5, 4);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyyр. Hг.mхв");
        String text = dtf.format(localDateTime);
        System.out.println(text);
    }
}
