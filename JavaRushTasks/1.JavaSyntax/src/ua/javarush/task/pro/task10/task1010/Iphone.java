package ua.javarush.task.pro.task10.task1010;

import java.util.Objects;

/* 
Два айфони
*/

public class Iphone {
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    //напишіть тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Iphone iphone = (Iphone) o;
        return price == iphone.price &&
                Objects.equals(model, iphone.model) &&
                Objects.equals(color, iphone.color);
    }
}

//працює, але не брав валідатор!
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//
//        if (!(obj instanceof Iphone)) {
//            return false;
//        }
//        Iphone iphone = (Iphone) obj;
//
//        if (this.model == null) {
//            return iphone.model == null;
//        }
//        if (this.color == null) {
//            return iphone.color == null;
//        }
////        if (this.price != iphone.price) {
////            return false;
////        }
//        //    return this.model.equals(((Iphone) obj).model) && this.color.equals(((Iphone)obj).color);
//        return this.model.equals(iphone.model) && this.color.equals(iphone.color)&&this.price==iphone.price;
//    }