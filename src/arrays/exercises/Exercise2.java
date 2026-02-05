package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int total = 0;

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
                total += matrix[i][j];
            }
            System.out.println();
        }
        System.out.println(total);
    }
}
