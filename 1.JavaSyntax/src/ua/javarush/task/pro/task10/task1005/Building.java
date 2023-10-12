package ua.javarush.task.pro.task10.task1005;

/* 
Багатосерійний підприємець
*/

public class Building {
    private String type;

//    public Building(String type) {
//        this.type = type;
//    }

    public void initialize(String str){
        this.type=str;
    }

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Барбершоп");
    }
}
