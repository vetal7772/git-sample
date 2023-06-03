package ua.javarush.task.jdk13.task13.task1311;

/* 
Інтерфейс Updatable у класі Screen
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable{

// реалізувати в умові, а не перевизначити!

        public void refresh() {

        }


        public void onSelect() {

        }
    }
}
