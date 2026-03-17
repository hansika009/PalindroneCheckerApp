import java.util.*;

/**
 * UC12: Strategy Pattern for Palindrome Algorithms
 * Demonstrates Interfaces and Polymorphism.
 */

// 1. The Strategy Interface
interface PalindromeStrategy {
    boolean isPalindrome(String text);
}

// 2. Implementation A: Stack Strategy (LIFO)
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        Stack<Character> stack = new Stack<>();
        for (char c : clean.toCharArray()) stack.push(c);
        
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) reversed.append(stack.pop());
        
        return clean.equals(reversed.toString());
    }
}

// 3. Implementation B: Two-Pointer Strategy (Efficient)
class TwoPointerStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0, right = clean.length() - 1;
        while (left < right) {
            if (clean.charAt(left++) != clean.charAt(right--)) return false;
        }
        return true;
    }
}

// 4. The Context - This class uses whatever strategy we give it
class PalindromeContext {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeStrategy(String text) {
        return strategy.isPalindrome(text);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        PalindromeContext context = new PalindromeContext();
        String testWord = "Was it a car or a cat I saw";

        // Use Stack Strategy
        context.setStrategy(new StackStrategy());
        System.out.println("Using Stack Strategy: " + context.executeStrategy(testWord));

        // Switch to Two-Pointer Strategy at Runtime!
        context.setStrategy(new TwoPointerStrategy());
        System.out.println("Using Two-Pointer Strategy: " + context.executeStrategy(testWord));
    }
}