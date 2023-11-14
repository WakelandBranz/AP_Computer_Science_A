/*
 * Wakeland Branz
 * Date: 11/13/2023
 * Seaforth High School
 * Using user input to gather data
 *
 * Description:  Takes user input and counts even, odd, and zeros.  It then prints those values.
 * Difficulties:  I had to plan out a process to get this code to work step by step, but now it works.
 * What I Learned:  How to effectively read input.
 */

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // init scanner

        // get initial values
        System.out.print("How many integers would you like to analyze: ");
        int numCount = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int zeros = 0;

        // get the amount of numbers required
        System.out.println("List the numbers you want analyzed");
        
        // used in for loop as storage for the current number being analyzed
        int next = 0;
        
        // iterate through the amount of request integers
        for (int i = 0; i < numCount; i++) {
            next = scanner.nextInt();

            // if zero
            if (next == 0) {
                zeros++;
            }
            // if even
            else if (next % 2 == 0) {
                evenCount++;
            }
            // if odd 
            else {
                oddCount++;
            }
        }
        
        // neatly print values
        System.out.println("You entered " + numCount + " numbers.");
        System.out.println("The number of even numbers: " + evenCount);
        System.out.println("The number of odd numbers: " + oddCount);
        System.out.println("The number of zeros: " + zeros);

        scanner.close(); // close scanner
    }
}

/*
 * Sample output:
 * How many integers would you like to analyze: 10
 * List the numbers you want analyzed
 * 2
 * 5
 * 9
 * 0
 * -8
 * 6
 * 0
 * -2
 * 2
 * 4
 * You entered 10 numbers.
 * The number of even numbers: 6
 * The number of odd numbers: 2
 * The number of zeros: 2
 */
