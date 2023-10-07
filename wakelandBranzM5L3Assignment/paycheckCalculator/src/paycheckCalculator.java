/*
 * Wakeland Branz
 * Date: 10/07/2023
 * Seaforth High School
 * Using scanners to get an input, perform an algorithm to get pay, and print the result
 *
 * Description:  Uses the scanner class to gain inputs and perform an algorithm to get total pay based on hours worked and standard pay rate
 * Difficulties:  I had issues formatting initially but I fixed the issues quickly
 * What I Learned:  I learned a little more about how to use if statements.
 */

import java.util.Scanner;

public class paycheckCalculator {

    public static double roundToHundredths(double input) {
        return Math.round(input * 100.0) / 100.0;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // init scanner
        // set up variables
        System.out.print("Enter your standard pay -> ");
        final double pay = scanner.nextDouble();
        final double toOvertime = 1.5;

        System.out.print("Enter your hours worked -> ");
        final int totalHoursWorked = scanner.nextInt();
        int overtimeHoursWorked = 0;
        int regularHoursWorked = 0;

        scanner.close();
        
        // takes into account whether overtime hours were worked, assigns 40 if they were, assigns totalHoursWorked if they werent.
        if (totalHoursWorked > 40) {
            regularHoursWorked = 40;
            overtimeHoursWorked = totalHoursWorked - 40;
        }
        else {
            regularHoursWorked = totalHoursWorked;
        }

        final double standardPay = roundToHundredths(pay * regularHoursWorked);
        final double overtimePay = roundToHundredths(pay * toOvertime * overtimeHoursWorked);
        
        System.out.printf("Regular hours = %d\nOvertime hours = %d\nTotal Hours = %d\n", regularHoursWorked, overtimeHoursWorked, totalHoursWorked);
        System.out.printf("Regular pay = %.2f\nOvertime pay = %.2f\nGross pay = %.2f", standardPay, overtimePay, standardPay + overtimePay);
    }
}

/*
 * Sample output:
 * Enter your standard pay -> 12.00
 * Enter your hours worked -> 48
 * Regular hours = 40
 * Overtime hours = 8
 * Total Hours = 48
 * Regular pay = 480.00
 * Overtime pay = 144.00
 * Gross pay = 624.00
 */