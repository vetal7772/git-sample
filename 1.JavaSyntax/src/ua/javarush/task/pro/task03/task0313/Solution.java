package ua.javarush.task.pro.task03.task0313;

public class Solution {
    public static String string1 = "Аміго";
    public static String string2 = string1;
    public static String string3 = new String(string1);

    public static void main(String[] args) {
        String same = "посилання на рядки однакові";
        String different = "посилання на рядки різні";
        if (string1 == string2) {//напишіть тут ваш код
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string2 == string3) {//напишіть тут ваш код
            System.out.println(same);
        } else {
            System.out.println(different);
        }
        if (string1 == string3) {//напишіть тут ваш код
            System.out.println(same);
        } else {
            System.out.println(different);
        }
    }
}