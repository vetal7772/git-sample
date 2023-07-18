package ua.javarush.task.jdk13.task17.task1701;

import java.util.ArrayList;
import java.util.List;

/* 
Нотатки
*/

public class Solution {
    public static void main(String[] args) {
        new NoteThread().start();
        new NoteThread().start();
    }

    public static class NoteThread extends Thread {
        @Override
        public void run() {
            for (int index = 0; index <= 99; index++) {
                Note.addNote(getName() + "-Note" + index);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Note.removeNote(getName());
            }
        }
    }

    public static class Note {

        public static final List<String> NOTES = new ArrayList<>();

        public static void addNote(String note) {
            NOTES.add(0, note);
        }

        public static void removeNote(String threadName) {
            String note = NOTES.remove(0);
            if (note == null) {
                System.out.println("Інший потік видалив нашу нотатку");
            } else if (!note.startsWith(threadName)) {
                System.out.println("Потік [" + threadName + "] видалив чужу нотатку [" + note + "]");
            } else {
                System.out.println("Потік [" + threadName + "] видалив свою нотатку [" + note + "]");
            }
        }
    }
}
