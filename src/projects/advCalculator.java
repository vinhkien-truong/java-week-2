package projects;
import java.util.Scanner;

public class advCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numUserOne = getNumFromUser(scanner, "first");
        double numUserSecond = getNumFromUser(scanner, "second");
        String opUser = getOperatorFromUser(scanner);
        System.out.println("a : " + numUserOne + " b : " + numUserSecond + " op : " + opUser);
        System.out.println("result : "+ calculate(numUserOne, numUserSecond, opUser));

    }
    private static double getNumFromUser(Scanner scanner,String label) {
        double resultDouble = 0;
        while (true)
        {
            System.out.print("Enter the "+label+" number: ");
            if (scanner.hasNextDouble())
            {
                resultDouble = (double) scanner.nextDouble();
                scanner.nextLine(); // consume leftover newline
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard invalid token
            }
        }
        return resultDouble;
    }
    private static String getOperatorFromUser(Scanner scanner) {
        String result;
        while (true) {
            System.out.print("Enter the operator (+ - * / %): ");
            result = scanner.nextLine().trim();

            if (result.equals("+") || result.equals("-")
                    || result.equals("*") || result.equals("/") || result.equals("%")) {
                return result;
            }

            System.out.println("Invalid input. Please enter a valid operator. : " + result);
        }
    }
    
    public static int add(int a, int b) { return a + b; }
    public static double add(double a, double b) { return a + b;}

    public static int substract(int a, int b) { return a - b; }
    public static double substract(double a, double b) { return a - b;}

    public static int multiply(int a, int b) { return a * b; }
    public static double multiply(double a, double b) { return a * b;}

    public static int divide(int a, int b) { 
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b; 
}
    public static double divide(double a, double b) { 
        if (b == 0) throw new ArithmeticException("Division by zero");
        return a / b;
    }

    public static int mod(int a, int b) { return a % b; }
    public static double mod(double a, double b) { return a % b;}

    private static double calculate(double a, double b, String op) {
        return switch (op) {
            case "+" -> add(a, b);
            case "-" -> substract(a, b);
            case "*" -> multiply(a, b);
            case "/" -> divide(a, b);
            case "%" -> mod(a, b);
            default -> throw new IllegalArgumentException("Invalid operator");
        };
    }
}
