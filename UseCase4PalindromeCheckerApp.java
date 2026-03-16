/**
 * UC4: Character Array Based Palindrome Check
 * This class uses the two-pointer technique for an efficient check.
 */
public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "level";
        
        // Step 1: Convert string to a character array (char[])
        char[] charArray = input.toCharArray();
        
        // Step 2: Initialize two pointers
        int start = 0;                  // Pointer at the beginning
        int end = charArray.length - 1; // Pointer at the end
        boolean isPalindrome = true;    // Assume it is a palindrome initially

        // Step 3: Two-Pointer Approach
        while (start < end) {
            // Compare characters at both ends
            if (charArray[start] != charArray[end]) {
                isPalindrome = false; // If they don't match, it's not a palindrome
                break;               // Stop checking immediately
            }
            // Move pointers toward the middle
            start++;
            end--;
        }

        System.out.println("Checking string: " + input);

        // Step 4: Display Result
        if (isPalindrome) {
            System.out.println("Result: It is a palindrome!");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}