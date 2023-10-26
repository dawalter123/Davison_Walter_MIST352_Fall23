import java.util.Scanner;

/**
 * 
 */
public class Exam1B_ChatGTP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Display a welcome message
        System.out.println("Welcome to the Find Character in Input Program!");

        // Ask the user for text input
        System.out.print("Please enter some text: ");
        String userInput = scanner.nextLine();

        // Calculate and print the length of the input
        int inputLength = userInput.length();
        System.out.println("The length of the input is: " + inputLength);
        // Ask the user for a character to find
        System.out.print("Please enter a character to find: ");
        char charToFind = scanner.next().charAt(0); // Read the first character

        // Find and print the location of the character
        int charIndex = userInput.indexOf(charToFind);

        if (charIndex != -1) {
            System.out.println("The character '" + charToFind + "' is found at index: " + charIndex);
        } else {
            System.out.println("The character '" + charToFind + "' is not found in the input.");
        }
        
	}
}
