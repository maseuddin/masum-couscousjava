package inputscanner;

import java.util.Scanner;

public class InputWithScanner {

    public static void main(String[] args) {
        // Set up scanner object
        Scanner scan = new Scanner(System.in);

        // Read an int from the user
        System.out.println("Please enter a number: ");
        int first = scan.nextInt();    

        scan.nextLine(); // <- This extra call will consume rest of the previous line including the newline character

        // Read a whole line from the user
        System.out.println("Please enter a message: ");
        String second = scan.nextLine(); // <- This will no longer be skipped

        // Print the responses
        System.out.println("First value = " + first);
        System.out.println("Second value = " + second);
    }
}