package projects;
import java.util.Scanner;
public class Pyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userNum = 0;
        System.out.println("write a number");
        while (true) {
            if (scanner.hasNextInt()) {
                userNum = scanner.nextInt();
                System.out.println(displayPyramid(userNum));
                break;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // discard invalid token
            }
        }

        
    }

    public static String displayPyramid(int userNum) {
        String result = "";
        for (int i = userNum; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                //System.out.print("*");
                result = result.concat("*");
            }
            result = result.concat("\n");
        }
        result = result.concat("\n");
        for (int i = 0; i < userNum; i++) {
            for (int j = 0; j <= i; j++) {
                result = result.concat("*");
            }
            result = result.concat("\n");
        }
        return result;
    }
}
