
List - A collection that maintains the order of elements and allows duplicates.
## List Interface
arrayList and LinkedList are two common implementations of the List interface in Java. methods are similar for both, but their underlying implementations differ.
| Method          | Description                               | Example (Same for both)   |
| --------------- | ----------------------------------------- | ------------------------- |
| `add()`         | Adds an element                           | `list.add("Apple");`      |
| `add(index, e)` | Adds at a specific position               | `list.add(1, "Banana");`  |
| `get(index)`    | Gets element at index                     | `list.get(0);`            |  
| `indexOf(e)`    | Returns index of first occurrence         | `list.indexOf("Apple");`  |
| `set(index, e)` | Replaces element at index                 | `list.set(1, "Mango");`   |
| `remove(index)` | Removes element at index                  | `list.remove(2);`         |
| `contains(e)`   | Checks if list contains element           | `list.contains("Apple");` |
| `size()`        | Returns number of elements                | `int size = list.size();` |
| `isEmpty()`     | Returns true if list is empty             | `list.isEmpty();`         |
| `clear()`       | Removes all elements                      | `list.clear();`           |
| `equals()`      | Compares two lists for equality           | `list1.equals(list2);`    |
| `sort()`        | Sorts elements (via `Collections.sort()`) | `Collections.sort(list);` |
| `max()`       | Returns maximum element (via `Collections.max()`) | `String max = Collections.max(list);` |
| `min()`       | Returns minimum element (via `Collections.min()`) | `String min = Collections.min(list);` |


#Set - A collection that does not allow duplicates and does not guarantee order.
## Set Interface
The Set interface is implemented by various classes in Java, such as HashSet, LinkedHashSet, and TreeSet. Each has its own characteristics regarding order and performance.
| Method          | Description                               | Example (Same for all)    |
| --------------- | ----------------------------------------- | ------------------------- |
| `add(e)`        | Adds an element                           | `set.add("Apple");`       |
| `remove(e)`     | Removes an element                        | `set.remove("Banana");`   |
| `contains(e)`   | Checks if set contains element            | `set.contains("Apple");`  | In a Set, you cannot use get(index) because a Set does not support indexed access.
| `size()`        | Returns number of elements                | `int size = set.size();`  |
| `isEmpty()`     | Returns true if set is empty              | `set.isEmpty();`          |
| `clear()`       | Removes all elements                      | `set.clear();`            |
| `equals()`      | Compares two sets for equality            | `set1.equals(set2);`      |
| `iterator()`    | Returns an iterator for the set           | `Iterator<String> it = set.iterator();` |
| `toArray()`     | Converts set to an array                  | `String[] arr = set.toArray(new String[0]);` |

# Queue - A collection that follows the First-In-First-Out (FIFO) principle.
## Queue Interface
The Queue interface is implemented by various classes in Java, such as LinkedList, PriorityQueue, and ArrayDeque. Each has its own characteristics regarding order and performance.
| Method          | Description                               | Example (Same for all)    |
| --------------- | ----------------------------------------- | ------------------------- |
| `offer(e)`      | Adds an element to the end of the queue   | `queue.offer("Apple");`   |
| `poll()`        | Retrieves and removes the head of the queue | `String head = queue.poll();` |
| `peek()`        | Retrieves but does not remove the head of the queue | `String head = queue.peek();` |
| `remove()`      | Removes the head of the queue             | `queue.remove();`         |
| `size()`        | Returns number of elements in the queue   | `int size = queue.size();`|
| `isEmpty()`     | Returns true if queue is empty            | `queue.isEmpty();`        |
| `max()`       | Returns maximum element (via `Collections.max()`) | `String max = Collections.max(queue);` |


**difference between list, set, and queue:**
| Feature         | List                                   | Set                                    | Queue                                  |
| --------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| Order           | Maintains order of elements            | Does not guarantee order               | Follows FIFO order                     |
| Duplicates      | Allows duplicates                      | Does not allow duplicates              | Allows duplicates                      |
| Access          | Accessed by index                      | Accessed by value                      | Accessed by head (FIFO)                |

**different methods of List, Set, and Queue:**
| Feature         | List                                   | Set                                    | Queue                                  |
| --------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| `add(e)`        | Adds an element                        | Adds an element                        | Adds an element to the end             |
| `remove(e)`     | Removes element at index               | Removes an element                     | Removes the head of the queue          |
| `contains(e)`   | Checks if list contains element        | Checks if set contains element         | Not applicable                          |
| `get(index)`    | Gets element at index                  | Not applicable                         | Not applicable                          |
 other all methods are similar across List, Set, and Queue, but their behavior differs based on the collection type.

