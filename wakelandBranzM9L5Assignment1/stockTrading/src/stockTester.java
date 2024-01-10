/*
 * Wakeland Branz
 * Date: 1/9/2024
 * Seaforth High School
 *
 * Description:  Gathers data about stock purchases from a user and calculates net wins/losses
 * Difficulties:  I was rushed on time due to a storm that knocked out my power for a while and because of an upcoming calculus test, so I struggled to organize all of my data in order without an abundance of errors.
 * What I Learned:  How to effectively structure a program for compact code and scalability
 */

import java.util.*;

// used to more easily access data in the future

class CPurchase {
    // instance variables

    double shares;
    double prices;
    double total;

    CPurchase(double shares, double prices) {
        this.shares = shares;
        this.prices = prices;
        this.total = shares * prices;
    }
}

class CStock { 
    // instance variables
    
    private String symbol;
    private ArrayList<CPurchase> trades; // table of trades
    private double totalTradesPrice;
    private double totalShares;
    private double sellingPrice;
    private double netGain;


    private Scanner scanner;

    CStock(Scanner scanner) {

        this.scanner = scanner;

        this.symbol = inputSymbol(); // get symbol (ex. AAPL)
        this.trades = new ArrayList<>();

        // find the amount of trades the user made;
        int tradesCompleted = inputTradesCompleted();

        // loop the amount of times the user made a trade
        for (int i = 0; i < tradesCompleted; i++) {
            inputNewPurchase(i + 1);
        }
        
        sumTradesPrice();
        sumTradesShares();
        inputSellingPrice();
        calculateNetGain();

        // determine whether to print net loss or net gain
        if (this.netGain < 0) {
            System.out.printf("Net Loss: $%.2f\n", netGain);
        }
        else {
            System.out.printf("Net Gain: $%.2f\n", netGain);
        }
    }

    // utility

    private void sumTradesPrice() { 
        double total = 0;
        for (int i = 0; i < this.trades.size(); i++) {
            total += this.trades.get(i).total;
        }

        this.totalTradesPrice = total;
    }

    private void sumTradesShares() { 
        double shares = 0;
        for (int i = 0; i < this.trades.size(); i++) {
            shares += this.trades.get(i).shares;
        }
        this.totalShares = shares;
    }

    private void calculateNetGain() {
        double sellingPriceGained = this.sellingPrice * this.totalShares;
        this.netGain = sellingPriceGained - totalTradesPrice;
    }

    // user input

    private String inputSymbol() {
        System.out.println("Enter stock symbol: ");

        return scanner.nextLine().trim();
    }

    private void inputNewPurchase(int iteration) {
        System.out.printf("Purchase %d: How many shares and at what price/shares?\n", iteration);

        System.out.print("Price: ");
        double price = this.scanner.nextDouble();

        System.out.print("Shares: ");
        double shares = this.scanner.nextDouble();

        CPurchase tempPurchase = new CPurchase(shares, price);
        this.trades.add(tempPurchase);
    }

    private void inputSellingPrice() {
        System.out.print("Selling price: ");
        double sellingPrice = scanner.nextDouble();
        this.sellingPrice = sellingPrice;
    }

    private int inputTradesCompleted() {
        System.out.print("Input trades completed: ");
        return scanner.nextInt();
    }

}

public class stockTester {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            new CStock(scanner);
        }

        scanner.close();
    }
}

/* Sample output: 
 * Enter stock symbol: 
 * AAPL
 * Input trades completed: 3
 * Purchase 1: How many shares and at what price/shares?
 * Price: 152.74
 * Shares: 100
 * Purchase 2: How many shares and at what price/shares?
 * Price: 153.46
 * Shares: 100
 * Purchase 3: How many shares and at what price/shares?
 * Price: 150.56
 * Shares: 100
 * Selling price: 147.50
 * Net Loss: $-1426.00
 * Enter stock symbol:
 * Input trades completed: 3
 * Purchase 1: How many shares and at what price/shares?
 * Price: 36.73
 * Shares: 100
 * Purchase 2: How many shares and at what price/shares?
 * Price: 44.74
 * Shares: 100
 * Purchase 3: How many shares and at what price/shares?
 * Price: 66.96
 * Shares: 100
 * Selling price: 79.80
 * Net Gain: $9097.00 
 * */