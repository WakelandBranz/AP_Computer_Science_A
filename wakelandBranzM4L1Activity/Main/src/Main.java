/*
 * Wakeland Branz
 * Date: 09/25/2023
 * Seaforth High School
 * Basic scanner program M4L1Activity
 *
 * Description:  Uses the scanner class to gain numerous types of user input..
 * Difficulties:  I had no difficulties in creating this because I followed the video tutorial entirely.
 * What I Learned:  How to use the scanner class in Java.
 */

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        boolean debug = false; // for myself, testing certain attributes of the scanner class

        Scanner scanner = new Scanner(System.in); // init scanner

        // input with integers
        System.out.print("Enter your integer here: ");
        int i = scanner.nextInt();
        System.out.println(3*i);

        // input with doubles
        System.out.print("Enter your double here: ");
        double d = scanner.nextDouble();
        // double dd = scanner.nextDouble(); // note: the guy in the video made a syntax error at the end with his final scan
        System.out.println(d); 

        // input with delimited strings
        System.out.print("Enter your string here: ");
        String s = scanner.next();
        System.out.println("First part of string: " + s);
        s = scanner.next();
        System.out.println("Second part of string: " + s);

        // input with just string... need to build a new scanner obj due to how the object works.  can't follow nextInt or nextDouble etc with nextLine
        scanner = new Scanner(System.in);
        System.out.print("Enter your second string here: ");
        String newS = scanner.nextLine();
        System.out.println(newS);

        // all of this code was just me testing things on my own to learn how to use scanner better
        boolean completed = false; // arbitrary loop variable
        if (debug) {
            while (!completed) {
                try {
                    System.out.print("Enter an integer 1 - 10: ");
                    int testIntInput = scanner.nextInt(); // get input, check if within range
                    if (testIntInput > 0 && testIntInput < 11) { // between 1 - 10
                        completed = true; // loop succeeded, exit.
                        System.out.println("You inputted " + testIntInput);
                    }
                    else {
                        System.out.println("Input out of range, please try again.");
                    }
                }
                catch (Exception e) {
                    System.out.println("Wrong data type inputted, please try again.\nError -> " + e);
                    scanner.nextLine(); // discard invalid input
                    continue;
                }
            }
            completed = false; // reset loop variable
        }
        scanner.close();
    }
}
/*Sample output:
 *Enter your integer here: 1
 *3
 *Enter your double here: 1
 *1.0
 *Enter your string here: hi i
 *First part of string: hi       
 *Second part of string: i       
 *Enter your second string here: welcome
 *welcome
 */