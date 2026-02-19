import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        System.out.println("Welcome to Palindrome Checker App - UC5 (Stack Based)");
        System.out.println("-----------------------------------------------------");

        // Input string to check (change this to test other inputs)
        String input = "madam";

        System.out.println("Input String: " + input);

        // Create a stack of Characters
        Stack<Character> stack = new Stack<>();

        // Push all characters of the input string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Pop characters from stack and build reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        System.out.println("Reversed String (from Stack): " + reversed);

        // Check if input equals reversed string
        if (input.equals(reversed.toString())) {
            System.out.println("Result: The string is a PALINDROME.");
        } else {
            System.out.println("Result: The string is NOT a palindrome.");
        }
    }

}
