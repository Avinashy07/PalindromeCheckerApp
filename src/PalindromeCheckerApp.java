public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to plaindrome checker ");
        System.out.println("version : 1.0");
        System.out.println("system instalized successfully");

        String word = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a loop
        for(int i=word.length()-1;i>=0;i--){
            reversed=reversed+word.charAt(i);
        }

        // Check if original and reversed strings are equal
        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }


    }

}
