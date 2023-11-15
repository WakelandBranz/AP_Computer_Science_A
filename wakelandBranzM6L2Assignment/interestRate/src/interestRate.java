/*
 * Wakeland Branz
 * Date: 11/14/2023
 * Seaforth High School
 * Using user input to make calculations for banks
 *
 * Description:  Takes user input and performs interest calculations on it based on the compounding method.
 * Difficulties:  My first attempt at this assignment I must've been tired, I missed a lot of steps but everything seems right now.  I just hope my calculations are correct, they look correct.
 * What I Learned:  How to effectively use loops to produce an output based on calculations in my program.
 */

import java.util.*;

public class interestRate {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // get user input
        System.out.print("Enter account balance: $");
        double input = scanner.nextDouble();

        System.out.print("Enter interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble();

        // for each of these loops, we firstly check if our interest-modified balance is double
        // of our original balance.  then, we iterate through however many times interest is
        // compounded annually and print our results

        // init variables and calculate
        int firstYearsToDouble = 0;
        double firstEndingBalance = input;
        while (!(firstEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            firstEndingBalance *=  1.0 + interestRate;
            firstYearsToDouble++; // now iterate
        }
        firstEndingBalance = Math.round(firstEndingBalance * 100.0) / 100.0;
        System.out.printf("Period: 1  Years to double: %d   Ending Balance: %.2f\n", firstYearsToDouble, firstEndingBalance);

        int secondYearsToDouble = 0;
        double secondEndingBalance = input;
        while (!(secondEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            for (int i = 1; i <= 12; i++) {
                //double tempBalance = secondEndingBalance * (interestRate / 12.0);
                secondEndingBalance *= 1.0 + (interestRate / 12.0);
            }
            secondYearsToDouble++; // now iterate
        }
        secondEndingBalance = Math.round(secondEndingBalance * 100.0) / 100.0;
        System.out.printf("Period: 12   Years to double: %d   Ending Balance: %.2f\n", secondYearsToDouble, secondEndingBalance);

        int thirdYearsToDouble = 0;
        double thirdEndingBalance = input;
        while (!(thirdEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            for (int i = 1; i <= 365; i++) {
                thirdEndingBalance *= 1 + (interestRate / 365.0);
            }
            thirdYearsToDouble++; // now iterate
        }
        thirdEndingBalance = Math.round(thirdEndingBalance * 100.0) / 100.0;
        System.out.printf("Period: 365  Years to double: %d   Ending Balance: %.2f\n", thirdYearsToDouble, thirdEndingBalance);
    }
}

/*
 * Sample output:
 * Enter account balance: $1000
 * Enter interest rate (as a decimal): 0.05
 * Period: 1  Years to double: 15   Ending Balance: 2078.93
 * Period: 12   Years to double: 14   Ending Balance: 2010.83
 * Period: 365  Years to double: 14   Ending Balance: 2013.66
 */