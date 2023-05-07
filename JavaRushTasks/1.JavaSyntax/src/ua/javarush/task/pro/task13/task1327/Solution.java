package ua.javarush.task.pro.task13.task1327;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class Solution {

    public static Queue<Character> queue = new PriorityQueue<>();

    public static void main(String[] args) {
        queue.addAll(Arrays.asList('М', 'Ч', 'Р', 'Ж', 'Ц', 'В', 'С', 'А', 'Ф', 'Н', 'З', 'Б', 'Ш', 'К', 'О', 'У', 'Г', 'П', 'И', 'Е', 'Т', 'Х', 'Л'));

        while (queue.size() > 0) {
            System.out.println(queue.poll());
        }
    }
}
