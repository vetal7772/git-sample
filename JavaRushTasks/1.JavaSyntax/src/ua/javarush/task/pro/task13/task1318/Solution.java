package ua.javarush.task.pro.task13.task1318;

/* 
Наступний місяць, будь ласка
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        if (month.ordinal() == 11) {
            return Month.values()[0];
        } else {
            return Month.values()[index + 1];
        }
    }
}

