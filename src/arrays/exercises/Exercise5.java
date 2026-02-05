package arrays.exercises;
import java.util.Scanner;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
public class Exercise5
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        Scanner scanner = new Scanner(System.in);
        int[] nums = {4,3,5,1,7,8,9,2};
        int userNum;
        System.out.println("put a number :");
        while (true) {
            if (scanner.hasNextInt()) {
                userNum = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid token
            }
        }

        int index = -1;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == userNum)
            {
                index = i;
                break;
            }
        }
        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
        
    }
}
