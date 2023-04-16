package question16;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add some key-value pairs to the HashMap
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Retrieve the value associated with a key
        int aliceAge = hashMap.get("Alice");
        System.out.println("Alice's age is " + aliceAge);

        // Modify the value associated with a key
        hashMap.put("Bob", 31);
        int bobAge = hashMap.get("Bob");
        System.out.println("Bob's age is " + bobAge);

        // Remove a key-value pair from the HashMap
        hashMap.remove("Charlie");

        // Iterate over the key-value pairs in the HashMap
        for (String name : hashMap.keySet()) {
            int age = hashMap.get(name);
            System.out.println(name + " is " + age + " years old");
        }
    }
}

