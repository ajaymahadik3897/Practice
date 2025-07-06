package Collection;
import java.util.HashMap;

public class Map {
    void HashMapDemo() {
        // HashMap is a collection that maps keys to values, allowing for fast access to elements based on their keys.
        // It does not maintain any order of elements.
        HashMap<String, Integer> map = new HashMap<>(); // Create a HashMap with String keys and Integer values

        // Adding key-value pairs to the HashMap
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);
        map.put("Elderberry", 5);

        // Printing the HashMap
        System.out.println("HashMap: " + map);

        // Accessing a value by its key
        System.out.println("Value for 'Banana': " + map.get("Banana")); // get is used to retrieve the value associated with a specific key

        // Checking if a key exists
        System.out.println("Does the HashMap contain key 'Cherry'? " + map.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the HashMap contain value 4? " + map.containsValue(4));

        // Removing a key-value pair
        map.remove("Date");
        System.out.println("HashMap after removing 'Date': " + map);

        // Iterating through the HashMap
        System.out.println("Iterating through the HashMap:");
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) { // entrySet returns a set view of the mappings contained in this map
            System.out.println(entry.getKey() + ": " + entry.getValue()); // getKey and getValue are used to access the key and value of each entry
        }

        // Clearing the HashMap
        map.clear();
        System.out.println("HashMap after clearing: " + map);

        // Checking if the HashMap is empty
        System.out.println("Is the HashMap empty? " + map.isEmpty());
    }

    void LinkedHashMapDemo() {
        // LinkedHashMap is a collection that maps keys to values, maintaining the insertion order of elements.
        // It is similar to HashMap but preserves the order in which elements were added.
        java.util.LinkedHashMap<String, Integer> linkedMap = new java.util.LinkedHashMap<>(); // Create a LinkedHashMap with String keys and Integer values

        // Adding key-value pairs to the LinkedHashMap
        linkedMap.put("Apple", 1);
        linkedMap.put("Banana", 2);
        linkedMap.put("Cherry", 3);
        linkedMap.put("Date", 4);
        linkedMap.put("Elderberry", 5);

        // Printing the LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedMap);

        // Accessing a value by its key
        System.out.println("Value for 'Banana': " + linkedMap.get("Banana"));

        // Checking if a key exists
        System.out.println("Does the LinkedHashMap contain key 'Cherry'? " + linkedMap.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the LinkedHashMap contain value 4? " + linkedMap.containsValue(4));

        // Removing a key-value pair
        linkedMap.remove("Date");
        System.out.println("LinkedHashMap after removing 'Date': " + linkedMap);

        // Iterating through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (java.util.Map.Entry<String, Integer> entry : linkedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clearing the LinkedHashMap
        linkedMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedMap);

        // Checking if the LinkedHashMap is empty
        System.out.println("Is the LinkedHashMap empty? " + linkedMap.isEmpty());
    }

    void TreeMapDemo() {
        // TreeMap is a collection that maps keys to values, maintaining the keys in sorted order.
        // It is implemented as a Red-Black tree, which allows for fast access and retrieval of elements.
        java.util.TreeMap<String, Integer> treeMap = new java.util.TreeMap<>(); // Create a TreeMap with String keys and Integer values

        // Adding key-value pairs to the TreeMap
        treeMap.put("Apple", 1);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 3);
        treeMap.put("Date", 4);
        treeMap.put("Elderberry", 5);

        // Printing the TreeMap
        System.out.println("TreeMap: " + treeMap);

        // Accessing a value by its key
        System.out.println("Value for 'Banana': " + treeMap.get("Banana"));

        // Checking if a key exists
        System.out.println("Does the TreeMap contain key 'Cherry'? " + treeMap.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the TreeMap contain value 4? " + treeMap.containsValue(4));

        // Removing a key-value pair
        treeMap.remove("Date");
        System.out.println("TreeMap after removing 'Date': " + treeMap);

        // Iterating through the TreeMap
        System.out.println("Iterating through the TreeMap:");
        for (java.util.Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clearing the TreeMap
        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);

        // Checking if the TreeMap is empty
        System.out.println("Is the TreeMap empty? " + treeMap.isEmpty());
    }

    void HashtableDemo() {
        // Hashtable is a synchronized collection that maps keys to values, similar to HashMap.
        // It does not allow null keys or values and is thread-safe.
        java.util.Hashtable<String, Integer> hashtable = new java.util.Hashtable<>(); // Create a Hashtable with String keys and Integer values

        // Adding key-value pairs to the Hashtable
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);
        hashtable.put("Date", 4);
        hashtable.put("Elderberry", 5);

        // Printing the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Accessing a value by its key
        System.out.println("Value for 'Banana': " + hashtable.get("Banana"));

        // Checking if a key exists
        System.out.println("Does the Hashtable contain key 'Cherry'? " + hashtable.containsKey("Cherry"));

        // Checking if a value exists
        System.out.println("Does the Hashtable contain value 4? " + hashtable.containsValue(4));

        // Removing a key-value pair
        hashtable.remove("Date");
        System.out.println("Hashtable after removing 'Date': " + hashtable);

        // Iterating through the Hashtable
        System.out.println("Iterating through the Hashtable:");
        for (java.util.Map.Entry<String, Integer> entry : hashtable.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Clearing the Hashtable
        hashtable.clear();
        System.out.println("Hashtable after clearing: " + hashtable);

        // Checking if the Hashtable is empty
        System.out.println("Is the Hashtable empty? " + hashtable.isEmpty());
    }

    public static void main(String[] args) {
        Map mapDemo = new Map();
        mapDemo.HashMapDemo();
        mapDemo.LinkedHashMapDemo();
        mapDemo.TreeMapDemo();
        mapDemo.HashtableDemo();
    }
}
