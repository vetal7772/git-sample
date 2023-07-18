package ua.javarush.task.jdk13.task17.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронізовані нотатки
*/

public class Solution {

    public static void main(String[] args) {
new Note().start();
//new Note().start();
    }

    public static class Note extends Thread{

        public  List<String> notes = new ArrayList<String>();

        public  void addNote(int index, String note) {
            System.out.println("Зараз буде додано нотатку [" + note + "] На позицію " + index);
            synchronized (notes) {
                notes.add(index, note);
           }

            System.out.println("Вже додано нотатку [" + note + "]");
        }

        public  void removeNote(int index) {
            System.out.println("Зараз буде видалено нотатку з позиції " + index);
            String note;
            synchronized (notes) {
                note = notes.remove(index);
           }
            System.out.println("Вже видалено нотатку [" + note + "] з позиції " + index);
        }

        @Override
        public void run() {
//            addNote(0, "new Note");
//            addNote(1, "new Note1");
//            addNote(2, "new Note1");
//            removeNote(0);
            for (int i=0; i<9;i++) {
                addNote(i, "new Note");
                System.out.println("Add new note "+i+ "thread");
               //removeNote(i);
                System.out.println("Remove note from position "+i);
            }

        }
    }

}
