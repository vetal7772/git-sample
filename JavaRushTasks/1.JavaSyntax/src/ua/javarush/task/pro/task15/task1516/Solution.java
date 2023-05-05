package ua.javarush.task.pro.task15.task1516;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/* 
Файл чи директорія
*/

public class Solution {

    private static final String THIS_IS_FILE = " - це файл";
    private static final String THIS_IS_DIR = " - це директорія";

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String line = scn.nextLine();
            if (line.isEmpty()) {
                break;
            }
            Path path = Path.of(line);

            if (Files.isDirectory(path)) {
                System.out.println(line + THIS_IS_DIR);
            } else if (Files.isRegularFile(path)) {
                System.out.println(line + THIS_IS_FILE);
            } else {
                break;

            }
        }
        scn.close();
    }
}

