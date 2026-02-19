import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args){
        System.out.println("Welcome to plaindrome checker ");
        System.out.println("version : 1.0");
        System.out.println("system instalized successfully");
        System.out.println(" " );
        String input ="noon";

        Stack<Character> stack =new Stack<>();

        for(char c: input.toCharArray()){
            stack.push(c);
        }

        boolean isPalindrome =true;

        for(char c : input.toCharArray()){
            if(c!=stack.pop()){
                isPalindrome=false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(input+" is a palindrome");
        }
        else {
            System.out.println(input +"is not  a palindrome");
        }
    }

}
