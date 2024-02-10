/*
 * Wakeland Branz
 * Date: 2/8/2024
 * Seaforth High School
 *
 * Description:  Uses binary search to identify a number in an array
 * Difficulties:  I had a lot of issues with indexing, but some small fixes in my math fixed that issue.
 * What I Learned:  How to use and create a binary search function
 */

import java.util.Scanner;
import java.io.File;

public class binarySearch {
    static boolean debug = false;

    public static void main(String[] args) throws Exception {

        File file = new File("wakelandBranzM11L4Assignment\\binarySearch\\src\\ModuleElevenLessonFourAssignmentDataFile.dat");
        Scanner fileScanner = new Scanner(file);

        int[] intArray = fileToArray(fileScanner);


        // print array
        if (debug) {
            for (int i = 0; i < intArray.length; i++) {
                System.out.printf("Index %d: %d\n", i, intArray[i]);
            }
        }

        Scanner scanner = new Scanner(System.in);
        int target = 0;

        fileScanner.close();

        while (true) {
            System.out.print("Enter a number to search for: ");
            target = scanner.nextInt();

            int resultantIndex = search(intArray, target, 0, intArray.length - 1);

            if (resultantIndex == -1) {
                System.out.println("Your number does not occur in this list.\n");
            }
            else {
                System.out.printf("Your number occurs at position %d\n", resultantIndex + 1);
            }
        }
       
    }

    // input array must be sorted
    // outputs of -1 means that target could not be found
    public static int search(int[] sortedArray, int target, int low, int high) {
        int middle = low + (high - low) / 2;
        
        // could not find target in sortedArray
        if (low > high) {
            return -1;
        }

        if (sortedArray[middle] == target) {
            return middle;
        }

        // since the target is less than middle, we now look at the left half of the array
        else if (sortedArray[middle] > target) {
            return search(sortedArray, target, low, middle - 1);
        }

        // since the target is greater than middle, we now look at the right half of the array
        else if (sortedArray[middle] < target) {
            return search(sortedArray, target, middle + 1, high);
        }

        // could not find target in sortedArray
        return -1;
    }

    // go through each line of the .dat file and parse integers into array
    public static int[] fileToArray(Scanner scanner) {
        int[] result = new int[100];
        int iterator = 0;
        
        while (scanner.hasNextLine()) {
            result[iterator] = scanner.nextInt();
            iterator++;
        }

        result = trimArray(result);

        return result;
    }

    public static int[] trimArray(int[] inputArray) {
        // get proper length of array prior to initializing it
        int length = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0) {
                if (debug) {
                    System.out.printf("Found end of array at index %d\n", i);
                }
                break;
            }
            length++;
        }

        // now initialize our resultant array and assign proper values
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = inputArray[i];
        }
        return result;
    }
}

/* 
 * Sample output:
 * Enter a number to search for: 110
 * Your number does not occur in this list.
 * 
 * Enter a number to search for: 60
 * Your number occurs at position 41
 * Enter a number to search for: 1
 * Your number occurs at position 1
 * Enter a number to search for: 92
 * Your number occurs at position 53
 * Enter a number to search for: 17
 * Your number does not occur in this list.
 */

