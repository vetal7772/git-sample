package test.project.lesson6;

import java.util.Random;
import java.util.Scanner;

public class TestWhile1 {
    public static void main(String[] args) {
        boolean isRunning = true;
        Random rand = new Random();
        int secretNumber = rand.nextInt(15);
        int stopNumber = 33;
        Scanner scn = new Scanner(System.in);
        while (isRunning){
            System.out.println("Input number between 1 and 15");
            System.out.println("Stopnumber is 33");
            int currentNumber = scn.nextInt();
            if (secretNumber == currentNumber){
                isRunning=false;
                System.out.println("You win!");
            }else if (currentNumber==stopNumber){
                isRunning= false;
                System.out.println("Secret number was: "+secretNumber);
            }else{
                System.out.println("Try again!");
            }
        }
        System.out.println("Bye!");

    }
}
