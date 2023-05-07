package ua.javarush.task.pro.task09.task0918;

/* 
Попрацюймо зі StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "Навчатися, навчатися і ще раз навчатися! ";

        System.out.println(addTo(string, new String[]{"Під ", "лежачий ", "камінь ", "вода ", "не ", "тече"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder sb = new StringBuilder(string);
        for (String str: strings){
            sb.append(str);
        }
        return sb;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder sb = new StringBuilder(string);

        return sb.replace(start,end,str);
    }
}
