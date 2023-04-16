package question15;

import java.util.Hashtable;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;

public class HashTableVsHashMapExample {
   public static void main(String[] args) {
      // create a Hashtable
      Map<String, String> hashtable = new Hashtable<>();
      hashtable.put("key1", "value1");
      hashtable.put("key2", "value2");
      // hashtable.put(null, "value"); // will throw a NullPointerException
      // hashtable.put("key", null); // will throw a NullPointerException

      // create a HashMap
      Map<String, String> hashmap = new HashMap<>();
      hashmap.put("key1", "value1");
      hashmap.put("key2", "value2");
      hashmap.put(null, "value"); // allowed
      hashmap.put("key", null); // allowed

      // iterate over the elements of the Hashtable
      System.out.println("Hashtable:");
      for (Map.Entry<String, String> entry : hashtable.entrySet()) {
         System.out.println(entry.getKey() + " -> " + entry.getValue());
         hashtable.put("key3", "value3"); // allowed
      }

      // iterate over the elements of the HashMap
      System.out.println("HashMap:");
      try {
         for (Map.Entry<String, String> entry : hashmap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
            hashmap.put("key3", "value3"); // will throw a ConcurrentModificationException
         }
      } catch (ConcurrentModificationException e) {
         System.out.println("ConcurrentModificationException caught");
      }
   }
}

