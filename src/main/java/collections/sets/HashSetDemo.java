package collections.sets;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * HashSet:
 * The HashSet class is an inherent implementation of the hash table data structure.
 * The objects that we insert into the HashSet do not guarantee to be inserted in the same order.
 * The objects are inserted based on their hashcode.
 * This class also allows the insertion of NULL elements.
 * Let’s understand HashSet with an example:
 */
public class HashSetDemo {

    @Test
    public void example() {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();

        hs.add("Geeks");
        hs.add("For");
        hs.add("Geeks");
        hs.add("Is");
        hs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Test
    public void testHashSet() {
        Set<Integer> myHashSet = new HashSet<>();
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,4,6,8,9,10,1,4,6,8,9,10));

        integerList.stream().filter(myHashSet::add).forEach(System.out::println);

        for (int i = 0; i < integerList.size(); i++) {
            if (myHashSet.add(integerList.get(i))) {
                System.out.println(integerList.get(i));
            }
        }
        for (int getNum : integerList) {
            if (myHashSet.add(getNum)) {
                System.out.println(getNum);
            }
        }

        Set<Integer> uniqueValues = new HashSet<>();
        boolean dropping = true;
        for (Integer e : integerList) {
            if (e % 2 == 0) {
                if (dropping) {
                    if (e <= 4) {
                        continue;
                    }
                    dropping = false;
                }
                if (uniqueValues.add(e)) {
                    System.out.println(e);
                }
            }
        }

        integerList.stream()
                .filter(e -> e % 2 == 0)
                .dropWhile(e -> e <= 4)
                .distinct()
                .forEach(System.out::println);

    }
}
