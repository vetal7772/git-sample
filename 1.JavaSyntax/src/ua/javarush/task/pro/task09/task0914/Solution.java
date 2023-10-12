package ua.javarush.task.pro.task09.task0914;

/* 
Оновлення шляху
*/

public class Solution {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int firstIndex = path.indexOf("jdk");
        int lastIndex = path.indexOf("/", firstIndex);
        String oldJdk = path.substring(firstIndex, lastIndex);

        return path.replace(oldJdk, jdk);
    }
}

//  int beginIndex = path.indexOf("jdk");
//        int lastIndex = path.lastIndexOf("/");
//        String subPath1 = path.substring(0,beginIndex);
//        String subPath2 = path.substring(lastIndex);
//        String newPath = subPath1+jdk+subPath2;
//        return newPath;