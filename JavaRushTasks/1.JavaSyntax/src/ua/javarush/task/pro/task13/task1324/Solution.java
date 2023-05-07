package ua.javarush.task.pro.task13.task1324;

import java.util.Random;
import java.util.TreeMap;

/* 
Зарплати та позиції
*/

public class Solution {

    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(0, "Newbie");
        map.put(200, "Trainee");
        map.put(800, "Junior");
        map.put(1200, "Strong Junior");
        map.put(2700, "Middle");
        map.put(3500, "Strong Middle");
        map.put(5000, "Senior");

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int salary = random.nextInt(50) * 100;
            String position = getJobTitle(map, salary);
            System.out.printf("Зарплатні $%d відповідає позиція %s%n", salary, position);
        }
    }

    public static String getJobTitle(TreeMap<Integer, String> map, Integer salary) {
       String result=null;
//        if (salary>=0&&salary<200){
//            result="Newbie";
//        } else if (salary>=200&&salary<800){
//            result="Trainee";
//        } else if (salary>=800&&salary<1200){
//            result="Junior";
//        } else if (salary>=1200&&salary<2700){
//            result="Strong Junior";
//        }else if (salary>=2700&&salary<3500){
//            result="Middle";
//        }else if (salary>=3500&&salary<5000){
//            result="Strong Middle";
//        }else if (salary>=5000){
//            result="Senior";
//        }
        return map.floorEntry(salary).getValue();
  //      return result;
    }
}