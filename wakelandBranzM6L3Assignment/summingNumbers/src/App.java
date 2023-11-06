/*
 * Wakeland Branz
 * Date: 11/06/2023
 * Seaforth High School
 * Looping, adding, averaging, and printing
 *
 * Description:  Loops through intermittent values 5 times to get a sum and average.
 * Difficulties:  Initially I had some issues with writing my comparisons for my while statements but I fixed the issue relatively fast.
 * What I Learned:  How to use do-while loops in Java.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // 5 iterations to meet assignment requirements
        int iterator = 0;
        do {
            // initialize all variables
            System.out.print("\nEnter starting value: ");
            double startingNumber = scanner.nextDouble();

            System.out.print("Enter ending value: ");
            double endingNumber = scanner.nextDouble();


            double difference = endingNumber - startingNumber;
            double sum = 0;

            double i = 0;
            double next = 0;

            // loop through and add 1 until 
            do {
                next = startingNumber + i;
                // add the starting number and then add our difference
                // to it to get the final difference
                sum += next;

                // print next number
                System.out.println(next);
                i++;
            } while (i < difference + 1);

            // neatly print all necessary data
            System.out.printf("Sum of the numbers %f..%f is %f\nThe average of the numbers %f, %f is %f", 
                startingNumber, endingNumber, sum, startingNumber, endingNumber, sum / (difference + 1));

            iterator++; // add to iterator to accurately iterate through 5 times
        } while (iterator < 5);
        scanner.close();
    }
}

/*
 * Sample output:
 * Enter starting value: 22
 * Enter ending value: 25
 * 22.0
 * 23.0
 * 24.0
 * 25.0
 * Sum of the numbers 22.000000..25.000000 is 94.000000
 * The average of the numbers 22.000000, 25.000000 is 23.500000
 * Enter starting value: 22
 * Enter ending value: 26
 * 22.0
 * 23.0
 * 24.0
 * 25.0
 * 26.0
 * Sum of the numbers 22.000000..26.000000 is 120.000000
 * The average of the numbers 22.000000, 26.000000 is 24.000000
 * Enter starting value: 22
 * Enter ending value: 26
 * 22.0
 * 23.0
 * 24.0
 * 25.0
 * 26.0
 * Sum of the numbers 22.000000..26.000000 is 120.000000
 * The average of the numbers 22.000000, 26.000000 is 24.000000
 * Enter starting value: 22
 * Enter ending value: 25
 * 22.0
 * 23.0
 * 24.0
 * 25.0
 * Sum of the numbers 22.000000..25.000000 is 94.000000
 * The average of the numbers 22.000000, 25.000000 is 23.500000
 * Enter starting value: 22
 * Enter ending value: 25
 * 22.0
 * 23.0
 * 24.0
 * 25.0
 * Sum of the numbers 22.000000..25.000000 is 94.000000
 * The average of the numbers 22.000000, 25.000000 is 23.500000
 */