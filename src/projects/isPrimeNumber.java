package projects;
import java.util.Scanner;

public class isPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numUser = getNumFromUser(scanner);
        System.out.println("this number " + numUser + " " + (isPrime(numUser) ? "a prime number" : "is not a prime number"));
        for (int i = 1; i < 100 ; i++) {
            if(isPrime(i)) {
                System.out.println("prime num :" + i);
            }
        }
    }
    public static boolean isPrime(int n) {
        if ( n <= 1) {
            return false;
        }

        for (int i = 2; i < n ;i++) {
            if ( n % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int getNumFromUser(Scanner scanner) {
        int resultint = 0;
        while (true)
        {
            System.out.print("Enter the number: ");
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
