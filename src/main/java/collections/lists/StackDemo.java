package collections.lists;

import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Stack;

/**
 * Stack:
 * Stack class models and implements the Stack data structure.
 * The class is based on the basic principle of last-in-first-out.
 * In addition to the basic push and pop operations, the class provides three more functions of empty,
 * search and peek.
 * The class can also be referred to as the subclass of Vector.
 * Let’s understand the stack with an example:
 */
public class StackDemo {

    @Test
    public void example() {
        Stack<String> stack = new Stack<String>();
        stack.push("Geeks");
        stack.push("For");
        stack.push("Geeks");
        stack.push("Geeks");

        // Iterator for the stack
        Iterator<String> itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();

        stack.pop();

        // Iterator for the stack
        itr = stack.iterator();

        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
