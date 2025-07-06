import java.util.Arrays;
import java.util.Collections;

public class Array {
    static void singleDiamentionalArray() {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 200;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //or
        // int[] arr = {10, 20, 30, 40, 50};
        System.out.println("Single-dimensional Array Example:");
        for (int i = 0; i < arr.length; i++) {  //length is a property of the array that returns the number of elements in the array
            System.out.println(arr[i]);
        }

        System.out.println("length of array: " + arr.length);
        System.out.println("last element of array: " + arr[arr.length - 1]);
        System.out.println("first element of array: " + arr[0]);

        //sorting the array
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));

        //searching the array
        int searchElement = 30;
        boolean found = false;  //boolean variable to check if the element is found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchElement) {
                found = true;  //set found to true if the element is found
                System.out.println("Element " + searchElement + " found at index: " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }

        //reversing the array
        for (int i = 0; i < arr.length / 2; i++) {  //reversing the array in place // we only need to iterate through half of the array
            int temp = arr[i];  //swap the elements // using a temporary variable // to hold the value of the current element
            arr[i] = arr[arr.length - 1 - i];  //swap the current element with the last element
            arr[arr.length - 1 - i] = temp;  //assign the value of the temporary variable to the last element
        }
        System.out.println("Reversed array: " + Arrays.toString(arr));

        //copying the array
        int[] copiedArray = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));
        //checking if two arrays are equal
        boolean areEqual = Arrays.equals(arr, copiedArray);
        System.out.println("Are the original and copied arrays equal? " + areEqual);

        //finding the maximum and minimum elements
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);

        //finding the sum and average of the elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;  //casting to double to get the average as a decimal value
        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);


        //finding the maximum and minimum elements using streams (Java 8+)
        //int max = Arrays.stream(arr).max().getAsInt(); //max value using streams
        //int min = Arrays.stream(arr).min().getAsInt(); //min value using streams
        //System.out.println("Max value: " + max);
        //System.out.println("Min value: " + min);


        //finding the frequency of an element
        int frequencyElement = 10;
        int frequency = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == frequencyElement) {
                frequency++;
            }
        }
        System.out.println("Frequency of element " + frequencyElement + ": " + frequency);



    }

    void multiDiamentionalArray() {
    //creating a multi-dimensional array
        System.out.println("Multi-dimensional Array Example:");
        int[][] arr = {
            {1, 2, 3},
            {4, 10, 6},
            {7, 8, 9}
        };
        //or
        // int[][] arr = new int[3][3];
        //arr[0][0] = 1;
        //arr[0][1] = 2;
        //arr[0][2] = 3;
        //arr[1][0] = 4;
        //arr[1][1] = 5;
        //arr[1][2] = 6;
        //arr[2][0] = 7;
        //arr[2][1] = 8;
        //arr[2][2] = 9;


        //printing the multi-dimensional array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
         //length of the multi-dimensional array
        System.out.println("Number of rows: " + arr.length);  //output: 3
        System.out.println("Number of columns in first row: " + arr[0].length); //output: 3
        System.out.println("Number of columns in second row: " + arr[1].length);
        System.out.println("Number of rows and columns: " + arr.length + "x" + arr[0].length); //output: 3x3


        //accessing an element
        System.out.println("Element at (1,2): " + arr[1][2]);

        //finding the sum of all elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Sum of all elements: " + sum);

        //sorting a multi-dimensional array  // sorting each row individually
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
        System.out.println("Sorted multi-dimensional array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        singleDiamentionalArray();
        System.out.println("---------------------------------");
        Array array = new Array();
        array.multiDiamentionalArray();
    }
}
