/**
 * UC1: Application Entry & Welcome Message
 * This class serves as the entry point for the Palindrome Checker App.
 */
public class UseCase1PalindromeCheckerApp {

    // The 'static' keyword allows this to run without creating an object first
    public static void main(String[] args) {
        
        // Defining application details
        String appName = "Palindrome Checker App";
        String version = "1.0.0";

        // Displaying the Welcome Message to the Console
        System.out.println("========================================");
        System.out.println("   Welcome to " + appName);
        System.out.println("   Version: " + version);
        System.out.println("========================================");
        
        System.out.println("Status: System initialized and ready.");
        
        // The program will naturally move to the next logic or exit here
    }
}