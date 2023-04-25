package ua.javarush.task.pro.task15.task1530;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

/* 
Байти у символи
*/

public class Solution {

    public static void main(String[] args) {
        ByteArrayInputStream stream = new ByteArrayInputStream("O sole, o sole mio!\nSta 'nfronte a te!\n Sta 'nfronte a te!".getBytes(StandardCharsets.UTF_8));
        System.out.println(new String(bytesToChars(stream, 38)));
    }

    public static char[] bytesToChars(ByteArrayInputStream stream, int n) {
        int minLength = Math.min(n, stream.available());
        char[] inputChar = new char[minLength];

        for (int i = 0; i < inputChar.length; i++) {
            inputChar[i] = (char) stream.read();
        }

        return inputChar;
    }
}
