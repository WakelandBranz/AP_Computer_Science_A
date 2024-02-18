/*
 * Wakeland Branz
 * Date: 2/16/2024
 * Seaforth High School
 *
 * Description:  Creates and prints multiple matrices
 * Difficulties:  I am familiar with matrices from my experience in other programming languages so I did not struggle too much on this assignment.
 * What I Learned:  How to use 2d arrays in Java.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int matrix[][] = {
            {22, 23},
            {24, 25},
            {26, 27}, 
        };

        int emptyMatrix[][] = new int[3][4];

        printMatrix(matrix);
        printMatrix(emptyMatrix);
    }

    public static void printMatrix(int matrix[][]) {
        // print matrix
        // i = row, j = column
        for (int i = 0; i < matrix.length; i++) {
            // access columns within rows
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}

/* 
 * Sample Output: 
 * 22
 * 23
 * 24
 * 25
 * 26
 * 27
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0
 * 0 
 */