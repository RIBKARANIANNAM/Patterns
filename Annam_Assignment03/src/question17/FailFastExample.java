package question17;

import java.util.ArrayList;
import java.util.Iterator;

public class FailFastExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // This will throw a ConcurrentModificationException
            list.remove(name);
        }
    }
}

