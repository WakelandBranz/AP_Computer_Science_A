/*
 * Wakeland Branz
 * Date: 10/08/2023
 * Seaforth High School
 * Using scanners to get an input, perform an algorithm to find x, then print result
 *
 * Description:  Uses the scanner class to gain inputs and perform an algorithm to find x based on certain cases
 * Difficulties:  My biggest difficulty was thinking out the shortest way I could write my if statements, and I think I did well with my amount of comparisons.
 * What I Learned:  I learned a little more about how to use if statements effectively.
 */

import java.util.Scanner;

public class solvingLinearEquations {
    public static void main(String[] args) throws Exception {
        /*
         * This program solves for Ax + B = 0
         * X = (-B/A)
         */

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Equation : Ax + B = 0\nEnter A: ");
        final double A = scanner.nextDouble(); 

        System.out.print("Enter B: ");
        final double B = scanner.nextDouble();

        // test if A is a zero
        if (A == 0 && B == 0) {
            System.out.printf("Equation: %fx + %f = 0\nx has infinite solutions", A, B);
            scanner.close();
            return;
        }
        // we have already tested both variables for zeros, now we can test A to save comparisons since B is a constant
        else if (A == 0) {
            System.out.printf("Equation: %fx + %f = 0\nx has no solutions", A, B);
            scanner.close();
            return;
        }
        // handles all other cases
        else {
            System.out.printf("Equation: %fx + %f = 0\nx = %f", A, B, -(B / A)); 
            scanner.close();
            return;
        }
    }
}

/*
 * Sample output
 * Enter A: 4
 * Enter B: -5
 * Equation: 4.000000x + -5.000000 = 0
 * x = 1.250000
 */
