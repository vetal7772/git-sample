package ua.javarush.task.pro.task14.task1417;

/* 
Валідатор дати
*/

import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи дату у форматі dd.mm.yyyy : ");
        String date = scanner.nextLine();
        validateDate(date);
        System.out.println("\nДата коректна.");
    }

    public static void validateDate(String date) {
        checkDateFormat(date);
        checkYearValue(date);
        checkMonthValue(date);
        checkDayValue(date);
    }

    public static void checkDateFormat(String date) {

        if (!date.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InvalidDateFormatException();
        }
//        if (date.charAt(2)!='.'||date.charAt(5)!='.'){
//            throw new InvalidDateFormatException();
//        }
//        if (!Pattern.matches("\\d+",date.substring(0,2))){
//            throw new InvalidDateFormatException();
//        }
//        if (!Pattern.matches("\\d+",date.substring(3,5))){
//            throw new InvalidDateFormatException();
//        }
//        if (!Pattern.matches("\\d+",date.substring(6))){
//            throw new InvalidDateFormatException();
//        }
    }

    public static void checkYearValue(String date) {
        int year = Integer.parseInt(date.substring(6));
        if (year < 1900 || year > 2100) {
            throw new InvalidYearValueException();
        }
    }

    public static void checkMonthValue(String date) {
        int month = Integer.parseInt(date.substring(3, 5));
        if (month < 1 || month > 12) {
            throw new InvalidMonthValueException();
        }
    }

    public static void checkDayValue(String date) {
        HashMap<Integer, Integer> months = new HashMap<>() {{
            put(1, 31);
            put(2, 29);
            put(3, 31);
            put(4, 30);
            put(5, 31);
            put(6, 30);
            put(7, 31);
            put(8, 31);
            put(9, 30);
            put(10, 31);
            put(11, 30);
            put(12, 31);
        }};
        String[] split = date.split("\\.");
        int day = Integer.parseInt(split[0]);
        int month = Integer.parseInt(split[1]);
        int daysInMonth = months.get(month);
        if (day < 1 || day > daysInMonth) {
            throw new InvalidDayValueException();
        }
        //не брав валідатор
//        int month = Integer.parseInt(date.substring(3, 5));
//        int day = Integer.parseInt(date.substring(0, 2));
//        int daysInMonth = months.get(month);
//        if (daysInMonth < day || day < 1) {
//            throw new InvalidDayValueException();

    }
}
