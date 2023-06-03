package ua.javarush.task.jdk13.task13.task1304;

/* 
Гей, ти там живий?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишіть тут ваш код

    }
    public interface Person{
        default boolean isAlive(){
            return true;
        }
    }
    public interface Presentable extends Person{

    }
}