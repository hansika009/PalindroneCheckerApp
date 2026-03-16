import java.util.ArrayDeque;
import java.util.Deque;

/**
 * UC7: Deque-Based Optimized Palindrome Checker
 * Uses a Double-Ended Queue to compare characters from both ends.
 */
public class UseCase7PalindromeCheckerApp{

    public static void main(String[] args) {
        String input = "deified";
        
        // Step 1: Initialize the Deque
        // ArrayDeque is a very fast implementation of the Deque interface
        Deque<Character> deque = new ArrayDeque<>();

        // Step 2: Insert all characters into the deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Step 3: Compare front and rear elements
        // We keep going as long as there is more than 1 character left
        while (deque.size() > 1) {
            // Remove the very first and very last character
            char first = deque.removeFirst();
            char last = deque.removeLast();

            // If they don't match, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);

        // Step 4: Display Result
        if (isPalindrome) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Mismatch found. Not a palindrome.");
        }
    }
}