package String;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        // Initialize a scanner to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to reverse: ");
        String original = scanner.nextLine();
        
        // We use StringBuilder because it has a built-in reverse() function
        StringBuilder reversed = new StringBuilder(original);
        
        // Convert the StringBuilder back to a String and print it
        System.out.println("Reversed string: " + reversed.reverse().toString());
        
        scanner.close();
    }
}
