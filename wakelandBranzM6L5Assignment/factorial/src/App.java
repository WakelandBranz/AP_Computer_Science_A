/*
 * Wakeland Branz
 * Date: 11/06/2023
 * Seaforth High School
 * Calculate factorials
 *
 * Description:  Asks for user input regarding the factorial of a number and continues until user is done
 * Difficulties:  I initially had to figure out a quick way to calculate factorial, which was a slight struggle.
 * What I Learned:  How to calculate factorials in Java
 */

import java.util.*;

public class App {
    public static int factorial(int input) {
        int result = input;
        for (int i = input - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean completed = false;
        boolean nextContinue = false;

        int input;

        do {
            System.out.print("Input the number you would like to calculate the factorial of: ");
            input = scanner.nextInt();

            System.out.printf("Value of %d! is %d\n", input, factorial(input));

            System.out.print("Would you like to calculate the factorial of another number? (true/false): ");
            nextContinue = scanner.nextBoolean();

            if (nextContinue == false) {
                completed = true;
            }

        } while (!completed);

        scanner.close();
    }
}

/*
 * Sample output: 
 * Input the number you would like to calculate the factorial of: 9
 * Value of 9! is 362880
 * Would you like to calculate the factorial of another number? (true/false): true
 * Input the number you would like to calculate the factorial of: 12
 * Value of 12! is 479001600
 * Would you like to calculate the factorial of another number? (true/false): false
 */