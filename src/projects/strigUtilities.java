package projects;
import java.util.Scanner;

public class strigUtilities {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Number of vowels: " + countVowels(input));
        System.out.println("Reversed string: " + reverseString(input));
        System.out.println("Is palindrome: " + isPalindrome(input));
    }
    public static boolean isPalindrome(String input) {
        boolean isPalindrome = true;
        int i = 0, j = input.length()-1;
        while(isPalindrome) {
            if (input.charAt(i) != input.charAt(j)){
                isPalindrome = false;
            } else if (i >= j) {
                break;
            }
            i++;
            j--;
        }
        /*if (isPalindrome) {
            System.out.println("it's a palindrome");
        } else {
            System.out.println("it's not a palindrome");
        }*/
        return isPalindrome;
    }
    public static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }
    public static int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}
