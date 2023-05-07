package ua.javarush.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
       switch (countOfCorner){
           case 3: return  "Трикутник";
           case 4: return  "Чотирикутник";
           case 5: return  "П'ятикутник";
           case 6: return  "Шестикутник";
           case 7: return  "Семикутник";
           case 8: return  "Восьмикутник";
           default: return  "Інша фігура";
        }

    }
}
