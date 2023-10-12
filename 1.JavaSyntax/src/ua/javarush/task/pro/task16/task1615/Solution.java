package ua.javarush.task.pro.task16.task1615;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

/* 
Ой, як багато методів!
*/

public class Solution {

    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusMinutes(instant, 2));
        System.out.println(plusHours(instant, 2));
        System.out.println(plusDays(instant, 2));
        System.out.println(minusMinutes(instant, 2));
        System.out.println(minusHours(instant, 2));
        System.out.println(minusDays(instant, 2));
    }

    static public Instant plusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код

        return instant.plus(minutes,ChronoUnit.MINUTES);
    }

    static public Instant plusHours(Instant instant, long hours) {
        //напишіть тут ваш код

        return instant.plus(hours,ChronoUnit.HOURS);
    }

    static public Instant plusDays(Instant instant, long days) {
        //напишіть тут ваш код

        return instant.plus(days,ChronoUnit.DAYS);
    }

    static public Instant minusMinutes(Instant instant, long minutes) {
        //напишіть тут ваш код

        return instant.minus(minutes,ChronoUnit.MINUTES);
    }

    static public Instant minusHours(Instant instant, long hours) {
        //напишіть тут ваш код

        return instant.minus(hours,ChronoUnit.HOURS);
    }

    static public Instant minusDays(Instant instant, long days) {
        //напишіть тут ваш код

        return instant.minus(days,ChronoUnit.DAYS);
    }
}
