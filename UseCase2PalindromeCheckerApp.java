/**
 * UC2: Print a Hardcoded Palindrome Result
 * This class checks if a specific hardcoded word is a palindrome.
 */
public class UseCase2PalindromeCheckerApp{

    public static void main(String[] args) {
        // Step 1: Hardcoded String (The word we want to check)
        String input = "madam"; 
        
        // Step 2: Logic to check if it's a palindrome
        // For UC2, we manually compare it to its reverse
        String reverse = "madam"; 

        System.out.println("Word to check: " + input);

        // Step 3: Conditional Statement (if-else)
        if (input.equals(reverse)) {
            System.out.println("Result: Yes, it is a palindrome!");
        } else {
            System.out.println("Result: No, it is not a palindrome.");
        }
        
        // Program exits here
    }
}