package ua.javarush.task.jdk13.task13.task1302;

/* 
Selectable та Updatable
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Screen screen = new Screen();
        screen.onSelect();
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public static class Screen implements Selectable, Updatable{
        @Override
        public void onSelect() {
            System.out.println("select channel");
        }

        @Override
        public void refresh() {

        }
    }
}
