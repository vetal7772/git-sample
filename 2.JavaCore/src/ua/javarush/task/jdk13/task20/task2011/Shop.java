package ua.javarush.task.jdk13.task20.task2011;

import java.util.*;

public class Shop {
    public int count ;
    public double profit ;
    public List<String> secretData ;
   public Goods goods = new Goods();

    public static class Goods {

        public List<String> names;

        @Override
        public String toString() {
            return "Goods{" +
                    "names=" + names +
                    '}';
        }
    }



    @Override
    public String toString() {
        return "Shop{" +
                "count=" + count +
                ", profit=" + profit +
                ", secretData=" + (secretData == null ? null : Arrays.asList(secretData)) +
                '}';
    }
}
