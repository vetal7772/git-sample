package ua.javarush.task.jdk13.task13.task1307;

/* 
Том, Джеррі та Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    // може рухатися
    public interface Movable {
        void move();
    }

    // може бути з'їдений
    public interface Edible {
        void beEaten();
    }

    // може когось з'їсти
    public interface Eat {
        void eat();
    }

    public class Cat implements Movable, Edible, Eat {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }

    public class Mouse implements Movable, Edible {

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    public class Dog implements Movable, Eat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }
}