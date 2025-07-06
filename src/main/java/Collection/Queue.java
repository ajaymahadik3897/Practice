package Collection;

import java.util.PriorityQueue;

public class Queue {
    void priorityQueueDemo() {
        // PriorityQueue is a collection that orders its elements based on their natural ordering or by a specified comparator.
        // It is not thread-safe and does not allow null elements.
        PriorityQueue<String> queue = new PriorityQueue<>(); // Create a PriorityQueue of String

        // Adding elements to the PriorityQueue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");
        queue.add("Elderberry");

        // Printing the PriorityQueue
        System.out.println("PriorityQueue: " + queue);

        // Accessing the head of the PriorityQueue
        System.out.println("Head of the PriorityQueue: " + queue.peek()); // peek returns the head element without removing it //queue.element() can also be used to get the head element - throws error if queue is empty

        // Removing the head of the PriorityQueue
        System.out.println("Removing head: " + queue.poll()); // poll removes and returns the head element

        // Printing the PriorityQueue after removal
        System.out.println("PriorityQueue after removing head: " + queue);

        // Checking if an element exists
        System.out.println("Does the PriorityQueue contain 'Banana'? " + queue.contains("Banana"));

        // Iterating through the PriorityQueue
        System.out.println("Iterating through the PriorityQueue:");
        for (String fruit : queue) {
            System.out.println(fruit);
        }

        //removing a specific element
        queue.remove("Cherry"); // remove removes a specific element
        System.out.println("PriorityQueue after removing 'Cherry': " + queue);
        // Printing the PriorityQueue after removing an element
        System.out.println("PriorityQueue after removing 'Cherry': " + queue);

        // Clearing the PriorityQueue
        queue.clear();
        System.out.println("PriorityQueue after clearing: " + queue);

        // Checking if the PriorityQueue is empty
        System.out.println("Is the PriorityQueue empty? " + queue.isEmpty());
    }

    void dequeDemo() {
        // Deque (Double-Ended Queue) is a collection that allows elements to be added or removed from both ends.
        // It can be used as a stack or a queue.
        java.util.Deque<String> deque = new java.util.ArrayDeque<>(); // Create an ArrayDeque of String

        // Adding elements to the Deque
        deque.add("Apple");
        deque.add("Banana");
        deque.addFirst("Cherry"); // addFirst adds an element at the front
        deque.addLast("Date"); // addLast adds an element at the end
        deque.add("Elderberry");

        // Printing the Deque
        System.out.println("Deque: " + deque);

        // Accessing the first and last elements
        System.out.println("First element: " + deque.getFirst()); // getFirst returns the first element without removing it
        System.out.println("Last element: " + deque.getLast()); // getLast returns the last element without removing it

        // Removing elements from the Deque
        System.out.println("Removing first: " + deque.removeFirst()); // removeFirst removes and returns the first element
        System.out.println("Removing last: " + deque.removeLast()); // removeLast removes and returns the last element

        // Printing the Deque after removals
        System.out.println("Deque after removals: " + deque);

        // Checking if an element exists
        System.out.println("Does the Deque contain 'Banana'? " + deque.contains("Banana"));

        // Iterating through the Deque
        System.out.println("Iterating through the Deque:");
        for (String fruit : deque) {
            System.out.println(fruit);
        }

        // Clearing the Deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);

        // Checking if the Deque is empty
        System.out.println("Is the Deque empty? " + deque.isEmpty());
    }

    void arrayDequeDemo() {
        // ArrayDeque is a resizable array implementation of the Deque interface.
        // It allows for fast access to elements and can be used as a stack or a queue.
        java.util.ArrayDeque<String> arrayDeque = new java.util.ArrayDeque<>(); // Create an ArrayDeque of String

        // Adding elements to the ArrayDeque
        arrayDeque.add("Apple");
        arrayDeque.add("Banana");
        arrayDeque.addFirst("Cherry"); // addFirst adds an element at the front
        arrayDeque.addLast("Date"); // addLast adds an element at the end
        arrayDeque.add("Elderberry");

        // Printing the ArrayDeque
        System.out.println("ArrayDeque: " + arrayDeque);

        // Accessing the first and last elements
        System.out.println("First element: " + arrayDeque.getFirst()); // getFirst returns the first element without removing it
        System.out.println("Last element: " + arrayDeque.getLast()); // getLast returns the last element without removing it

        // Removing elements from the ArrayDeque
        System.out.println("Removing first: " + arrayDeque.removeFirst()); // removeFirst removes and returns the first element
        System.out.println("Removing last: " + arrayDeque.removeLast()); // removeLast removes and returns the last element

        // Printing the ArrayDeque after removals
        System.out.println("ArrayDeque after removals: " + arrayDeque);

        // Checking if an element exists
        System.out.println("Does the ArrayDeque contain 'Banana'? " + arrayDeque.contains("Banana"));

        // Iterating through the ArrayDeque
        System.out.println("Iterating through the ArrayDeque:");
        for (String fruit : arrayDeque) {
            System.out.println(fruit);
        }

        // Clearing the ArrayDeque
        arrayDeque.clear();
        System.out.println("ArrayDeque after clearing: " + arrayDeque);

        // Checking if the ArrayDeque is empty
        System.out.println("Is the ArrayDeque empty? " + arrayDeque.isEmpty());
    }

    public static void main(String[] args) {
        Queue queueDemo = new Queue();
        queueDemo.priorityQueueDemo();
        queueDemo.dequeDemo();
        queueDemo.arrayDequeDemo();
    }
}
