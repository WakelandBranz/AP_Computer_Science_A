/*
 * Wakeland Branz
 * Date: 09/27/2023
 * Seaforth High School
 * Using scanners to get an input, perform an algorithm to yield a char, appends char to input and prints.
 *
 * Description:  Uses the scanner class to gain input and perform math which yields a security code.
 * Difficulties:  I had issues with my math initially but some quick fixes to the string's index gave me the correct result.
 * What I Learned:  How to effectively implement an algorithm to manipulate user input into yielding my desired result.
 */

import java.util.*;

public class CreditCard {

    public static String getUserInput() {
        Scanner scanner = new Scanner(System.in); // init scanner
        boolean valid = false; // if input is valid or not
        String result = "";

        while (!valid) {
            try { 
                System.out.print("Enter the credit card number (XX XX XX XX): ");
                result = scanner.nextLine().trim();
                result.trim(); // discard whitespace

                if (result.length() != 11) { // if incorrect number of characters entered for credit card
                    System.out.println("Incorrect number of integers entered, please try again.");
                    scanner.nextLine(); // discard invalid input
                    continue;
                }
                valid = true; // input is now correrct!
            }
            catch (Exception e) {
                System.out.println("Wrong data type inputted, please try again.\nError -> " + e);
                scanner.nextLine(); // discard invalid input
                continue;
            }
            
        }
        scanner.close();
        return result;
    }
        
    public static void main(String[] args) throws Exception {

        String input = getUserInput();
        int total = 0;

        for (int i = 0; i < input.length() - 1; i+=2) { // add numbers into total
            // make sure that position i is not whitespace, if so, move to next digit.
            if (input.charAt(i) == ' ') { 
                i++;
            }
            // get the two numbers and concatenate
            total += (Character.getNumericValue(input.charAt(i)) * 10) + (Character.getNumericValue(input.charAt(i + 1))); 
        }

        char addedChar = (char)(total % 26 + 65); // remainder of 26 + 65 (ASCII position of A)

        System.out.println("The correct number and code is: " + input + " " + addedChar);

    }
}

/*
 * Sample output:
 * Enter the credit card number (XX XX XX XX): 26 54 74 55
 * The correct number and code is: 26 54 74 55 B
 */
