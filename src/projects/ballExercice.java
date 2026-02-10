package projects;
import java.util.Scanner;

public class ballExercice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] target = {4,21};
        int[] userInput = new int[2];
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = getNumFromUser(scanner, i);  
        }
        System.out.println("User input: " + userInput[0] + ", " + userInput[1]);
        System.out.println("Target: " + target[0] + ", " + target[1]);
        int i = 1;
        while ( userInput[0] * i <= target[0] 
            && userInput[1] * i <= target[1]) {
                if (userInput[0] * i == target[0] && userInput[1] * i == target[1]) {
                    System.out.println("Congratulations! You've hit the target!");
                return;
            }
            i++;
        }
        System.out.println("Try again! Your input is not correct.");
    }
    private static int getNumFromUser(Scanner scanner, int index) {
        int resultint = 0;
        while (true)
        {
            System.out.print("Enter the number for position " + (index + 1) + ": ");
            if (scanner.hasNextInt())
            {
                resultint = scanner.nextInt();
                scanner.nextLine(); // consume leftover newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid token
            }
        }
        return resultint;
    }
}
