package ua.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Підсумовування

???не розумію чому incorect input неправильно працює

*/

public class Solution {


    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int result = 0;

        while (scn.hasNext()) {
            // String line = scn.nextLine();
            if (scn.hasNextInt()) {
                int number = scn.nextInt();
                result += number;
            } else if (scn.hasNextLine()) {
                // String str = scn.nextLine();
                if (scn.nextLine().equals("ENTER")) {
                    break;
                } else {
                    System.out.println("Incorrect input");
                    continue;
                }
            }



        }
        System.out.println(result);
    }
}

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int sum = 0;
//        boolean isExit = false;
//        while (!isExit) {
//            if (scanner.hasNextInt()) {
//                int number = scanner.nextInt();
//                sum = sum + number;
//            } else if (scanner.hasNextLine()) {
//                String line = scanner.nextLine();
//                if (line.equals("ENTER")) {
//                    isExit = true;
//                }
//            }
//        }
//        System.out.println(sum);
//    }
//}

//public class Solution {   Мій перший правильний
//
//
//    public static void main(String[] args) {
//
//        Scanner scn = new Scanner(System.in);
//
//        int sum = 0;
//        int result = 0;
//
//        while (scn.hasNextLine()) {
//            String line = scn.nextLine();
//            if (line.equals("ENTER")) {
//                break;
//            } else {
//                int number = Integer.parseInt(line);
//                result += number;
//            }
//        }
//        System.out.println(result);
//    }
//}