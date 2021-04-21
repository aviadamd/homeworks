package collections.map;

/**
 *  Map Interface:
 *  A map is a data structure which supports the key-value pair mapping for the data.
 *  This interface doesn’t support duplicate keys because the same key cannot have multiple mappings.
 *  A map is useful if there is a data and we wish to perform operations on the basis of the key.
 *  This map interface is implemented by various classes like HashMap, TreeMap etc. Since all the subclasses implement the map,
 *  we can instantiate a map object with any of these classes.
 *  For example
 */

import jdk.jfr.Description;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Map<T> hm = new HashMap<> ();
 * Map<T> tm = new TreeMap<> ();
 * Where T is the type of the object.
 */
@Description("LinkedHasMap -> extends -> HashMap class implements -> Map -interface")
public class MapDemo {

    @Test
    public void example() {
        // Initialization of a LinkedHashMap
        // using Generics
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

        // Inserting the Elements
        hm.put(3, "Geeks");
        hm.put(2, "For");
        hm.put(1, "Geeks");

        for (Map.Entry<Integer, String> mapElement : hm.entrySet()) {
            Integer key = mapElement.getKey();
            // Finding the value
            String value = mapElement.getValue();
            // print the key : value pair
            System.out.println(key + " : " + value);
        }
    }
}
