package ua.javarush.task.jdk13.task35.task3509;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Wildcards для колекцій
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static Double sum(List<? extends Number> list) {
        Double result = 0.0;
        for (int i = 0; i < list.size(); i++) {  //або без приведення типів як нижче
            Number numb = (Number) list.get(i);
            result += numb.doubleValue();
        }
        return result;
    }

    public static Double multiply(List<? extends Number> list) {
        Double result = 1.0;
        for (Number num : list) {
            result *= num.doubleValue();
        }
        return result;
    }

    public static String concat(List<? extends Object> list) {  // або <?>
        StringBuilder builder = new StringBuilder();
        for (Object obj : list) {
            builder.append(obj);
        }
        return builder.toString();
    }

    public static List combine(List<? extends Collection> list) {
        List result = new ArrayList<>();
        for (Collection collection : list) {
            result.addAll(collection);
        }
        return result;
    }
}
