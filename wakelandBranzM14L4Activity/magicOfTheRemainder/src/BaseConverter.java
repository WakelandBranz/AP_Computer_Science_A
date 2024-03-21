/*
 * Wakeland Branz
 * Date: 3/21/2024
 * Seaforth High School
 *
 * Description:  Recursion example
 * Difficulties:  Uses recursion to convert bases
 * What I Learned:  The basics of recursion
 */

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) throws Exception {
        testCases();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number base 10 to convert: ");
            int number = scanner.nextInt();

            System.out.print("Enter the new base: ");
            int base = scanner.nextInt();

            String convertedNumber = convertBase(number, base);
            System.out.println("The number " + number + " [base 10] = " + convertedNumber + " [base " + base + "]");
        }
    }

    // Non recursive implementation
    public static String convertBase(int input, int base) {
        // Check prior to making any calculations
        if (base < 2 || base > 16) {
            throw new IllegalArgumentException("Base must be between 2 and 16.");
        }

        if (input == 0) {
            return "0";
        }

        return convertBaseRecursive(input, base);
    }

    private static String convertBaseRecursive(int input, int base) {
        if (input == 0) {
            return "";
        }

        int remainder = input % base;
        String convertedDigit;

        if (remainder < 10) {
            convertedDigit = String.valueOf(remainder);
        } 
        else {
            convertedDigit = String.valueOf((char) ('A' + remainder - 10));
        }

        String convertedRest = convertBaseRecursive(input / base, base);

        return convertedRest + convertedDigit;
    }

    private static void testCases() {
        System.out.println(convertBase(255, 16));
        System.out.println(convertBase(256, 16));
        System.out.println(convertBase(34, 8));
        System.out.println(convertBase(100, 3));
        System.out.println(convertBase(1034, 12));
        System.out.println(convertBase(6, 7));
    }
}

/*
 * Sample output:
 * FF
 * 100
 * 42
 * 10201
 * 722
 * 6
 * Enter the number base 10 to convert: 12354
 * Enter the new base: 6
 * The number 12354 [base 10] = 133110 [base 6]
 */