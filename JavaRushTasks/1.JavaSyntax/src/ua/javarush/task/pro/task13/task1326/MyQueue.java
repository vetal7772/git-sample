package ua.javarush.task.pro.task13.task1326;

import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyQueue extends AbstractQueue<String> {

    private final List<String> values = new ArrayList<>();

    @Override
    public Iterator<String> iterator() {
        //напишіть тут ваш код
        return values.listIterator();
    }

    @Override
    public int size() {
        //напишіть тут ваш код
        return values.size();
    }

    @Override
    public boolean offer(String o) {
        values.add(o);
        return true;
    }

    @Override
    public String poll() {
        if (values.isEmpty()) {
            return null;
        } else {
            String string = values.get(0);
            values.remove(0);//напишіть тут ваш код
            return string;
        }
    }

    @Override
    public String peek() {
        
        if (values.isEmpty()) {
            return null;
        } else {
            String string = values.get(0);
            return string;
        }
    }
}
