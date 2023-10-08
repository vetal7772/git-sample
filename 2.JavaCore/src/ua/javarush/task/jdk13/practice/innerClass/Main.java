package ua.javarush.task.jdk13.practice.innerClass;

public class Main {
    public static void main(String[] args) {
        CarInnerEx1 car = new CarInnerEx1();
        CarInnerEx1.Door.count++;
        System.out.println(CarInnerEx1.Door.getCount());
    }
}