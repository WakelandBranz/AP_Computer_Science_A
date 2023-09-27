/*
 * Wakeland Branz
 * Date: 09/26/2023
 * Seaforth High School
 * Basic scanner program with math M4L1Assignment
 *
 * Description:  Uses the scanner class to gain numerous types of user input and performs math on them.
 * Difficulties:  I forgot to assign a value to line 24 initially which led to an error where not all execution paths had a value.
 * What I Learned:  How to use a try catch block to make more user friendly code and perform math on user input.
 */

import java.util.*;

public class Martian {
    public static void main(String[] args) throws Exception {
        final double toMartian = 0.38; // init conversion
        
        Scanner scanner = new Scanner(System.in); // init scanner

        System.out.print("Input your name: ");
        String username = scanner.nextLine();

        boolean completed = false; // loop variable
        double weight = 0.0; // init so all possible execution paths have an initialized weight value
        // ensure that user can continue program if they incorrectly inputted a value
        while (!completed) {
            try { 
                System.out.print("Input your weight on Earth: ");
                weight = scanner.nextDouble();
            }
            catch (Exception e) {
                System.out.println("Wrong data type inputted, please try again.\nError -> " + e);
                scanner.nextLine(); // discard invalid input
                continue;
            }
            completed = true;
        }
        System.out.println(username + "'s weight on Earth is " + weight + " lbs and their weight on mars is " + (weight * toMartian) + " lbs.");

        scanner.close();
    }
}

/*Input your name: Wakeland Branz
 *Input your weight on Earth: 100
 *Wakeland Branz's weight on Earth is 100.0 lbs and their weight on mars is 38.0 lbs.
*/
