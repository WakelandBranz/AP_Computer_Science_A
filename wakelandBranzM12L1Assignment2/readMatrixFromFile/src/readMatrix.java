/*
 * Wakeland Branz
 * Date: 2/18/2024
 * Seaforth High School
 *
 * Description:  Read a matrix from a data file and print specific characters based on the read integer
 * Difficulties:  I forgot to print on a new line after each row which took me a few minutes to debug.
 * What I Learned:  How to use 2d arrays in Java and perform an algorithm with said data.
 * This was a pretty cool assignment, I hope there's more like this in the future.
 */

import java.io.File;
import java.util.Scanner;

public class readMatrix {
    public static void main(String[] args) throws Exception {
        boolean debug = false;

        File file = new File("wakelandBranzM12L1Assignment2\\readMatrixFromFile\\src\\ModuleTwelveLessonOneAssignmentFourDataFile.txt");
        Scanner fileScanner = new Scanner(file);

        int data[][] = getData(fileScanner);
        if (debug)
            printMatrix(data);

        printImage(data);
    }

    public static int[][] getData(Scanner fileScanner) {
        int result[][] = new int[64][64];

        int row = 0, column = 0;
        while (fileScanner.hasNextInt()) {
            // assign next int to result[row][column]
            result[row][column] = fileScanner.nextInt();

            // iterate column
            column++;

            // check if we have reached the end of the current row, reset column, and iterate into next row
            if (column % 64 == 0) {
                column = 0;
                row++;
            }
        }

        return result;
    }

    public static void printMatrix(int matrix[][]) {
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.println(matrix[row][column]);
            }
        }
    }

    public static char determineChar(int input) {
        switch (input / 8) {
            case (0):
                return ' ';
            case (1):
                return '.';
            case (2):
                return ',';
            case (3):
                return '-';
            case (4):
                return '+';
            case (5):
                return 'o';
            case (6):
                return 'O';
            default: 
                return 'X';
        }
    }

    // read all data from each index, passing it into determineChar to figure out what to print
    public static void printImage(int matrix[][]) {
        int current = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                current = matrix[row][column];
                System.out.print(determineChar(current));
            }
            System.out.println(); // new line after each column
        }
    }
}

/* 
 * Sample output: 
 *                                                              O
 * 
 *                                                              ,
 *                                                              X
 *                                                              O
 *                                                              X
 *                                                              O
 * 
 *                                                              X
 *                                                              ,
 *                                                              ,
 *                                                              ,
 *                                                              o
 *                                                              ,
 *                                                              ,
 *                                                              ,
 *                                                              ,
 *                                                              .
 * OOOOOOOOOO   OOOOOOOOOO   OOOOOOOOOO   OOOOOOOOOO            X
 * XXXXXXXXXX   XXXXXXXXXX   XXXXXXXXXX   XXXXXXXXXX            X
 * ++++++++++   ++++++++++   ++++++++++   ++++++++++            -
 * oo      oo   oo      oo   oo      oo   oo      oo            O
 * OO      OO   OO      OO   OO      OO   OO      OO            o
 * XX      XX   XX      XX   XX      XX   XX      XX            -
 * ++      ++   ++      ++   ++           ++                    o
 * oo      oo   oo      oo   oo           oo
 * OO      OO   OO      OO   OO           OO                    ,
 * XX      XX   XX      XX   XX           XX                    +
 * ++      ++   ++      ++   ++           ++
 * oo      oo   oo      oo   oo           oo                    o
 * OO      OO   OO      OO   OO           OO                    -
 * XX      XX   XX      XX   XX           XX                    ,
 * ++      ++   ++      ++   ++           ++                    .
 * oooooooooo   oooooooooo   oo           oooooooooo            ,
 * OOOOOOOOOO   OOOOOOOOOO   OO           OOOOOOOOOO
 * XXXXXXXXXX   XXXXXXXXXX   XX           XXXXXXXXXX
 * ++      ++   ++           ++                   ++            ,
 * oo      oo   oo           oo                   oo            -
 * OO      OO   OO           OO                   OO            X
 * XX      XX   XX           XX                   XX            o
 * ++      ++   ++           ++                   ++            -
 * oo      oo   oo           oo                   oo            ,
 * OO      OO   OO           OO                   OO            ,
 * XX      XX   XX           XX                   XX            -
 * ++      ++   ++           ++                   ++
 * oo      oo   oo           oo                   oo            ,
 * OO      OO   OO           OO                   OO            ,
 * XX      XX   XX           XX      XX   X       XX            +
 * ++      ++   ++           ++      ++   ++      ++            ,
 * oo      oo   oo           oo      oo   oo      oo            ,
 * OO      OO   OO           OOOOOOOOOO   OOOOOOOOOO            -
 * XX      XX   XX           XXXXXXXXXX   XXXXXXXXXX            .
 * ++      ++   ++           ++++++++++   ++++++++++
 *                                                              +
 *                                                               
 *                                                              +
 *                                                              +
 *                                                              +
 *                                                              o
 *                                                              .
 *                                                              X
 *                                                              ,
 *                                                              .
 * 
 */