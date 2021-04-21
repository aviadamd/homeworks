package collections.lists;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;

/**
 * ArrayDeque:
 * ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array.
 * This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
 * Array deques have no capacity restrictions and they grow as necessary to support usage.
 * Lets understand ArrayDeque with an example:
 */
public class ArrayDequeDemo {

    @Test
    public void example() {
        // Initializing an deque
        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        // add() method to insert
        de_que.add(10);
        de_que.add(20);
        de_que.add(30);
        de_que.add(40);
        de_que.add(50);

        System.out.println(de_que);

        // clear() method
        de_que.clear();

        // addFirst() method to insert the
        // elements at the head
        de_que.addFirst(564);
        de_que.addFirst(291);

        // addLast() method to insert the
        // elements at the tail
        de_que.addLast(24);
        de_que.addLast(14);

        System.out.println(de_que);
    }
}
