import java.util.Stack; // We need to import the Stack class from Java's utility library

/**
 * UC5: Stack-Based Palindrome Checker
 * This class uses the LIFO property of a Stack to reverse a string.
 */
public class UseCase5PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "noon";
        
        // Step 1: Create a Stack of Characters
        Stack<Character> stack = new Stack<>();

        // Step 2: Push all characters of the string into the stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Step 3: Pop characters and build the reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            // pop() takes the top item off (the last character added)
            reversed = reversed + stack.pop();
        }

        System.out.println("Input word: " + input);
        System.out.println("Stack-reversed word: " + reversed);

        // Step 4: Compare
        if (input.equals(reversed)) {
            System.out.println("Result: Success! It is a palindrome.");
        } else {
            System.out.println("Result: Not a palindrome.");
        }
    }
}