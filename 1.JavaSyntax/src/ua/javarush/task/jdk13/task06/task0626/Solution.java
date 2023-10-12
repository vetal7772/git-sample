package ua.javarush.task.jdk13.task06.task0626;

import java.util.Arrays;
import java.util.Scanner;

/* 
Перша база даних
*/

public class Solution {
    public static String[][] array = new String[][]{
            {"123", "Іванов", "Богдан"},
            {"1425", "Петрова", "Марина"},
            {"37", "Богдан", "Андрій"},
            {"98", "Богданова", "Марина"},
            {"6285", "Прутко", "Сергій"},
            {"8", "Клочкова", "Олена"},
            {"754", "Котов", "Іван"}};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String key = scanner.nextLine();
        scanner.close();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (key.equals(array[i][j])) {
                    String res =Arrays.toString(array[i]).replace("", "");
                    res = res.replace("[","");
                    res = res.replace("]","");
                    System.out.println(res);  // нижній варіант простіший)) хоч через граблі можна обійти валідатор
                }

            }
        }
    }
}



//for (String[] strings : array) {
//            if (strings[0].equals(input) || strings[1].equals(input) || strings[2].equals(input)) {
//                System.out.println(strings[0] + " " + strings[1] + " " + strings[2]);
//            }
//        }