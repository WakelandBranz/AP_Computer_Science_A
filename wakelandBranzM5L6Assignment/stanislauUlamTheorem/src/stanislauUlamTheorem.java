/*
 * Wakeland Branz
 * Date: 10/15/2023
 * Seaforth High School
 * Apply Stanislau Ulam's theorem for integers 1-25
 *
 * Description:  Applies Stanislau Ulam's theorem for integers 1-25
 * Difficulties:  I accidentally structured my algorithm in the wrong order, but using a Vector made it easier for me to display and store information.
 * What I Learned:  How to use vectors in Java (sorry if this isn't what you wanted, I can change it if thats easier) and how to effectively use loops
 */

import java.util.*; // for vector utilities

public class stanislauUlamTheorem {

    // we are looking for the final element of this vector to be 1
    public static Vector<Integer> applyTheorem(int input) {
        Vector<Integer> result = new Vector<Integer>();

        // we loop the theorem until we get 0
        while (true) {

            // if odd, multiply by 3 and add 1
            if (input % 2 != 0) {
                input *= 3;
                input++;

                result.add(input);
            }
            // if even, divide by 2
            else {
                input /= 2;

                result.add(input);
            }
            if (input == 1) {
                return result; // finished!
            }
        }
    }
    public static void main(String[] args) throws Exception {

        // apply theorem for 1 through 25 and print
        for (int i = 1; i < 26; i++) {
            Vector<Integer> currentList = applyTheorem(i);

            // prints which number you are applying the theorem to
            System.out.printf("%d: ", i);

            // for every element in currentList, print the element with a buffer space
            for (int j = 0; j < currentList.size(); j++) {
                System.out.printf("%d ", currentList.get(j));
            }

            System.out.println(); // next line
        }
    }
}
/* Sample output:
 * 1: 4 2 1 
 * 2: 1 
 * 3: 10 5 16 8 4 2 1 
 * 4: 2 1 
 * 5: 16 8 4 2 1 
 * 6: 3 10 5 16 8 4 2 1 
 * 7: 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1         
 * 8: 4 2 1 
 * 9: 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1 
 * 10: 5 16 8 4 2 1
 * 11: 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 12: 6 3 10 5 16 8 4 2 1
 * 13: 40 20 10 5 16 8 4 2 1
 * 14: 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 15: 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
 * 16: 8 4 2 1
 * 17: 52 26 13 40 20 10 5 16 8 4 2 1
 * 18: 9 28 14 7 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 19: 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 20: 10 5 16 8 4 2 1
 * 21: 64 32 16 8 4 2 1
 * 22: 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 * 23: 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1
 * 24: 12 6 3 10 5 16 8 4 2 1 
 * 25: 76 38 19 58 29 88 44 22 11 34 17 52 26 13 40 20 10 5 16 8 4 2 1
 */
