package ua.javarush.task.jdk13.task28.task2805;

import java.util.concurrent.Callable;

public class CalculateFactorial implements Callable<Long> {
private Long number;

    public CalculateFactorial(Long number) {
        this.number = number;
    }

//    public static Long calculate(Long number) {
//       return null;
//    }

    @Override
    public Long call() throws Exception {
        long result = 1L;
        while (number > 1) {
            result *= number;
            number--;
        }
        System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getId()+" "+result);
       Thread.sleep(100);
        return result;
    }
}
