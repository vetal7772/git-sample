package ua.javarush.task.pro.task13.task1325;

import java.util.*;

/* 
Телефонна книга
*/
// не зробив - почитати про Navigable Sets

public class Solution {

    public static void main(String[] args) {
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("Войтиков Дмитро", "555-55-66");
        phoneBook.put("Бочкарьов Петро", "950-44-66");
        phoneBook.put("Власов Василь", "554-55-66");
        phoneBook.put("Олександров Олексій", "505-22-66");
        phoneBook.put("Виноградов Максим", "550-55-33");
        phoneBook.put("Андреєв Андрій", "555-555-555");
        phoneBook.put("Громов Євген", "558-20-66");
        phoneBook.put("Брагін Іван", "455-65-66");
        phoneBook.put("Алексєєв Олександр", "500-87-66");
        phoneBook.put("Глазов Віктор", "355-59-86");

        TreeMap<String, String> contactsByFirstLetter = getContactsStartsWith(phoneBook, "Ал");

        if (contactsByFirstLetter.isEmpty()) {
            System.out.println("Контакти не знайдені.");
        } else {
            for (Map.Entry<String, String> entry : contactsByFirstLetter.entrySet()) {
                System.out.printf("%s, %s%n", entry.getKey(), entry.getValue());
            }
        }
    }

    public static TreeMap<String, String> getContactsStartsWith(TreeMap<String, String> map, String startsWith) {
        TreeMap<String, String> result = new TreeMap<>();
        NavigableSet<String> keys = map.navigableKeySet();
        for (String key : keys) {
            if (key.toLowerCase().startsWith(startsWith.toLowerCase())) {
                result.put(key, map.get(key));
            }
        }
        return result;
    }
}