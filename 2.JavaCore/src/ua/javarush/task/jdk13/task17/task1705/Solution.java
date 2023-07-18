package ua.javarush.task.jdk13.task17.task1705;

import java.util.ArrayList;
import java.util.List;

/* 
Сад-город
*/

public class Solution {


    public static void main(String[] args) {
new Garden().start();
    }

    public static class Garden extends Thread{

        public final List<String> fruits = new ArrayList<String>();
        public final List<String> vegetables = new ArrayList<String>();

        public synchronized void  addFruit(int index, String fruit) {
           // synchronized (this) {   не підходить такий варіант, бо в умові вказано
             //   синхронізуватися на методах
                fruits.add(index, fruit);
          //  }
        }

        public synchronized void removeFruit(int index) {
            fruits.remove(index);
        }

        public synchronized void addVegetable(int index, String vegetable) {
            vegetables.add(index, vegetable);
        }

        public synchronized void removeVegetable(int index) {
            vegetables.remove(index);
        }

//        @Override
//        public void run() {
//            addFruit(0, "Apple");
//            addFruit(1, "Plum");
//            addVegetable(0, "Carrot");
//        }
    }
}
