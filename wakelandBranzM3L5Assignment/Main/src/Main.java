/*
 * Wakeland Branz
 * Date: 09/08/2023
 * Seaforth High School
 * Basic arithmetic function that calculates the quadratic formula
 *
 * Description:  Performs the quadratic formula on three user inputted variables: a, b and c.
 * Difficulties:  I accidentally forgot a set of parenthesis around my quadratic formula math so my order of operations was incorrect, but I quickly fixed it.
 * What I Learned:  Basic usage of the math class in Java.
 */

import java.util.Scanner;

public class Main {
    // return the quadratic formula as an array of doubles
    public static double[] quadraticFormula (double a, double b, double c) {
        // perform required math, store into two variables
        double first = ((b * -1) + (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);
        double second = ((b * -1) - (Math.sqrt(Math.pow(b, 2) - (4 * a * c)))) / (2 * a);

        return new double[] {first, second};
    } 

    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 3 Lesson 5 Assignment - \n");

        Scanner myScanner = new Scanner(System.in); // init scanner

        // get inputs
        System.out.println("Input value a");
        double a = myScanner.nextDouble();

        System.out.println("Input value b");
        double b = myScanner.nextDouble();

        System.out.println("Input value c");
        double c = myScanner.nextDouble();

        final double[] ans = quadraticFormula(a, b, c); // store the two roots in ans[0] and ans[1]

        // neatly print outputs
        System.out.println("If a, b and c are " + a + ", " + b + " and " + c + ", the roots are " + ans[0] + " and " + ans[1] + ".");
    }
}
/*
 * Sample output:
By: Wakeland Branz
 - Module 3 Lesson 5 Assignment -
Input value a
1
Input value b
1
Input value c
-2
If a, b and c are 1.0, 1.0 and -2.0, the roots are 1.0 and -2.0.
 */