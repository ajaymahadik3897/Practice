


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