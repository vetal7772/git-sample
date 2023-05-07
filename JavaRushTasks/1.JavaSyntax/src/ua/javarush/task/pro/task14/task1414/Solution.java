package ua.javarush.task.pro.task14.task1414;

/* 
Готуємо коктейлі
*/

public class Solution {

    public static final String OUTPUT_FORMAT = "Метод %s викликано з рядка %d класу %s у файлі %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        // stackTrace = Thread.currentThread().getStackTrace();
         for (var info: stackTrace ){
//             System.out.println("Метод "+info.getMethodName()+
//                     " викликано з рядка "+info.getLineNumber()+" класу "+ info.getClassName()+
//                     " у файлі "+info.getFileName()+ ".");
             System.out.printf(OUTPUT_FORMAT, info.getMethodName(),info.getLineNumber(),
                     info.getClassName(),info.getFileName());
         }
    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
