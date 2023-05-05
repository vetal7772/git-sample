package ua.javarush.task.pro.task15.task1538;

import java.nio.file.Path;
import java.nio.file.Paths;

/* 
Використання Paths
*/

public class Solution {

    public static Path rpmLogPath;

    public static void main(String[] args) {
        String fileName = "/usr/lib/rpm/rpm.log";
        rpmLogPath = Paths.get(Path.of(fileName).toAbsolutePath().toUri());

    }
}
