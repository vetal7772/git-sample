package ua.javarush.task.pro.task05.task0520;

/* 
Перевзуваємося на ходу

При множенні correction*farenheit здійснюють множення, відкидають дробову частину, переводять в двійкову систему
і відкидають те що більше ніж 1 байт (8 знаків). На першій ітерації 127 * 459,67 = 58378,09
58378 = 1110 0100 0000 1010 відкидаємо 8 перших знаків, залишиться 0000 1010 = 10 і знак мінус добавимо -10
*/

public class Solution {

    public static int result = 105;

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
        }
    }
}
