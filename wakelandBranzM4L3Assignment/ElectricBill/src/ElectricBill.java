/*
 * Wakeland Branz
 * Date: 10/02/2023
 * Seaforth High School
 * Using scanners to get an input, round to the nearest hundredth and truncate all trailing decimals.
 *
 * Description:  Takes an input of kilowatt hours and prints a neat receipt.
 * Difficulties:  Truncating my decimals took me a little while to figure out, but rewatching one of the note videos helped me.
 * What I Learned:  How to use printf effectively, how to truncate values properly, how to round values to a certain decimal place.
 */

import java.util.Scanner;

public class ElectricBill {

    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in); // init scanner
        boolean valid = false; // if input is valid or not
        int result = 0;

        while (!valid) {
            try { 
                System.out.print("Enter KWH used: ");
                result = scanner.nextInt();
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
        // constant variables for later math
        final double costPerHour = 0.0425;
        final double surchargeMultiple = 0.1;
        final double cityUtilityTaxMultiple = 0.03;
        final double latePenaltyTax = 1.04;
        final int kwhUsed = getUserInput();
        
        double baseCost = kwhUsed * costPerHour;
        double surcharge = baseCost * surchargeMultiple;
        double cityUtilityTax = baseCost * cityUtilityTaxMultiple;
        double total = baseCost + surcharge + cityUtilityTax;
        double latePentaltyTotal = total * latePenaltyTax;

        baseCost = roundToHundredths(baseCost);
        surcharge = roundToHundredths(surcharge);
        cityUtilityTax = roundToHundredths(cityUtilityTax);
        total = roundToHundredths(total);
        latePentaltyTotal = roundToHundredths(latePentaltyTotal);

        System.out.printf("\n        Wakeland's Electrics\n------------------------------------\nKilowatts used -> %d @ $0.0425\n------------------------------------\n", kwhUsed);
        System.out.printf("Base Charge -> $%.2f\nSurcharge -> $%.2f\nCitytax -> $%.2f\nTotal due -> $%.2f\nAfter May 20th total due -> $%.2f", baseCost, surcharge, cityUtilityTax, total, latePentaltyTotal);
    }
}
/*
 * Sample output:
 *         Wakeland's Electrics
 * ------------------------------------
 * Kilowatts used -> 997 @ $0.0425
 * ------------------------------------
 * Base Charge -> $42.37
 * Surcharge -> $4.24
 * Citytax -> $1.27
 * Total due -> $47.88
 * After May 20th total due -> $49.80
 */
