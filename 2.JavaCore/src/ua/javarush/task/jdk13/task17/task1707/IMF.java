package ua.javarush.task.jdk13.task17.task1707;


public class IMF {

    private static IMF imf;
// можна створити відразу в стік блоці, і навіть без перевірки на null
    // або класично з перевіркою в методі
    //    static {
//        synchronized (IMF.class) {
//            if (imf == null) {
//                imf = new IMF();
//            }
//        }
//    }
    public static IMF getFund() {
        synchronized (IMF.class) {
            if (imf == null) {
                imf = new IMF();
            }
        }
        return imf;
    }

    private IMF() {
    }
}
