package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] arr = {12, 4, 7, 9, 8, 11};
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
        int[] arrCopy = Arrays.copyOf(arr, arr.length);
        System.out.println("Copy: " + Arrays.toString(arrCopy));
        int index = Arrays.binarySearch(arrCopy, 7);
        System.out.println("Index of 7: " + index);
        System.out.println("Arrays equal? " + Arrays.equals(arr, arrCopy));
        System.out.println("Same reference? " + (arr == arrCopy));

    }
}

