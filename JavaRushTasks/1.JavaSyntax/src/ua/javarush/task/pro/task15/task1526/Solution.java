package ua.javarush.task.pro.task15.task1526;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

/* 
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in);
             FileReader fileReader = new FileReader(scn.nextLine());
             BufferedReader reader = new BufferedReader(fileReader)) {
            while (reader.ready()) {
                String line = reader.readLine();
                //   String[] editLine = line.split(" ");
                StringTokenizer tokenizer = new StringTokenizer(line, " .,");
                while (tokenizer.hasMoreTokens()) {
                    System.out.print(tokenizer.nextToken());
                }
            }
//            while (reader.ready()) {
//                char ch = (char) reader.read();
//                if (ch != ' ' && ch != '.' && ch != ',') {
//                    System.out.print(ch);
//                }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}