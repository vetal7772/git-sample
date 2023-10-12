package ua.javarush.task.pro.task04.task0407;

/* 
Сума чисел, не кратних 3
*/

public class Solution {
    public static void main(String[] args) {
        //напишіть тут ваш код
int sum = 0;
int number = 100;
while (number>0){
    if (number%3==0){
        number--;
        continue;
    } else {
        sum = sum + number;
        number--;
    }

}
        System.out.println(sum);
    }
}