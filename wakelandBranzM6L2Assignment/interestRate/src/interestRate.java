import java.util.*;

public class interestRate {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // get user input
        System.out.print("Enter account balance: $");
        double input = scanner.nextDouble();

        System.out.print("Enter interest rate (as a decimal): ");
        double interestRate = scanner.nextDouble() + 1.0;

        // for each of these loops, we firstly check if our interest-modified balance is double
        // of our original balance.  then, we iterate through however many times interest is
        // compounded annually and print our results

        // init variables and calculate
        int firstYearsToDouble = 0;
        double firstEndingBalance = input;
        while (!(firstEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            firstEndingBalance *= interestRate;
            firstYearsToDouble++; // now iterate
        }
        firstEndingBalance = Math.round(firstEndingBalance * 100.0) / 100.0;
        System.out.printf("--- Period: 365 ---\nYears to double: %d\nEnding Balance: %.2f\n", firstYearsToDouble, firstEndingBalance);

        int secondYearsToDouble = 0;
        double secondEndingBalance = input;
        while (!(secondEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            for (int i = 1; i <= 12; i++) {
                secondEndingBalance *= interestRate;
            }
            secondYearsToDouble++; // now iterate
        }
        secondEndingBalance = Math.round(secondEndingBalance * 100.0) / 100.0;
        System.out.printf("--- Period: 12 ---\nYears to double: %d\nEnding Balance: %.2f\n", secondYearsToDouble, secondEndingBalance);

        int thirdYearsToDouble = 0;
        double thirdEndingBalance = input;
        while (!(thirdEndingBalance >= (input * 2))) { // while ending balance still isn't greater than double of starting balance
            for (int i = 1; i <= 365; i++) {
                thirdEndingBalance *= interestRate;
            }
            thirdYearsToDouble++; // now iterate
        }
        thirdEndingBalance = Math.round(thirdEndingBalance * 100.0) / 100.0;
        System.out.printf("--- Period: 365 ---\nYears to double: %d\nEnding Balance: %.2f\n", thirdYearsToDouble, thirdEndingBalance);
    }
}
