import java.util.*;
import java.util.*;

public class PalindromeCheckerApp {

    // 1️⃣ Two-Pointer Approach
    public static boolean twoPointer(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // 2️⃣ Stack Approach
    public static boolean stackMethod(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    // 3️⃣ Deque Approach
    public static boolean dequeMethod(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new LinkedList<>();

        for (char ch : input.toCharArray()) {
            deque.addLast(ch);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC13: Performance Comparison =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Measure Two Pointer
        long start1 = System.nanoTime();
        boolean result1 = twoPointer(input);
        long end1 = System.nanoTime();

        // Measure Stack
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Measure Deque
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nResults:");
        System.out.println("Two-Pointer Result: " + result1 +
                " | Time: " + (end1 - start1) + " ns");

        System.out.println("Stack Method Result: " + result2 +
                " | Time: " + (end2 - start2) + " ns");

        System.out.println("Deque Method Result: " + result3 +
                " | Time: " + (end3 - start3) + " ns");

        scanner.close();
    }
}