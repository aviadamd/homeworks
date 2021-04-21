package collections.lists;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;

/**
 * LinkedList:
 * LinkedList class is an implementation of the LinkedList data structure which is a linear data structure where
 * the elements are not stored in contiguous locations and every element is a separate object with a data part and address
 * part. The elements are linked using pointers and addresses. Each element is known as a node.
 * Lets understand the LinekdList with the following example:
 */
public class LinkedListDemo {

    @Test
    public void example() {
        // Declaring the LinkedList
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // Appending new elements at
        // the end of the list
        for (int i = 1; i <= 5; i++) {
            ll.add(i);
        }

        // Printing elements
        System.out.println(ll);

        // Remove element at index 3
        ll.remove(3);

        // Displaying the List
        // after deletion
        System.out.println(ll);

        // Printing elements one by one
        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }
    }
}
