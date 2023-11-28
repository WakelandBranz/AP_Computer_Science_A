/*
 * Wakeland Branz
 * Date: 11/27/2023
 * Seaforth High School
 * Modifying user input and displaying the modified information
 *
 * Description:  Takes user input, prints it, reverses it, and converts the reversed output to upper case.
 * Difficulties:  Figuring out how to create my loop was an initial struggle due to indexing out of bounds, but everything else was quite easy.
 * What I Learned:  How to use more string methods.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        boolean completed = false;
        Scanner scanner = new Scanner(System.in);
        String isRepeating = "";

        // while the user still wants to input a string, completed should be fals.e
        while (!completed) {
            // gather user input
            System.out.printf("Enter your desired string: ");
            String userInput = scanner.nextLine();
            String reversedInput = "";

            // loops through input in reverse and appends it to reversedInput
            for (int i = userInput.length() - 1; i > -1; i--) {
                reversedInput += userInput.charAt(i);
            }

            // print all information
            System.out.printf("You entered %s\n", userInput);
            System.out.printf("The input reversed: %s\n", reversedInput);
            System.out.printf("The reversed string in all capital letters: %s\n", reversedInput.toUpperCase()); // convert reversed input to upper case
            
            System.out.printf("Would you like to enter another string (Y/N): ");
            isRepeating = scanner.nextLine().toUpperCase(); // normalize input

            // logic for deciding whether or not to repeat loop
            if (isRepeating.equals("N")) {
                completed = true;
                System.out.println("Completed!");
            }
            else if (isRepeating.equals("Y")) {
                continue;
            }
            else {
                System.out.println("Invalid input");
                break;
            }

            scanner.reset();
        }

        scanner.close();
    }
}

/*
 * Sample output:
 * Enter your desired string: this is my house
 * You entered this is my house
 * The input reversed: esuoh ym si siht
 * The reversed string in all capital letters: ESUOH YM SI SIHT
 * Would you like to enter another string (Y/N): y
 * Enter your desired string: this is my house
 * You entered this is my house
 * The input reversed: esuoh ym si siht
 * The reversed string in all capital letters: ESUOH YM SI SIHT
 * Would you like to enter another string (Y/N): n
 */