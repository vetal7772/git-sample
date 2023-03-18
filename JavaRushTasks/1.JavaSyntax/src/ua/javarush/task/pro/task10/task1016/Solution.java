package ua.javarush.task.pro.task10.task1016;

/* 
Прогноз погоди
*/

public class Solution {

    public static void showWeather(City city) {
        System.out.println("У місті "+city.getName()+" сьогодні температура повітря "+city.getTemperature());
    }

    public static void main(String[] args) {
       showWeather(new City("Dubai",50));
    }
}
