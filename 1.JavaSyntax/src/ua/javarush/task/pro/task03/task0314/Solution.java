package ua.javarush.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Поламана клавіатура
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); //напишіть тут ваш код
        String input = scn.nextLine();
        if (secret.equalsIgnoreCase(input)) {
            System.out.println("доступ дозволено");
        } else {//напишіть тут ваш код
            System.out.println("доступ заборонено");
        }
    }
}
