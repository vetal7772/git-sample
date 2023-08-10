package ua.javarush.task.jdk13.task38.task3803;

/* 
Обробка анотацій
*/

import java.lang.annotation.Annotation;

public class Solution {
    public static void main(String[] args) {
        printFullyQualifiedNames(Solution.class);
        printFullyQualifiedNames(SomeTest.class);

        printValues(Solution.class);
        printValues(SomeTest.class);
    }

    public static <T> boolean printFullyQualifiedNames(Class<T> c) {
        if (c.isAnnotationPresent(PrepareMyTest.class)) {

            System.out.println("Пошук анотацій в " + c.getClass().getName());
            Annotation[] annotations = c.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.print(annotation);

            }
            return true;
        } else {
            return false;
        }
    }

    public static <T> boolean printValues(Class<T> c) {
        PrepareMyTest prepareMyTest = c.getDeclaredAnnotation(PrepareMyTest.class);
        if (prepareMyTest == null) {
            return false;
        }
        for (Class<?> clazz : prepareMyTest.value()) {
            System.out.println(clazz.getSimpleName());
        }
        return true;
    }
}
