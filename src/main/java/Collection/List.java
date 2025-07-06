package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
//all the methods used in Arraylist are also available in linklist //no any difference in methods //only difference is in the implementation
public class List {
    void ArraylistDemo() {
        //ArrayList is a resizable array implementation of the List interface.
        //It allows for dynamic resizing, meaning you can add or remove elements without needing to specify the size in advance.
        ArrayList<String> list = new ArrayList<>(); // Create an ArrayList of String //for integer use ArrayList<Integer> list = new ArrayList<>();
        //adding elements to the ArrayList
        list.add("Apple");   //add is used to add elements to the ArrayList
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        //printing the ArrayList
        System.out.println("ArrayList: " + list);
        //accessing elements
        System.out.println("First element: " + list.get(0)); //get is used to access elements at a specific index
        //size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size()); //size is used to get the number of elements in the ArrayList
        //removing an element
        list.remove("Cherry"); //remove is used to remove an element from the ArrayList

        System.out.println("ArrayList after removing 'Cherry': " + list);


        //checking if an element exists
        System.out.println("Does the ArrayList contain 'Banana'? " + list.contains("Banana")); //contains is used to check if an element exists in the ArrayList
        //iterating through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String fruit : list) { //for-each loop is used to iterate through the elements of the ArrayList
            System.out.println(fruit);
        }
        //or
        //System.out.println("Iterating using index:");
        //for (int i = 0; i < list.size(); i++) { //using a for loop to iterate through the elements of the ArrayList
         //   System.out.println("Element at index " + i + ": " + list.get(i)); }


        //clearing the ArrayList
        list.clear(); //clear is used to remove all elements from the ArrayList
        System.out.println("ArrayList after clearing: " + list);
        //checking if the ArrayList is empty
        System.out.println("Is the ArrayList empty? " + list.isEmpty()); //isEmpty is used to check if the ArrayList is empty
        //adding elements again to demonstrate resizing
        list.add("Fig");
        list.add("Grape");
        System.out.println("ArrayList after adding more elements: " + list);
        //sorting the ArrayList
        list.sort(String::compareTo); //sort is used to sort the elements of the ArrayList in natural order
        System.out.println("Sorted ArrayList: " + list);
        //reversing the ArrayList
        ArrayList<String> reversedList = new ArrayList<>(list); // Create a new ArrayList to hold the reversed elements
        for (int i = 0; i < list.size(); i++) {
            reversedList.set(i, list.get(list.size() - 1 - i)); //set is used to set the element at a specific index
        }
        System.out.println("Reversed ArrayList: " + reversedList);
        //copying the ArrayList
        ArrayList<String> copiedList = new ArrayList<>(list); // Create a new ArrayList to hold the copied elements
        System.out.println("Copied ArrayList: " + copiedList);
        //checking if two ArrayLists are equal
        boolean areEqual = list.equals(copiedList); //equals is used to check if two ArrayLists are equal
        System.out.println("Are the original and copied ArrayLists equal? " + areEqual);

    }

    void linkedListDemo() {
        //LinkedList is a doubly-linked list implementation of the List interface.
        //It allows for efficient insertion and removal of elements at both ends.
        //It is not covered in this example, but you can create a LinkedList similarly to ArrayList.
        LinkedList<String> linkedList = new LinkedList<>();
        //adding elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");

        //printing the LinkedList
        System.out.println("LinkedList: " + linkedList);
        //accessing elements
        System.out.println("First element: " + linkedList.get(0));
        //size of the LinkedList
        System.out.println("Size of LinkedList: " + linkedList.size());
        //removing an element
        linkedList.remove("Cherry");
        //replacing an element
        linkedList.set(1, "Date"); //set is used to replace an element at a specific index
        System.out.println("LinkedList after removing 'Cherry' and replacing 'Banana' with 'Date': " + linkedList);


    }

    public static void main (String[] args) {
        List listDemo = new List();  // Create an instance of the List class
         // This is necessary to call the non-static method ArraylistDemo
        listDemo.ArraylistDemo(); // Call the method to demonstrate ArrayList functionality
        System.out.println("----------------------------");
        System.out.println("----------------------------");
        listDemo.linkedListDemo(); // Call the method to demonstrate LinkedList functionality
    }

}
