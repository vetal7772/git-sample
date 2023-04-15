package ua.javarush.task.pro.task13.task1317;

/* 
Перетворюємо enum на клас
*/


public class Month {

    public static final Month JANUARY = new Month(0,31);
    public static final Month FEBRUARY = new Month(1,28);
    public static final Month MARCH = new Month(2,31);
    public static final Month APRIL = new Month(3,30);
    public static final Month MAY = new Month(4,31);
    public static final Month JUNE = new Month(5,30);
    public static final Month JULY = new Month(6,31);
    public static final Month AUGUST = new Month(7,31);
    public static final Month SEPTEMBER = new Month(8,30);
    public static final Month OCTOBER = new Month(9,31);
    public static final Month NOVEMBER = new Month(10,30);
    public static final Month DECEMBER = new Month(11,31);


    private final int number;
    private final int quant;

    private Month(int number, int quantity) {
        this.number = number;
        quant = quantity;
    }

    private static final Month[] months = {JANUARY, FEBRUARY, MARCH, APRIL, MAY,
            JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};


    public int ordinal() {
        return this.number;
    }

    public static Month[] values() {
        return months;
    }
}