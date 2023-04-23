package ua.javarush.task.pro.task15.task1528;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

/* 
Пишемо байти у файл
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            byte[] bytes = {106, 97, 118, 97};
            fos.write(bytes);
        } catch (IOException e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}