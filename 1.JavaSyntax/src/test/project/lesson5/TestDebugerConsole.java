package test.project.lesson5;

import java.util.Scanner;

public class TestDebugerConsole {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        int number =scanner.nextInt();
        String result="";
        if (number%2==0){
            result+="Число кратне 2; ";
        }
        if (number%3==0){
            result+="Число кратне 3; ";
        }
        if (number%5==0){
            result+="Число кратне 5; ";
        }
        if (number%10==0){
            result+="Число кратне 10; ";
        }

        System.out.println(result);
    }
}
