package ua.javarush.task.jdk13.task21.task2102;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Виправити помилку. Порівняння об'єктів
*/

public class Solution {
    private final String first;
    private final String last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Solution)) {
            return false;
        }

        Solution solution = (Solution) o;

        if
        (!Objects.equals(first, solution.first))
      //  return first !=null ? first.equals(solution.first) : solution.first == null;
                {
            return false;
        }
        return Objects.equals(last, solution.last);
       // return last != null ? last.equals(solution.last) : solution.last == null;
    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Mickey", "Mouse"));
        System.out.println(s.contains(new Solution("Mickey", "Mouse")));
    }
}
