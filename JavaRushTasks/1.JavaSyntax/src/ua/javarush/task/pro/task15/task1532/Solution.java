package ua.javarush.task.pro.task15.task1532;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* 
Шифр
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        System.out.println(encrypt("abcdefghi"));
    }

    public static ByteArrayOutputStream encrypt(String message) throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte[] bytes = message.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        for (int i = 0; i < length / 2; i++) {
            outputStream.write(bytes[i]);
            outputStream.write(bytes[length - i - 1]);
        }
        if (length % 2 == 1) {
            outputStream.write(bytes[length / 2]);
        }

//        byte[] result = outputStream.toByteArray();
//        int size= result.length;
//        byte[] newResult = new byte[result.length];
//        for (int i = 0; i < result.length; i+=2) {
//            newResult[i]=result[i];
//            newResult[size-1-i]=result[i+1];
//
//        }
//        System.out.println(Arrays.toString(newResult));

        return outputStream;
    }
}
