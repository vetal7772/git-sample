package ua.javarush.task.jdk13.task35.task3507;

import java.util.*;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
    }

    public static <T> ArrayList<T> newArrayList(Object... elements) {
        ArrayList<T> result = new ArrayList<>();
        // Collections.addAll(list, elements);   можна і так, тоді й в параметрах (T... elements)
        for (Object elem : elements) {
            result.add((T) elem);
        }
        return result;
    }



    public static <T> HashSet<T> newHashSet(T... elements) {
        HashSet<T> set = new HashSet<>();
        Collections.addAll(set, elements);
        return set;
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        HashMap<K, V> result = new HashMap<>();
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException();
        } else {
            for (int i = 0; i <= keys.size() - 1; i++) {
                result.put((K) keys.get(i), (V) values.get(i));
            }
            return result;
        }
    }
}

//    public static <E> void addAll(List<E> list, E... array) {
//
//        for (E element : array) {
//            list.add(element);
//        }
//    }