package Collection;

import java.util.HashSet;

public class SetDemo {

    void HashSetDemo() {
        // HashSet is a collection that contains no duplicate elements and has no defined order.
        // It is backed by a hash table, which allows for fast access to elements.
        HashSet<String> set = new HashSet<>(); // Create a HashSet of String or Set<String> set = new HashSet<>(); // for generic types

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        // Printing the HashSet
        System.out.println("HashSet: " + set);

        // Checking if an element exists
        System.out.println("Does the HashSet contain 'Banana'? " + set.contains("Banana"));

        // Removing an element
        set.remove("Cherry");
        System.out.println("HashSet after removing 'Cherry': " + set); // System.out.println(set.remove("Cherry"));

        // Iterating through the HashSet
        System.out.println("Iterating through the HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);

        // Checking if the HashSet is empty
        System.out.println("Is the HashSet empty? " + set.isEmpty());
    }

    void LinkedHashSetDemo() {
        // LinkedHashSet is a collection that contains no duplicate elements and maintains the insertion order.
        // It is backed by a hash table and a linked list, which allows for fast access to elements while preserving order.
        HashSet<String> linkedSet = new HashSet<>(); // Create a LinkedHashSet of String or Set<String> linkedSet = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");
        linkedSet.add("Date");
        linkedSet.add("Elderberry");

        // Printing the LinkedHashSet
        System.out.println("LinkedHashSet: " + linkedSet);

        // Checking if an element exists
        System.out.println("Does the LinkedHashSet contain 'Banana'? " + linkedSet.contains("Banana"));

        // Removing an element
        linkedSet.remove("Cherry");
        System.out.println("LinkedHashSet after removing 'Cherry': " + linkedSet);

        // Iterating through the LinkedHashSet
        System.out.println("Iterating through the LinkedHashSet:");
        for (String fruit : linkedSet) {
            System.out.println(fruit);
        }

        // Clearing the LinkedHashSet
        linkedSet.clear();
        System.out.println("LinkedHashSet after clearing: " + linkedSet);

        // Checking if the LinkedHashSet is empty
        System.out.println("Is the LinkedHashSet empty? " + linkedSet.isEmpty());
    }

    void TreeSetDemo() {
        // TreeSet is a collection that contains no duplicate elements and maintains the natural order of elements.
        // It is backed by a red-black tree, which allows for fast access to elements while maintaining order.
        HashSet<String> treeSet = new HashSet<>(); // Create a TreeSet of String or Set<String> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");
        treeSet.add("Elderberry");

        // Printing the TreeSet
        System.out.println("TreeSet: " + treeSet);

        // Checking if an element exists
        System.out.println("Does the TreeSet contain 'Banana'? " + treeSet.contains("Banana"));

        // Removing an element
        treeSet.remove("Cherry");
        System.out.println("TreeSet after removing 'Cherry': " + treeSet);

        // Iterating through the TreeSet
        System.out.println("Iterating through the TreeSet:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // Clearing the TreeSet
        treeSet.clear();
        System.out.println("TreeSet after clearing: " + treeSet);

        // Checking if the TreeSet is empty
        System.out.println("Is the TreeSet empty? " + treeSet.isEmpty());
    }
    public static void main(String[] args) {
        SetDemo demo = new SetDemo();
        demo.HashSetDemo();
        demo.LinkedHashSetDemo();
        demo.TreeSetDemo();
    }

}
