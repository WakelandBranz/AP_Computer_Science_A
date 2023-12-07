/*
 * Wakeland Branz
 * Date: 12/6/2023
 * Seaforth High School
 * Taking user input to perform basic mathematic actions
 *
 * Description:  Takes user input, performs basic operations, and prints the resultant values.
 * Difficulties:  I had no major difficulties making this assignment, but creating a tuple in Java took a small amount of research.
 * What I Learned:  How to create a basic user interface to give the user a range of options regarding performing basic math on money.
 */

import java.util.Scanner;

public class bankingTool {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // set initial values as outlined in the assignment
        double savings = 3000;
        double checking = 650;

        boolean completed = false;


        while (!completed) {
            // print out user options every loop
            System.out.println("What do you wish to do today? ");
            System.out.println("1 for deposit to savings");
            System.out.println("2 for deposit to checking");
            System.out.println("3 for withdraw from savings");
            System.out.println("4 for withdraw from checking");
            System.out.println("5 for transfer funds from savings to checking");

            // get user's answer
            int answer = scanner.nextInt();

            // determine action based on user's answer
            if (answer == 1)
            {
                savings = depositSavings(savings, scanner);
            }
            else if (answer == 2) {
                checking = depositChecking(checking, scanner);
            }
            else if (answer == 3) {
                savings = withdrawSavings(savings, scanner);
            }
            else if (answer == 4) {
                checking = withdrawChecking(checking, scanner);
            }
            else if (answer == 5) {
                // store values to assign to savings and checking
                double[] results = transferSavingsToChecking(savings, checking, scanner);

                // store and modify values
                savings = results[0];
                checking = results[1];

                // print modified values
                System.out.println("Your new savings balance is $" + savings);
                System.out.println("Your new checking balance is $" + checking);
            }
            else {
                System.out.println("[!] Invalid answer, please try again");
                continue;
            }

            // allow next answer to be read
            scanner.reset();

            // does the user want to do another transaction?  if so, repeat the loop.  otherwise, end the program.
            System.out.println("Would you like another transaction? -> 1 = YES | 2 = NO");
            int anotherTransaction = scanner.nextInt();
            if (anotherTransaction == 1) {
                continue;
            }
            else if (anotherTransaction == 2) {
                completed = true;
            }
            else {
                System.out.println("Invalid input, please try again.");
                continue;
            }

        }
        
    }

    public static double depositSavings(double savings, Scanner scanner) {
        System.out.println("Your current balance in savings is $" + savings + ".  How much do you want to transfer?");
        double deposit = scanner.nextDouble();

        savings += deposit;
        System.out.println("Your total in savings is $" + savings);

        return savings;
    }
    public static double depositChecking(double checking, Scanner scanner) {
        System.out.println("Your current balance in checking is $" + checking + ".  How much do you want to transfer?");
        double deposit = scanner.nextDouble();

        checking += deposit;
        System.out.println("Your total in checking is $" + checking);

        return checking;
    }
    
    public static double withdrawSavings(double savings, Scanner scanner) {
        System.out.println("Your current balance in savings is $" + savings + ".  How much would you like to withdraw?");
        double withdrawal = scanner.nextDouble();

        savings -= withdrawal;
        System.out.println("Your total in savings is $" + savings);

        return savings;
    }
    public static double withdrawChecking(double checking, Scanner scanner) {
        System.out.println("Your current balance in checking is $" + checking + ".  How much would you like to withdraw?");
        double withdrawal = scanner.nextDouble();

        checking -= withdrawal;
        System.out.println("Your total in checking is $" + checking);

        return checking;
    }
    public static double[] transferSavingsToChecking(double savings, double checking, Scanner scanner) {
        double[] result = new double[2]; // 0 is savings, 1 is checking

        System.out.println("Your current savings balance is $" + savings);
        System.out.println("Your current checking balance is $" + checking);
        System.out.println("How much do you want to transfer from your savings to your checking?");
        double transfer = scanner.nextDouble();

        result[0] = savings - transfer; // subtract money transferred from savings into checking
        result[1] = checking + transfer; // add money transferred from savings into checking

        return result;
    }
}

/* 
 * Sample Output:
 * What do you wish to do today? 
 * 1 for deposit to savings
 * 2 for deposit to checking
 * 3 for withdraw from savings
 * 4 for withdraw from checking
 * 5 for transfer funds from savings to checking
 * 5
 * Your current savings balance is $3000.0
 * Your current checking balance is $650.0
 * How much do you want to transfer from your savings to your checking?
 * 350
 * Your new savings balance is $2650.0
 * Your new checking balance is $1000.0
 * Would you like another transaction? -> 1 = YES | 2 = NO
 * 2
 */