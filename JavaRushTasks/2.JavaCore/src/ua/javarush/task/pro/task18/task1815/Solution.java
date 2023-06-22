package ua.javarush.task.pro.task18.task1815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Перетворення даних
*/

public class Solution {

    public static void main(String[] args) {
        var accounts = new ArrayList<Account>();
        Collections.addAll(accounts,
                new Account("Elly", "elly@yandex.ru"),
                new Account("Jocker", "jocker@gmail.com"),
                new Account("Neo", "neo@yahoo.com"));

        Stream<String> emails = getEmails(accounts);
        emails.forEach(System.out::println);
    }

    public static Stream<String> getEmails(ArrayList<Account> accounts) {
        //напишіть тут ваш код
        return accounts.stream().map(Account::getEmail);
    }
}
