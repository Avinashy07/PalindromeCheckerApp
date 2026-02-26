import java.util.Scanner;

public class PalindromeCheckerApp {

    // Node class for Singly Linked List
    public static boolean isPalindrome(String input, int start, int end) {

        // Base Condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters do not match
        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        // Recursive call for next inner characters
        return isPalindrome(input, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC9: Recursive Palindrome Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Normalize input (optional but recommended)
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        boolean result = isPalindrome(input, 0, input.length() - 1);

        if (result) {
            System.out.println("Result: The given string is a Palindrome.");
        } else {
            System.out.println("Result: The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}
