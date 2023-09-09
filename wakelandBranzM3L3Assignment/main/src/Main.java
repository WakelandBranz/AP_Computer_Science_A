/*
 * Wakeland Branz
 * Date: 09/08/2023
 * Seaforth High School
 * Basic division and modulus usage
 *
 * Description:  Takes a total of mints and performs integer division to get an accurate count of possible servings that can be made. Then, it performs a modulus operation
 * and gets the remaining amount of mints after the division has been performed.
 * Difficulties:  I had no difficulties writing this code as I have done this a plethora of times in other languages.
 * What I Learned:  I learned that the modulus operator is essentially universal among all languages.
 */
 
 public class Main {
    public static void main(String args[]) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 3 Lesson 3 Assignment - \n");
        
        // initialize integers, perform basic math
        int totalMints = 500, numberOfBags = 500 / 3, mintsLeftOver = 500 % 3;

        // print results of integer operations
        System.out.print("Total Mints -> " + totalMints + "\nNumber of bags -> " + numberOfBags + "\nMints left over -> " + mintsLeftOver + "\n");
    }
}
/*
By: Wakeland Branz
 - Module 3 Lesson 3 Assignment - 
Total Mints -> 500
Number of bags -> 166
Mints left over -> 2
 */