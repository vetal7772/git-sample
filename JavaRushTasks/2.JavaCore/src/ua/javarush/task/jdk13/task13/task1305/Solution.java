package ua.javarush.task.jdk13.task13.task1305;

/* 
Усе, що рухається
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код

    }
    interface CanMove{
        Double speed();
//        default Double speed(){
//            return  0.;
//        };
    }

    public interface CanFly extends CanMove{

        Double speed(CanFly fly);

//        default Double speed(CanFly fly) {
//            return CanMove.super.speed();
//        }
    }
}