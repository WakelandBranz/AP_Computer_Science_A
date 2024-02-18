/*
 * Wakeland Branz
 * Date: 2/18/2024
 * Seaforth High School
 *
 * Description:  Creates multiple int matrices and finds their minimum and maximum
 * Difficulties:  I forgot to declare variables prior to comparing them in my nested loop initially.
 * What I Learned:  How to use 2d arrays in Java.
 */

import java.io.*;

class ArrayMaxMin {
    public static void main(String[] args) {
        int[][] data = {
            {3, 2, 5},
            {1, 4, 4, 8, 13},
            {9, 1, 0, 2},
            {0, 2, 6, 3, -1, -8}
        };

        // Declare and initialize the max and the min
        int min = data[0][0];
        int max = data[0][0];

        // Iterate through the 2D array to find max and min
        for (int row = 0; row < data.length; row++) {
            for (int col = 0; col < data[row].length; col++) {
                int current = data[row][col];

                if (current < min) {
                    min = current;
                }

                if (current > max) {
                    max = current;
                }
            }
        }

        // Write out the results
        System.out.println("max = " + max + "; min = " + min);
    }
}

/*
 * Sample output: 
 * max = 13; min = -8
 */