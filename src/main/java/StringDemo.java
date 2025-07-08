

public class StringDemo {
    public static void main(String [] args) {
        // StringDemo is a class that demonstrates various string operations in Java.
        // It includes methods to manipulate and display strings.

        // Example of string creation
        String str1 = "Hello, World!";
        String str2 = "Java Programming";

        // Displaying the strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Concatenating strings
        String concatenated = str1 + " " + str2; // Using the + operator to concatenate strings
        System.out.println("Concatenated String: " + concatenated);

        // Finding the length of a string
        int length = str1.length();  //space is also counted in length
        System.out.println("Length of String 1: " + length);

        // Converting to uppercase
        String upperCaseStr = str1.toUpperCase();
        System.out.println("String 1 in Uppercase: " + upperCaseStr);

        // Converting to lowercase
        String lowerCaseStr = str2.toLowerCase();
        System.out.println("String 2 in Lowercase: " + lowerCaseStr);

        // Checking if a string contains a substring
        boolean contains = str1.contains("World");
        System.out.println("Does String 1 contain 'World'? " + contains);

        // Replacing characters in a string
        String replacedStr = str2.replace("Java", "Python");
        System.out.println("String 2 after replacement: " + replacedStr);

        // Splitting a string into an array
        String[] words = str1.split(" "); // Splitting the string by space
        System.out.println("Words in String 1:");
        for (String word : words) {
            System.out.println(word); // Iterating through the array of words
        }
        // Checking if two strings are equal
        boolean isEqual = str1.equals("Hello, World!");
        System.out.println("Is String 1 equal to 'Hello, World!'? " + isEqual);

        //reversing a string
        String reversedStr = new StringBuilder(str1).reverse().toString(); // Using StringBuilder to reverse the string
        System.out.println("Reversed String 1: " + reversedStr);




    }
}
