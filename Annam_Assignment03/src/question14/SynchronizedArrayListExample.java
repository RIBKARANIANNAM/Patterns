package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedArrayListExample {
   public static void main(String[] args) {
      // create an unsynchronized ArrayList
      List<String> list = new ArrayList<>();

      // create a synchronized ArrayList using Collections.synchronizedList()
      List<String> synchronizedList = Collections.synchronizedList(list);

      // create two threads that modify the list concurrently
      Thread t1 = new Thread(() -> {
         synchronized (synchronizedList) {
            synchronizedList.add("apple");
            System.out.println(Thread.currentThread().getName() + " added 'apple' to the list");
         }
      });

      Thread t2 = new Thread(() -> {
         synchronized (synchronizedList) {
            synchronizedList.add("banana");
            System.out.println(Thread.currentThread().getName() + " added 'banana' to the list");
         }
      });

      // start the threads
      t1.start();
      t2.start();

      // wait for the threads to finish
      try {
         t1.join();
         t2.join();
      } catch (InterruptedException e) {
         e.printStackTrace();
      }

      // print the contents of the synchronized list
      System.out.println("The contents of the synchronized list are: " + synchronizedList);
   }
}

