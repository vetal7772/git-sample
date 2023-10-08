package ua.javarush.task.jdk13.practice.innerClass;

public class Test {
    static void a(int a){
        System.out.println("int");
    }
    static void a(Integer a){
        System.out.println("Integer");
    }
    static void a(Object a){
        System.out.println("Object");
    }
    public static void main(String[] args) {
Object i = new Integer(10);
a(i);
    }
}