# Map - A collection that maps keys to values, allowing for fast retrieval by key.
## Map Interface
The Map interface is implemented by various classes in Java, such as HashMap, LinkedHashMap, and TreeMap. Each has its own characteristics regarding order and performance.
| Method          | Description                               | Example (Same for all)    |
| --------------- | ----------------------------------------- | ------------------------- |
| `put(k, v)`     | Adds a key-value pair                     | `map.put("key", "value");`|
| `get(k)`        | Retrieves value by key                    | `String value = map.get("key");` |
| `remove(k)`     | Removes key-value pair by key             | `map.remove("key");` |
| `containsKey(k)`| Checks if map contains key                 | `map.containsKey("key");` |
| `containsValue(v)`| Checks if map contains value             | `map.containsValue("value");` |
| `size()`        | Returns number of key-value pairs          | `int size = map.size();`  |
| `isEmpty()`     | Returns true if map is empty               | `map.isEmpty();`          |
| `clear()`       | Removes all key-value pairs                | `map.clear();`            |   
| `max()`      | Returns maximum value (via `Collections.max()`) | `String max = Collections.max(map.values());` |
| `min()`      | Returns minimum value (via `Collections.min()`) | `String min = Collections.min(map.values());` |

difference between list, set, and map:
| Feature         | List                                   | Set                                    | Map                                    |
| --------------- | -------------------------------------- | -------------------------------------- | -------------------------------------- |
| Order           | Maintains order of elements            | Does not guarantee order               | Does not maintain order of keys        |
| Duplicates      | Allows duplicates                      | Does not allow duplicates              | Keys must be unique, values can be duplicated |
| Access          | Accessed by index                      | Accessed by value                      | Accessed by key                        |
| Use Case        | When order matters, duplicates allowed | When uniqueness matters, order not important | When key-value association is needed   |
| Performance     | Generally slower for large lists      | Generally faster for large sets        | Fast retrieval by key                  |


**Main differences between List and Set in Java:**
1.List allows duplicate elements; Set does not allow duplicates.
2.List maintains insertion order; Set may not (except for LinkedHashSet).
3.List supports indexed access (get(index)); Set does not.
4.List implementations: ArrayList, LinkedList, etc.
5.Set implementations: HashSet, LinkedHashSet, TreeSet, etc.

**Main differences between List and Queue in Java:**
1.List allows access by index (get(index)); Queue does not.
2.List allows duplicates and maintains insertion order; Queue also allows duplicates but is designed for FIFO (First-In-First-Out) operations.
3.List is used for storing and accessing elements at any position; Queue is used for processing elements in order (adding at the end, removing from the front).
4 List common implementations: ArrayList, LinkedList; Queue common implementations: LinkedList, PriorityQueue, ArrayDeque.

differece between HashMap and HashTable in Java:
| Feature         | HashMap                               | Hashtable                             |
| --------------- | ------------------------------------- | -------------------------------------- |
| Synchronization | Not synchronized (not thread-safe)    | Synchronized (thread-safe)             |
| Null Values     | Allows one null key and multiple null values | Does not allow null keys or values    |
| Performance     | Generally faster due to no synchronization overhead | Slower due to synchronization overhead |
| Iteration       | Uses Iterator (fail-fast)             | Uses Enumerator (not fail-fast)        |
| Legacy          | Part of Java Collections Framework (JCF) | Legacy class (part of earlier Java versions) |
| Use Case        | Preferred for non-threaded applications | Preferred for multi-threaded applications |
other differences are related to performance, synchronization, and null handling. HashMap is generally preferred in modern applications due to its flexibility and performance advantages.


**commonly used collections in Java:**
| Type            | Implementation | Best Use Case                          |
| --------------- | -------------- | -------------------------------------- |
| `ArrayList`     | List           | General-purpose dynamic array          |
| `LinkedList`    | List, Queue    | Frequent insertion/removal             |
| `HashSet`       | Set            | Fast, unique elements, no order        |
| `LinkedHashSet` | Set            | Unique + preserves insertion order     |
| `TreeSet`       | Set            | Unique + sorted                        |
| `HashMap`       | Map            | Fast key-value lookups, no order       |
| `LinkedHashMap` | Map            | Key-value + preserves insertion order  |
| `TreeMap`       | Map            | Key-value + sorted keys                |
| `PriorityQueue` | Queue          | Priority-based processing (e.g. tasks) |
| `ArrayDeque`    | Queue, Deque   | Stack & queue replacement (fast)       |


