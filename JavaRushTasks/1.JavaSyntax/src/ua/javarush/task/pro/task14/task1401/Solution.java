package ua.javarush.task.pro.task14.task1401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Попрацюй обробником
*/

public class Solution {

    public static final String INPUT_NAME = "\nВведіть ім'я: ";
    public static final String INPUT_AGE = "Введіть вік користувача '%s': ";

    public static final String CANNOT_BE_NULL = "Ім'я не може бути null.";
    public static final String CANNOT_BE_EMPTY = "Ім'я не може бути порожнім.";
    public static final String CANNOT_CONTAIN_DIGIT = "Ім'я не може містити цифри.";
    public static final String CANNOT_BE_NEGATIVE = "Вік не може бути меншим за 0.";
    public static final String CANNOT_BE_TOO_BIG = "Вік не може бути більшим за 150.";
    public static final String UNKNOWN_ERROR = "Невідома помилка.";

    public static final String FOUND = "\nКористувача '%s' знайдено з індексом %d.\n";
    public static final String NOT_FOUND = "\nКористувача '%s' не знайдено.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Рафаель");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        //напишіть тут ваш код


     //  int status= user.setName(name);
        user.setName(name);
        if (user.setName(name) == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (user.setName(name) == -2) {
            System.out.println(CANNOT_BE_EMPTY);
        } else if (user.setName(name) == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (user.setName(name) != 0) {
            System.out.println(UNKNOWN_ERROR);
        }


        user.setAge(age);
        if (user.setAge(age) == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (user.setAge(age) == -2) {
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (user.setAge(age)!=0){
            System.out.println(UNKNOWN_ERROR);
        }
        users.add(user);
}

    static void findUserIndex(User user) {
        int code = users.indexOf(user);
        if (code == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }
    }
}
