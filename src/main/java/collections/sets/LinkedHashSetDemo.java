package collections.sets;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * LinkedHashSet:
 * A LinkedHashSet is very similar to a HashSet.
 * The difference is that this uses a doubly linked list to store the data and retains the ordering of the elements.
 * Let’s understand the LinkedHashSet with an example:
 */
public class LinkedHashSetDemo {

    @Test
    public void example() {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Geeks");
        lhs.add("For");
        lhs.add("Geeks");
        lhs.add("Is");
        lhs.add("Very helpful");

        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


    @Test
    public void testHashSet() {

        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,4,6,8,9,10,1,4,6,8,9,10));
        Set<Integer> myLinkedSet = new LinkedHashSet<>();
        integerList.stream().filter(myLinkedSet::add).forEach(System.out::println);

        for (int i = 0; i < integerList.size(); i++) {
            if (myLinkedSet.add(integerList.get(i))) {
                System.out.println(integerList.get(i));
            }
        }
        for (int getNum : integerList) {
            if (myLinkedSet.add(getNum)) {
                System.out.println(getNum);
            }
        }
    }
}
