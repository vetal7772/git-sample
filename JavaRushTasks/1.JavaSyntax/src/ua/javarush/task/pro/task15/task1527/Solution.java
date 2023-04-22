package ua.javarush.task.pro.task15.task1527;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/* 
Пропускаємо не всіх
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in);
             FileReader fileReader = new FileReader(scn.nextLine());
             BufferedReader reader = new BufferedReader(fileReader)) {
            int counter = 0;
//            String[] lineString = new String[128];
            while (reader.ready()) {
                String line = reader.readLine();
                if (counter % 2 == 0) {
                    System.out.println(line);
                }
                counter++;
            }
//                for (int i = 1; i <lineString.length; i++) {
//                    lineString[i] = reader.readLine();
//                }
//            }
//            for (int i = 1; i < lineString.length; i += 2) {
//                System.out.println(lineString[i]);
            //          }
        } catch (IOException ex) {
            ex.getStackTrace();
        }
    }

}
