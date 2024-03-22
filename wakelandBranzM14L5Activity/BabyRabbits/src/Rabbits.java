/*
 * Wakeland Branz
 * Date: 3/21/2024
 * Seaforth High School
 *
 * Description:  Recursive fibonacci's sequence
 * Difficulties:  I initially struggled trying to figure out what the assignment was asking for, but further reading helped me out.
 * What I Learned:  How to recursively calculate the nth term of the fibonacci sequence in Java.
 */

// A female rabbit matures after 2 months.
// Each mature female rabbit produces 1 baby female rabbit the first day of every month.


public class Rabbits {
    // Fibonacci series
    public static int calculatePopulation(int n) {
        if (n <= 1) {
            return n;
        }

        return calculatePopulation(n - 1) + calculatePopulation(n - 2);
    }


    public static void main(String[] args) throws Exception {
        int month = 12;
        int rabbits = calculatePopulation(month);

        if (rabbits > 1) {
            System.out.println("At the end of month " + month + ": There are " + rabbits + " rabbits");
        }
        else {
            System.out.println("At the end of month " + month + ": There is " + rabbits + " rabbit");
        }
    }
}

/* 
 * Sample output:
 * At the end of month 12: There are 144 rabbits
 */