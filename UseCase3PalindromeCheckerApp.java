/**
 * UC3: Palindrome Check Using String Reverse
 * This class demonstrates reversing a string manually using a for loop.
 */
public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        // The word we want to check
        String original = "radar";
        String reversed = ""; // This starts empty

        // Step 1: Use a 'for loop' to reverse the string
        // We start from the last index (length - 1) and go down to 0
        for (int i = original.length() - 1; i >= 0; i--) {
            // String Concatenation: Building the reversed string character by character
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Step 2: Compare using equals()
        if (original.equals(reversed)) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}