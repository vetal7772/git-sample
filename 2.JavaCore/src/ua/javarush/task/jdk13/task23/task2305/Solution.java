package ua.javarush.task.jdk13.task23.task2305;

/* 
Повторюємо threads
*/

public class Solution {
    public final String name;
    public final String food;
    public final String sound;

    public Solution(String name, String food, String sound) {
        this.name = name;
        this.food = food;
        this.sound = sound;
    }

    public void eat(String food) {
        System.out.println(name + ": Mmmmm, " + food);
    }

    public void play() {
        System.out.println(name + ": " + sound + " " + sound);
    }

    public void sleep(long milliseconds) throws InterruptedException {
              System.out.println(name + ": Zzzzzzz..." + (milliseconds / 1000) + " s");
    }

    public void live() throws InterruptedException {
        Thread thread = new Thread()
        {
            public void run() {
                try {
                    someActions();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void someActions() throws InterruptedException {
                eat(food);
                play();
      // sleep2(5000);
       Solution.this.sleep(1000);
       // Такий дивний вивід через Solution.this  потрібен, бо викликається
                // метод sleep,що є і в Thread. При sleep2 - все нормально працює sleep2(5000);

            }
        };
        thread.start();
        thread.join();
    }

    public static void main(String[] args) throws InterruptedException {
       Solution solution= new Solution("Amigo", "beef", "knock");
               solution.live();
    }
}
