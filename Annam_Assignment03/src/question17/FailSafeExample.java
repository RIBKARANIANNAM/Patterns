package question17;

import java.util.ArrayList;
import java.util.Iterator;

public class FailSafeExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Bob");
        list.add("Charlie");

        Iterator<String> iterator = new ArrayList<>(list).iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // This will not affect the iterator
            list.remove(name);
        }

        System.out.println("Remaining elements in list: " + list);
    }
}
