package arrays.exercises;
import java.util.Scanner;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.Arrays;
public class Exercise6
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        Scanner scanner = new Scanner(System.in);
        int[] arr = {4, 12, 2, 13, 9};
        Arrays.sort(arr);

        int userNum;
        while (true) {
            System.out.println("put a num");
            if (scanner.hasNextInt()) {
                userNum = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid token
            }
        }
        int index = Arrays.binarySearch(arr, userNum);

        System.out.println("Sorted array: " + Arrays.toString(arr));

        // index == -1 means not found
        if (index > -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
