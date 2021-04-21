package collections.lists;

/**
 * based on collections interface witch extends iterable interface
 * and is implemented by all the classes in the collection frame work with provide all the basic methods
 * which every collection has like add remove clear get etc...
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * ArrayList:
 * ArrayList provides us with dynamic arrays in Java.
 * Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
 * The size of an ArrayList is increased automatically if the collection grows or shrinks if the objects are removed from the collection.
 * Java ArrayList allows us to randomly access the list.
 * ArrayList can not be used for primitive types, like int, char, etc.
 * We will need a wrapper class for such cases.
 * Lets understand the arraylist with the following example:
 */
public class ArrayListDemo {

    @Test
    public void example() {
        // Declaring the ArrayList with
        // initial size n
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++) {
            al.add(i);
        }

        // Printing elements
        System.out.println(al);

        // Remove element at index 3
        al.remove(3);

        // Displaying the ArrayList
        // after deletion
        System.out.println(al);

        // Printing elements one by one
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }
}
