/*
 * Wakeland Branz
 * Date: 10/22/2023
 * Seaforth High School
 * Application of file input
 *
 * Description:  Takes a file as input and uses the data within it to count the amount of occurances of a specific circumstance
 * Difficulties:  I initially struggled with getting an accurate total count but I solved that issue relatively quickly.
 * What I Learned:  How to read, store, and use information from a file.
 */

 import java.util.*;
 import java.io.*;
 
 public class iterateFileData {
    
    public static void main(String[] args) throws IOException {
        // get file "data.in" from path
        Scanner file = new Scanner(new File("wakelandBranzM5L9Assignment\\externalFileStuff\\src\\data.in"));

        int sumGreaterThan500 = 0;
        int sumLessThan500 = 0;
 
        int maxIndex = -1;
        String text[] = new String [500];
 
        // while there is more to look for in the file, creates a max index
        while (file.hasNext()) {
            maxIndex++;
            text[maxIndex] = file.nextLine();
        }
 
        file.close();
 
        // loop through file and create a readable output using the number data in the file
        for (int i = 0; i <= maxIndex; i++) {
            // scan this section of text so we can validate and extract information
            Scanner sc = new Scanner(text[i]);
            
            // if we have a valid value, loop through the scanned text and check if 
            if (sc.hasNext()) {
                int j = sc.nextInt();
                if (j > 499) {
                    sumGreaterThan500++;
                }
                else if (j < 500) {
                    sumLessThan500++;
                }
            }
            sc.close();
        }

        final int TOTAL = sumGreaterThan500 + sumLessThan500;
        // neatly print all values, both sums added is the total
        System.out.printf("The amount of numbers less than 500 is %d\nThe amount of numbers greater than or equal to 500 is %d\nThe total amount of numbers is %d", 
            sumLessThan500, sumGreaterThan500, TOTAL);
    }
 }
 
/* 
 * Sample output:
 * The amount of numbers less than 500 is 263
 * The amount of numbers greater than or equal to 500 is 237
 * The total amount of numbers is 500
*/