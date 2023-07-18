package ua.javarush.task.jdk13.task27.task2703;

/* 
Другий варіант deadlock
*/

public class Solution {
    private final Object lock = new Object();

    public synchronized void firstMethod() {
        synchronized (lock) {
            doSomething();
        }
    }

    public void secondMethod()  {
        synchronized (lock) {
            synchronized (this) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                doSomething();
            }
        }
    }

    private void doSomething() {
        System.out.println("Thread "+Thread.currentThread().getName()+ " is running!");
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        for (int i = 0; i < 100; i++) {
            new Thread(sol::firstMethod).start();
            new Thread(sol::secondMethod).start();
        }
    }
}
