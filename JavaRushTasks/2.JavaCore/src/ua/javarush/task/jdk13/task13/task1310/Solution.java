package ua.javarush.task.jdk13.task13.task1310;


/* 
Виправлення помилок
*/

public class Solution {

    public static void main(String[] args) {

        System.out.println(Dream.HOBBY.toString()); //2
        System.out.println(new Hobby().INDEX); // 2

//        System.out.println(new Hobby().INDEX); // 1
//        System.out.println(Dream.HOBBY.toString());// 2

    }

    interface Desire {
    }

    interface Dream extends Desire {
        public static Hobby HOBBY = new Hobby();
    }

    static class Hobby implements Desire, Dream {
        static int INDEX = 1;

        @Override
        public String toString() {
            INDEX++;
            return "" + INDEX;
        }
    }

}
