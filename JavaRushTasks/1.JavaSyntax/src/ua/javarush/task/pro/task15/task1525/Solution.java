package ua.javarush.task.pro.task15.task1525;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/* 
Щось не копіюється...
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scanner.nextLine());
             FileOutputStream fos = new FileOutputStream(scanner.nextLine())) {
            byte[] buffer = new byte[1024];
            while (fis.available() > 0) {
                int read = fis.read(buffer);
                fos.write(buffer, 0, read);
            }
        } catch (Exception e) {
            System.out.println("Something went wrong : " + e);
        }
    }
}