import java.util.Scanner;

/**

        * MAIN CLASS - UseCase2PalindromeCheckerApp

*

Use Case 2: Hardcoded Palindrome Validation

* Description:
        * This class demonstrates basic palindrome validation
* using a hardcoded string value.

* At this stage, the application:
        * - Stores a predefined string
* - Compares characters from both ends
* - Determines whether the string is a palindrome
* - Displays the result on the console

* This use case introduces fundamental comparison logic
* before using advanced data structures.
*

        * @author Developer
* @version 2.0
        */
public class PalindromeCheckerApp {
    /**
     * Application entry point for UC2.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word=sc.next();
        for(int i=0;i<word.length()/2;i++){
            if(word.charAt(i)!=word.charAt(word.length()-1-i)){
                System.out.println("Not a palindrome");
                return;
            }
    }
        System.out.println("Palindrome");
}
}