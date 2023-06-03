package ua.javarush.task.jdk13.task12.task1220;

/* 
Клас Human та інтерфейси CanRun, CanSwim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanRun {
        public void canRun();
    }

    public interface CanSwim {
        void canSwim();
    }

    public abstract class Human implements CanSwim, CanRun {

    }
}
