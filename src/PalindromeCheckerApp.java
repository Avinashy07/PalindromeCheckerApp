public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to plaindrome checker ");
        System.out.println("version : 1.0");
        System.out.println("system instalized successfully");

        String word = "madam";
        boolean ispalindrome =true;
        // Variable to store reversed string
       for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                ispalindrome=false;
                break;

           }
        }
        // Check if original and reversed strings are equal
        if (ispalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }


    }

}
