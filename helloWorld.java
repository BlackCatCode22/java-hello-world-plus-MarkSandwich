// Name of programmer: Mark Sanchez
// Name of program: helloWorld
// Date started: 2/24/23
import java.util.Scanner;

public class helloWorld {
    public static void main(String[] args) {
        // Variable declaration section.
        Scanner userInput = new Scanner(System.in);

        // Input: get the user's name
        System.out.print("Hello user, enter your preferred name: ");
        // Apply user input to string, which will later be printed out
        String userName = userInput.nextLine();

        // Output:
        System.out.println("Hello, " + userName + ", have a wonderful day!");

    }
}
