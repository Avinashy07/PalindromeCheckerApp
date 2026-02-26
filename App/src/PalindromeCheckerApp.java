import java.util.Scanner;

// Service Class
class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        if (input == null || input.length() == 0) {
            return true;
        }

        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            if (characters[start] != characters[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

// Main Class (Must Match File Name)
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.println("===== UC11: Object-Oriented Palindrome Service =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
    //grhd
}
