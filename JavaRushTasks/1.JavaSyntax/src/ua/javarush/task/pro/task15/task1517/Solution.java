package ua.javarush.task.pro.task15.task1517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файлові операції
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        Path filePath = Path.of(scanner.nextLine());
        Path fileNewPath = Path.of(scanner.nextLine());
        if (!Files.exists(filePath)) {  //Files.notExists  можна і так
            Files.createFile(filePath);
        } else if (Files.exists(filePath)) {
            if (Files.notExists(fileNewPath)) {
                Files.move(filePath, fileNewPath);
            } else {
                Files.delete(filePath);
            }
        }
    }
}

