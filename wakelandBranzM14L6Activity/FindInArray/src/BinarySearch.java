/*
 * Wakeland Branz
 * Date: 3/21/2024
 * Seaforth High School
 *
 * Description:  Recursive binary search
 * Difficulties:  Due to the instructions for this assignment I was able to create a mental image of the recursive binary search which was relatively simple.
 * What I Learned:  How to implement a recursive binary search algorithm in Java.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = readNumbersFromFile("wakelandBranzM14L6Activity\\FindInArray\\src\\sort.dat");
        
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter a number to search for (x to quit): ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("x")) {
                int target = Integer.parseInt(input);
                int position = search(numbers, target, 0, numbers.size() - 1);

                if (position != -1) {
                    System.out.println("Your number occurs at position " + (position + 1));
                } 
                else {
                    System.out.println("Your number does not occur in this list");
                }
            }
        } 
        while (!input.equalsIgnoreCase("x"));

        System.out.println("Program terminated.");
        scanner.close();
    }

    public static int search(List<Integer> numbers, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        // If target is less than the middle of the array, pivot to the left half of the array
        if (target < numbers.get(mid)) {
            return search(numbers, target, 0, mid - 1);
        }

        // If target is greater than the middle of the array, pivot to the right half of the array
        if (target > numbers.get(mid)) {
            return search(numbers, target, mid + 1, end);
        }

        // We have found our target
        if (target == numbers.get(mid)) {
            return mid;
        }

        System.out.println("Unknown error when searching array");
        return -1;
    }

    // Reads and adds all numbers in filename into a vector
    public static ArrayList<Integer> readNumbersFromFile(String filename) {
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextInt()) {
                numbers.add(scanner.nextInt());
            }

            scanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }

        return numbers;
    }
}

/*
 * Sample output:
 * Enter a number to search for (x to quit): 100
 * Your number occurs at position 60
 * Enter a number to search for (x to quit): 4
 * Your number occurs at position 5
 * Enter a number to search for (x to quit): 3
 * Your number occurs at position 4
 * Enter a number to search for (x to quit): 78
 * Your number does not occur in this list
 * Enter a number to search for (x to quit): 6
 * Your number does not occur in this list
 * Enter a number to search for (x to quit): 54 
 * Your number does not occur in this list
 * Enter a number to search for (x to quit): 87
 * Your number does not occur in this list
 * Enter a number to search for (x to quit): 99
 * Your number occurs at position 59
 * Enter a number to search for (x to quit): x
 * Program terminated.
 */