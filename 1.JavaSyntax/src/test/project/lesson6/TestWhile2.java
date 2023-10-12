package test.project.lesson6;

import java.util.Random;

public class TestWhile2 {
    public static void main(String[] args) {


        boolean isRunning = true;
        Random rand = new Random();
        int secretNumber = rand.nextInt(15);
        int stopNumber = 33;
int counter=0;
        while (isRunning) {

            int currentNumber = rand.nextInt(15);
            counter++;
            System.out.println(currentNumber);
            if (secretNumber == currentNumber) {
                System.out.println("secretNumber is "+secretNumber);
                isRunning = false;

            }
            }
        System.out.println("counter = "+counter);
        System.out.println("bye");
        }
    }
