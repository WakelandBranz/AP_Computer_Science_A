/*
 * Wakeland Branz
 * Date: 2/12/2024
 * Seaforth High School
 *
 * Description:  Gathers data about bank accounts and sorts their balances to find the onen with the most money
 * Difficulties:  I had to refigure out how to flush my scanner to avoid an incompatible types error which only took me a minute or two.
 * What I Learned:  How to sort classes effectively when they are stored in an ArrayList.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    public BankAccount(String nm, Double amt) {
        name = nm;
        balance = amt;
    }

    public void deposit(double dp) {
        balance = balance + dp;
    }

    public void withdraw(double wd) {
        balance = balance - wd;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    private String name;
    private double balance;

}

class BankAccountRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // initialize vector/arraylist
        ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();

        // initialize account variables
        String name = "";
        double deposit = 0;

        while (true) {
            // get accounts
            System.out.print("Please enter the name to whom the account belongs (\"Exit\" to abort) ");
            name = scanner.nextLine();

            if (name.toLowerCase().equals("exit")) {
                break;
            }

            System.out.print("Please enter the amount of the deposit. $");
            deposit = scanner.nextDouble();

            // consume newline character to flush scanner
            scanner.nextLine();

            bankAccountList.add(new BankAccount(name, deposit));
        }
        
        // silly function name
        BankAccount leastBroke = getLeastBroke(bankAccountList);

        System.out.printf("The account with the largest balance belongs to %s\nThe amount is $%.2f", leastBroke.getName(), leastBroke.getBalance());

        scanner.close();
    }

    public static BankAccount getMostBroke(ArrayList<BankAccount> bankAccountList) {
        // initialize lest money in account and a current bankaccount
        BankAccount mostBroke = bankAccountList.get(0);
        BankAccount current;

        for (int i = 0; i < bankAccountList.size(); i++) {
            current = bankAccountList.get(i); // set current account

            // check if current brokest balance is less than or greater than current comparison balance
            if (mostBroke.getBalance() > current.getBalance()) {
                mostBroke = current;
            }
        }

        return mostBroke;
    }

    public static BankAccount getLeastBroke(ArrayList<BankAccount> bankAccountList) {
        // initialize least money in account and a current bank account
        BankAccount leastBroke = bankAccountList.get(0);
        BankAccount current;
    
        for (int i = 0; i < bankAccountList.size(); i++) {
            current = bankAccountList.get(i); // set current account
    
            // check if current brokest balance is greater than or less than current comparison balance
            if (leastBroke.getBalance() < current.getBalance()) {
                leastBroke = current;
            }
        }
    
        return leastBroke;
    }
}

/*
 * Sample output:
 * Please enter the name to whom the account belongs ("Exit" to abort) Jim Jones
 * Please enter the amount of the deposit. $186.22
 * Please enter the name to whom the account belongs ("Exit" to abort) Bill Gates
 * Please enter the amount of the deposit. $3.50
 * Please enter the name to whom the account belongs ("Exit" to abort) Wakeland Branz
 * Please enter the amount of the deposit. $1234567.89
 * Please enter the name to whom the account belongs ("Exit" to abort) Charles Manson
 * Please enter the amount of the deposit. $870.85
 * Please enter the name to whom the account belongs ("Exit" to abort) exit
 * The account with the largest balance belongs to Wakeland Branz
 * The amount is $1234567.89
 */