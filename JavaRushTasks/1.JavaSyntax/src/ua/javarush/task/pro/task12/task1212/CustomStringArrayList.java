package ua.javarush.task.pro.task12.task1212;

/* 
Створюємо свій список
*/

import java.util.Arrays;

public class CustomStringArrayList {

    private int size;
    private int capacity;
    private String[] elements;

    public CustomStringArrayList() {
        capacity = 10;
        size = 0;
        elements = new String[capacity];
    }

    public void add(String element) {
        if (size == capacity) {
            grow();
        }
        elements[size] = element;
        size++;
    }

    private void grow() {
        capacity = (int) (capacity*1.5);
        String[] newElem = new String[capacity];
        for (int i = 0; i < elements.length; i++) {
            newElem[i] = elements[i];

        }
       // newElem=Arrays.copyOf(elements, elements.length ); // так не проходило валідатор?
        elements=newElem;
    }

}
