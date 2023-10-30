/*
 * Wakeland Branz
 * Date: 10/30/2023
 * Seaforth High School
 * Using file input to calculate total and average values
 *
 * Description:  Takes a file as input and uses the data within it to assign values such as total cost to variables and print.
 * Difficulties:  I made this with relative ease as I had done it a few times before from previous assignments, so I had no difficulties.
 * What I Learned:  How to read and perform an algorithm on data from a file input.
 */

import java.io.*;
import java.util.*;

public class costCalculator {
    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(new File("wakelandBranzM6L1Assignment\\totalCostOfItems\\costCalculator\\data.in"));

        double sum = 0;
        double next = 0;
        int count = 0;

        // while we still have a valid value, assign our next double to a variable,
        // add that to sum and print it, and then add to our iteration counter
        while (reader.hasNextDouble()) {
            next = reader.nextDouble();
            sum+=next;
            System.out.printf("$%.2f\n", next);
            count++;
        }
        sum = Math.round(sum * 100.0) / 100.0; // round to nearest hundredth
        double average = Math.round((sum / count) * 100.0) / 100.0; // get average by dividing sum by count and then round to nearest hundredth
        
        // now print all values
        System.out.printf("Sum of costs: $%.2f\nNumber of costs: %d\nAverage cost: $%.2f", sum, count, average); 
    }
}
