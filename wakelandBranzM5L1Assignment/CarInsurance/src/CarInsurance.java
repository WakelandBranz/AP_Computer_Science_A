/*
 * Wakeland Branz
 * Date: 10/03/2023
 * Seaforth High School
 * Using scanners to get an input, perform an algorithm, round to the nearest hundredth and truncate all trailing decimals.
 *
 * Description:  Takes an input of age and performs math on it based on the age entered.
 * Difficulties:  I initially forgot to truncate my decimals but I fixed that issue quuickly.
 * What I Learned:  How to use if statements with Java code.
 */

import java.util.Scanner;

public class CarInsurance {

    public static double getUserInput() {
        Scanner scanner = new Scanner(System.in); // init scanner
        boolean valid = false; // if input is valid or not
        double result = 0;

        while (!valid) {
            try { 
                System.out.print("Enter driver age: ");
                result = scanner.nextDouble();
                // commented this out so I can reuse this code in the future result.trim(); // discard whitespace

                if (result == 0) { // if no input
                    System.out.println("Invalid input, please try again.");
                    scanner.nextLine(); // discard invalid input
                    continue;
                }
                valid = true; // input is now correrct!
            }
            catch (Exception e) {
                System.out.printf("Wrong data type inputted, please try again.\nError -> %S\n", e);
                scanner.nextLine(); // discard invalid input
                continue;
            }
            
        }
        scanner.close();
        return result;
    }

    public static double roundToHundredths(double input) {
        return Math.round(input * 100.0) / 100.0;
    }

    public static void main(String[] args) throws Exception {
        // initialize variables
        final double age = getUserInput();
        double insuranceCost = 0;

        if (age < 16) { // verify that driver can legally drive in NC
            System.out.printf("You are too young to be driving at %d", age);
            return;
        }

        if (age > 15 &&  age < 19) { // if age between 16 and 18
            insuranceCost = roundToHundredths(age * 88.0);
        }
        else if (age > 18 && age < 26) { // the assignment is somewhat poorly worded here, so I assume it is referring to being older than 18 and younger than 25
            insuranceCost = roundToHundredths(age * 72.0);
        }
        else {
            insuranceCost = 500.0;
        }

        System.out.printf("Insurance cost: $%.2f", insuranceCost);
    }
 
}

/*
 * Sample output:
 * Enter driver age: 21
 * Insurance cost: $1512.00
 */