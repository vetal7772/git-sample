package ua.javarush.task.pro.task15.task1524;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/* 
Переплутані байти
*/

public class Solution {
    public static void main(String[] args) {
//        String file1Path = null;
//        String file2Path = null;
//        Scanner scn = new Scanner(System.in);
//        file1Path = scn.nextLine();
//        file2Path = scn.nextLine();
        try (Scanner scn = new Scanner(System.in);
             FileInputStream fis = new FileInputStream(scn.nextLine());
             FileOutputStream fos = new FileOutputStream(scn.nextLine())) {
            byte[] bufferIn = fis.readAllBytes();
            byte[] bufferOut = new byte[bufferIn.length];
            for (int i = 0; i < bufferIn.length; i = i + 2) {
                if (i < bufferIn.length - 1) {
                    bufferOut[i] = bufferIn[i + 1];
                    bufferOut[i + 1] = bufferIn[i];
                } else {
                    bufferOut[i] = bufferIn[i];
                }
            }
            fos.write(bufferOut);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }


    }
}