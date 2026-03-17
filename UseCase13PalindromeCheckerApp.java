/**
 * UC13: Performance Comparison
 * Measures and compares the execution time of different algorithms.
 */
public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {
        // We use a long string to see a real difference in speed
        String testString = "A man a plan a canal Panama".repeat(100); 
        String clean = testString.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // --- Measure Algorithm 1: String Reversal ---
        long start1 = System.nanoTime();
        checkByReversal(clean);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        // --- Measure Algorithm 2: Two-Pointer ---
        long start2 = System.nanoTime();
        checkByTwoPointers(clean);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        // Step 3: Display Results
        System.out.println("Performance Results (in nanoseconds):");
        System.out.println("1. String Reversal Logic: " + time1 + " ns");
        System.out.println("2. Two-Pointer Logic:     " + time2 + " ns");
        
        if (time2 < time1) {
            System.out.println("\nConclusion: Two-Pointer is faster by " + (time1 - time2) + " ns!");
        }
    }

    // Logic from UC3
    public static boolean checkByReversal(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return s.equals(reversed);
    }

    // Logic from UC4
    public static boolean checkByTwoPointers(String s) {
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) return false;
        }
        return true;
    }
}