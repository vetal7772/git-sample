package ua.javarush.task.pro.task09.task0906;

import java.util.regex.Pattern;

/* 
Двійковий конвертер
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MIN_VALUE;
        System.out.println("Десяткове число " + decimalNumber + " дорівнює двійковому числу " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Двійкове число " + binaryNumber + " дорівнює десятковому числу " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        String binary="";
        if (decimalNumber<=0){
            return binary;
        }
        while (decimalNumber!=0){
            binary = decimalNumber%2 +binary;
            decimalNumber = decimalNumber /2;
        }//напишіть тут ваш код
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        int decimal = 0;
        if (binaryNumber==null||binaryNumber==""){
            return decimal;
        }
        for (int i = 0; i < binaryNumber.length(); i++) {
            decimal = decimal + (Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length()-i-1)))) * (int)Math.pow(2,i);
        }
        return decimal;
    }
}
