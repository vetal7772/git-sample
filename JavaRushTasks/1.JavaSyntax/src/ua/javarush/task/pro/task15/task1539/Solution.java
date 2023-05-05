package ua.javarush.task.pro.task15.task1539;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/* 
Використання Paths 2
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(joinToPath(Arrays.asList("d:/", "study/", "javarush/", "корисні шматки коду.txt")));
    }

    public static Path joinToPath(List<String> partsList) {
        String[] partsArray = new String[partsList.size()-1];
        System.arraycopy(partsList.toArray(), 1, partsArray, 0, partsArray.length);
        System.out.println(Arrays.deepToString(partsArray));
        return Paths.get(partsList.get(0), partsArray);


      // sb = new StringBuilder();
      //  Path path=null;

          //  Path path = Path.of(sb.toString());
    //        Path path = Paths.get(String.valueOf(sb));
     //   Path path = Path.of(System.getProperty("user.home"),"documents", "document.txt");


      //  return path;
    }
}
