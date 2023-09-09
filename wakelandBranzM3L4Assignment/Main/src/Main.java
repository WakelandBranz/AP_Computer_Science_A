/*
 * Wakeland Branz
 * Date: 09/08/2023
 * Seaforth High School
 * Basic casting and constant usage
 *
 * Description:  Performs math on predefined final variables and casts the result to an int to truncate decimals
 * Difficulties:  Initially I messed up my order of operations and got an incorrect result, but I fixed the issue swiftly.
 * What I Learned:  I learned how to perform basic truncation by casting a float type value to an
 */
 public class Main {
    public static void main(String args[]) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 3 Lesson 4 Assignment - \n");
        
        // this was so that I could ensure that the math was correct
        final boolean debug = false;
        
        // create const variables
        final double additionalCostOver = 0.50, taxRate = 1.0534;
        double totalCost = 50.0; // this variable is to be modified in the future to meet assignment requirements, could be done more efficiently though
        
        totalCost = (totalCost + 17 * additionalCostOver) * taxRate; // perform required math
        
        // Neatly print final cost, cast totalCost to int to truncate decimal place
        if (debug) System.out.print("Actual final cost -> $" + totalCost + "\n");
        System.out.print("Final cost -> $" + (int)totalCost + "\n");  // for debugging when debug is true
    }
}
/*
By: Wakeland Branz
 - Module 3 Lesson 4 Assignment - 
Final cost -> $61
 */