import java.util.Random;
import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        // 1. Print initials in large block letters using corresponding characters (M and S).
        System.out.println("M   M  SSSS");
        System.out.println("MM MM  S");
        System.out.println("M M M  SSSS");
        System.out.println("M   M     S");
        System.out.println("M   M  SSSS");

        // 2. Convert Fahrenheit to Celsius.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + " Fahrenheit is " + String.format("%.2f", celsius) + " Celsius.");

        // 3. Reverse input string and trim outside characters.
        System.out.print("Enter a 5-character string: ");
        String userInput = scanner.next();
        if (userInput.length() == 5) {
            String trimmedReversed = new StringBuilder(userInput.substring(1, 4)).reverse().toString();
            System.out.println("Trimmed and reversed string: " + trimmedReversed);
        } else {
            System.out.println("Please enter a valid 5-character string.");
        }

        // 4. Generate and save a random number between 32 and 16,384 inclusive.
        Random random = new Random();
        int randomNumber = 32 + random.nextInt(16353); // Generates a random number between 32 and 16384
        System.out.println("Random number generated: " + randomNumber);
    }
}
