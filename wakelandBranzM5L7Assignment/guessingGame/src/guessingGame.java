/*
 * Wakeland Branz
 * Date: 10/15/2023
 * Seaforth High School
 * Guessing game
 *
 * Description:  A guessing game using random integers
 * Difficulties:  I originally designed a game loop using a for loop, but somehow didn't read the highlighted text in the assignment haha.
 * What I Learned:  How to next if statements and for loops.
 */

import java.util.*;

public class guessingGame {

    // i didn't read that no looping structures were allowed initially because the text was too small.

    // THIS WHOLE FUNCTION IS NOT RELATED TO THE ASSIGNMENT, BUT I WROTE IT AND WOULD LIKE TO LOOK BACK ON IT FOR FUTURE REFERENCE
    public static void incorrectGameLoop() {
        Scanner scanner = new Scanner(System.in);

        Random rng = new Random();
        int answer = rng.nextInt(10);

        for (int i = 1; i < 4; i++) {
            System.out.printf("Guess %d: ", i);
            int guess = scanner.nextInt();

            // checks if answer is within range
            if (guess < 0 || guess > 10) {
                System.out.println("Please guess again, your guess was out of range.");
                i--; // acts as if you never guessed
                continue; // go back through the loop
            }

            if (guess == answer) {
                System.out.println("You guessed correctly!");
                break;
            }

            // if guess is too high or too low print logic
            if (guess > answer) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("Your guess is too low.");
            }

            // if you've gone through three incorrect guesses then print a loss.
            if (i == 3) {
                System.out.println("Sorry, you lost.");
            }

        }
        scanner.close();
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

        Random rng = new Random();
        int answer = rng.nextInt(10);

        System.out.println("Make your first guess: ");
        int guess1 = scanner.nextInt();
        if (guess1 == answer) {
            System.out.println("You guessed correctly!");
            return;
        }
        else {
            if (guess1 > answer) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("Your guess is too low.");
            }
        }

        System.out.println("Make your second guess: ");
        int guess2 = scanner.nextInt();
        if (guess2 == answer) {
            System.out.println("You guessed correctly!");
            return;
        }
        else {
            if (guess2 > answer) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("Your guess is too low.");
            }
        }

        System.out.println("Make your third guess: ");
        int guess3 = scanner.nextInt();
        if (guess3 == answer) {
            System.out.println("You guessed correctly!");
            return;
        }
        else {
            if (guess3 > answer) {
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("Your guess is too low.");
            }
        }

        System.out.printf("Sorry, the randomly generated number was %d.", answer);
    }
}
/*
 * Sample output:
 * Make your first guess: 
 * 5
 * Your guess is too low.
 * Make your second guess:
 * 8 
 * Your guess is too high.
 * Make your third guess:
 * 6
 * You guessed correctly!
 */