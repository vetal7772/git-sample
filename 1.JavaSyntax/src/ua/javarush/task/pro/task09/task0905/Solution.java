package ua.javarush.task.pro.task09.task0905;

import java.util.regex.Pattern;

/* 
Вісімковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 375;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює вісімковому числу " + toOctal(decimalNumber));
        int octalNumber = 467;
        System.out.println("Вісімкове число " + octalNumber + " дорівнює десятковому числу " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        int octal = 0;
        if (decimalNumber <= 0) {
            return octal;
        }

        int i = 0;
        while (decimalNumber != 0) {
            octal = (int) (octal + (decimalNumber % 8) * (Math.pow(10, i++)));
            decimalNumber = decimalNumber / 8;

        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        int decimal = 0;
        if (octalNumber <= 0) {
            return decimal;
        }

        int i = 0;
        while (octalNumber != 0) {
            decimal = (int) (decimal + octalNumber % 10 * (Math.pow(8, i++)));
       octalNumber = octalNumber / 10;
        }
        return decimal;
    }
}

//    public static int toOctal(int decimalNumber) {
//        int i =0;
//        while (decimalNumber!=0){
//
//            int octal = Integer.parseInt(Integer.toOctalString(decimalNumber));
//            return octal;
//        }
//        return 0;
//    }
//
//    public static int toDecimal(int octalNumber) {
//        int i = 0;
//        while (octalNumber!=0){
//            String octalString=String.valueOf(octalNumber);
//            int decimal = Integer.parseInt(octalString,8);
//            return decimal;
//        }
//        return 0;
//    }