/*
 * Wakeland Branz
 * Date: 08/31/2023
 * Seaforth High School
 * Basic looping program that calculates the average of inputs and prints them
 *
 * Description:  Average calculation program
 * Difficulties:  Learning how for loops worked in Java was only a slight difficulty, but it took me a few minutes to figure out. 
 * What I Learned:  My prior experience in C++ is very applicable with Java, as a lot of what I did in this program can be done in C++ in a similar manner.
 */

import java.util.Scanner;

public class Main {
    // getNums gets the requested amount of variables, and based on whether arg getAverage is true or false, it will either return the average of all variables or the total.
    public static float getNums(int iterations, boolean getAverage) { 
        // buffer variables, total will be returned, buffer is user input which is added to total.
        float total = 0;
        float buffer;

        Scanner myScanner = new Scanner(System.in); // init scanner for input

        // for loop goes through the amount of inputs, assigns inputs to buffer, adds buffer to total
        for (int i = 0; i < iterations; i++) {
            System.out.println("Please input variable " + (i + 1) + "."); // i + 1 is so that the loop functions but the print is as intended.
            buffer = myScanner.nextInt(); // get next integer

            System.out.println("Input " + (i + 1) + " - " + buffer); // i + 1 is so that the loop functions but the print is as intended.
            total += buffer; // total = total + buffer, this adds all buffer values to total so we have an accurate total
        }

        myScanner.close(); // free mem for GC

        if (getAverage) { // if it is specified that the average should be returned, return the total / iterations
            return total / iterations;
        }
        return total; // else, return total. no need for an else in this statement
    }
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 2 Lesson 3 Assignment - \n");

        // initialize myScanner, get desired amount of iterations, use getNums with desired amount of iterations, close myScanner to help GC
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input your desired number of inputs.");
        float average = getNums(myScanner.nextInt(), true);
        myScanner.close();
        System.out.println("Average of inputs - " + average + "!");
    }
}
/*
By: Wakeland Branz
 - Module 2 Lesson 3 Assignment -
Please input your desired number of inputs.
5
Please input variable 1.
100
Input 1 - 100.0
Please input variable 2.
200
Input 2 - 200.0
Please input variable 3.
300
Input 3 - 300.0
Please input variable 4.
400
Input 4 - 400.0
Please input variable 5.
500
Input 5 - 500.0
Average of inputs - 300.0!
 */