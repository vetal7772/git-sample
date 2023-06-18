package ua.javarush.task.pro.task15.task1508;

import java.io.*;
import java.util.Scanner;

/* 
Читаємо з консолі
*/

public class Solution {
    public static void main(String[] args)  {
        try (
                InputStream stream = System.in;
                InputStreamReader reader = new InputStreamReader(stream);
                BufferedReader buff = new BufferedReader(reader)){


            char[] chars = buff.readLine().toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if (i % 2 == 1) {
                    System.out.print(String.valueOf(chars[i]).toUpperCase());
                } else {
                    System.out.print(String.valueOf(chars[i]).toLowerCase());
                }
            }
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}

