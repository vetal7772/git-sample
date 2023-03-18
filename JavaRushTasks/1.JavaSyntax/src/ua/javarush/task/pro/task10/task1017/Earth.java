package ua.javarush.task.pro.task10.task1017;

/* 
Створення материків
*/

public class Earth {
    public static void main(String[] args) {
        Africa africa = new Africa(2_000_000);
        Antarctica antarctica = new Antarctica(1_000_000);
        Australia australia = new Australia(1000000);
        Eurasia eurasia = new Eurasia(3000000);
        NorthAmerica northAmerica= new NorthAmerica(2000000);
        SouthAmerica southAmerica= new SouthAmerica(2000000);
    }
}
