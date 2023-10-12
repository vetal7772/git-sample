package test.project.lesson6;

import java.util.Random;
import java.util.Scanner;

public class TestFor1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int minPassword = 8;
        int maxPassword = 20;
        String password = "";

        int passwordSize = scn.nextInt();
        if (passwordSize >= minPassword && passwordSize <= maxPassword) {
            int startSymbol = 0;
            while (startSymbol<passwordSize){

                password += (char) (rnd.nextInt(250) + 60);
                startSymbol++;
            }
        } else {
            System.out.println("Incorrect input");
        }

        System.out.println("password is "+password);
    }
}


//public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        Random rnd = new Random();
//        int minPassword = 8;
//        int maxPassword = 20;
//        String password = "";
//
//        int passwordSize = scn.nextInt();
//        if (passwordSize >= minPassword && passwordSize <= maxPassword) {
//            for (int i = 0; i < passwordSize; i++) {
//                password += (char) (rnd.nextInt(250) + 60);
//            }
//        } else {
//            System.out.println("Incorrect input");
//        }
//
//        System.out.println("password is "+password);
//    }
