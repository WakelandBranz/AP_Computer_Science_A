/*
 * Wakeland Branz
 * Date: 10/16/2023
 * Seaforth High School
 * Application of file input
 *
 * Description:  Takes a file as input and uses the data within it to perform an algorithm and print its results neatly.
 * Difficulties:  Initially I went down a complicated route instead of a simple one, but the simple algorithm I used ended up yielding the best result.
 * What I Learned:  How to iterate through and extract elements from a file in Java.
 */

import java.util.*;
import java.io.*;

public class averageAndSumOfFile {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(new File("wakelandBranzM5L8Assignment\\averageAndSumOfFile\\src\\data.in"));

        double sum = 0; // sum of all integers in data file
        int iter = 0; // total count of integers

        // while there is still a valid integer, store the valid integer, print it
        // add it to sum, and iterate to store total count of values
        while(reader.hasNextInt()) {
            int score = reader.nextInt();
            System.out.println(score);
            sum += score;
            iter++;
        }

        final double AVERAGE = sum / iter;

        // neatly prints all necessary values
        System.out.printf("Sum = %.0f\nCount of values = %d\nAverage = %f\n", sum, iter, AVERAGE);

        reader.close(); // free scanner
    }
}

/*
 * Sample output:
 * 3
 * 8
 * 1
 * 13
 * 18
 * 15
 * 7
 * 17
 * 1
 * 14
 * 0
 * 12
 * 3
 * 2
 * 5
 * 4
 * Sum = 123
 * Count of values = 16
 * Average = 7.687500
 */
