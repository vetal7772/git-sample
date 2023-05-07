package ua.javarush.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Понеділок"));
        System.out.println(getTranslationForDayOfWeek("П'ятниця"));
        System.out.println(getTranslationForDayOfWeek("Нічогонеділя"));
    }

    public static String getTranslationForDayOfWeek(String ua) {
        String en;
        String transl = ua.toLowerCase();
        if (transl.equals("понеділок")) {
            en = "Monday";
        } else if (transl.equals("вівторок")) {
            en = "Tuesday";
        } else if (transl.equals("середа")) {
            en = "Wednesday";
        } else if (transl.equals("четвер")) {
            en = "Thursday";
        } else if (transl.equals("п'ятниця")) {
            en = "Friday";
        } else if (transl.equals("субота")) {
            en = "Saturday";
        } else if (transl.equals("неділя")) {
            en = "Sunday";
        } else {
            en = "Неприпустимий день тижня";
        }
        return en;
    }
}
