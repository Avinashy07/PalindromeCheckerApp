import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
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


