package collections.map;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap: HashMap provides the basic implementation of the Map interface of Java. It stores the data in (Key, Value) pairs.
 * To access a value in a HashMap, we must know its key.
 * HashMap uses a technique called Hashing.
 * Hashing is a technique of converting a large String to small String that represents the same String so that the
 * indexing and search operations are faster.
 * HashSet also uses HashMap internally.
 * Let’s understand the HashMap with an example:
 */
public class HashMapDemo {

    @Test
    public void example() {
        // Creating HashMap and
        // adding elements
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "Geeks");
        hm.put(2, "For");
        hm.put(3, "Geeks");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
