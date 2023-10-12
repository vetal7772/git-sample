package ua.javarush.task.pro.task04.task0413;

/* 
Креслимо трикутник
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }

            System.out.println();
        }

    }
}

//    int width=10;
//    int height =10;
//        for (int i = 0; i < height; i++) {
//        for (int j = width-i-1; j < width; j++) {
//        System.out.print("8");
//        }
//        System.out.println();
//        }