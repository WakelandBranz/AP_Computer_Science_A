/*
 * Wakeland Branz
 * Date: 11/13/2023
 * Seaforth High School
 * Calculate tuition cost for a college student
 *
 * Description:  Calculates tuition through a loop and a basic algorithm with basic math.
 * Difficulties:  Figuring out the order in which to calculate values within my loop as an initial struggle, but I fixed the issue rather fast.
 * What I Learned:  I gained a deeper understanding of loop order and neat printing
 */

public class App {
    public static void main(String[] args) throws Exception {
        // initialize all variables which will be used later
        double tuitionCost = 4000.0;
        double roomAndBoardCost = 9500.0;
        double totalCost = 0;
        double salary = 14000.0;

        double remainder = 0;

        // print columns
        System.out.println("Year      Tuition     Rm&Bd     Total Cost     Salary     Excess/Shortage");

        // loop 4 times
        for (int i = 1; i < 5; i++) {
            // change initial values for print
            totalCost = tuitionCost + roomAndBoardCost;
            remainder = salary - totalCost;

            // neatly print all values
            System.out.printf("Year %d     %.2f     %.2f     %.2f     %.2f     %.2f\n", i, tuitionCost, roomAndBoardCost, totalCost, salary, remainder);

            // modify values for next print
            tuitionCost *= 1.15;
            roomAndBoardCost *= 1.10;
            salary*=1.04;
        }
    }
}

/*
 * Sample output:
 * Year      Tuition     Rm&Bd     Total Cost     Salary     Excess/Shortage
 * Year 1     4000.00     9500.00     13500.00     14000.00     500.00   
 * Year 2     4600.00     10450.00     15050.00     14560.00     -490.00 
 * Year 3     5290.00     11495.00     16785.00     15142.40     -1642.60
 * Year 4     6083.50     12644.50     18728.00     15748.10     -2979.90
 */
