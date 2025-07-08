package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class CollectionsDemo {
    public static void main(String[] args) {
        // List example - ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicates allowed
        System.out.println("Fruits list: " + fruits);

        // Set example - HashSet
        HashSet<String> uniqueFruits = new HashSet<>(fruits);
        System.out.println("Unique fruits set: " + uniqueFruits);

        // Map example - HashMap
        HashMap<String, Integer> fruitCounts = new HashMap<>();
        fruitCounts.put("Apple", 2);
        fruitCounts.put("Banana", 1);
        System.out.println("Fruit counts map: " + fruitCounts);

        // Access elements
        System.out.println("First fruit in list: " + fruits.get(0));
        System.out.println("Count of Apples: " + fruitCounts.get("Apple"));
    }

}
