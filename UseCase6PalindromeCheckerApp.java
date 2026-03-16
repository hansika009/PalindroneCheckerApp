import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * UC6: Queue + Stack Based Palindrome Check
 * Compares FIFO (Queue) and LIFO (Stack) outputs.
 */
public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {
        String input = "racecar";
        
        // Step 1: Initialize Stack and Queue
        Stack<Character> stack = new Stack<>();
        // In Java, Queue is an interface, so we use LinkedList to implement it
        Queue<Character> queue = new LinkedList<>();

        // Step 2: Fill both structures
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);    // Adds to Stack (LIFO)
            queue.add(c);     // Adds to Queue (FIFO)
        }

        boolean isPalindrome = true;

        // Step 3: Compare Dequeue vs Pop
        while (!stack.isEmpty()) {
            // pop() gets the LAST letter added
            // remove() (dequeue) gets the FIRST letter added
            if (!stack.pop().equals(queue.remove())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Testing word: " + input);

        // Step 4: Final Result
        if (isPalindrome) {
            System.out.println("Result: It matches! This is a palindrome.");
        } else {
            System.out.println("Result: Mismatch detected. Not a palindrome.");
        }
    }
}