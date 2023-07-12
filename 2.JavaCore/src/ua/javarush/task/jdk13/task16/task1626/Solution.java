package ua.javarush.task.jdk13.task16.task1626;

/* 
А без interrupt слабо?
*/

public class Solution {
    private static volatile boolean isCancel = false;
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new TestThread());
        t.start();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
      isCancel=true;

    }

    public static class TestThread implements Runnable {
        public void run() {
            while (!isCancel) {
                try {
                    System.out.println("he-he");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {
                }
            }
        }
    }
}
//class Clock implements Runnable
//{
//    private boolean isCancel = false;
//
//    public void cancel()
//    {
//        this.isCancel = true;
//    }
//
//    public void run()
//    {
//        while (!isCancel)
//        {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Tik");
//        }
//    }
//}