/*
 * Wakeland Branz
 * Date: 2/1/2024
 * Seaforth High School
 *
 * Description:  Uses selection sort to demonstrate the properties of arrays
 * Difficulties:  Figuring out how to get duplicates took me a little while, but I implemented the function using online resources
 * What I Learned:  More in depth array usage
 */

import java.util.Scanner;
import java.util.Random;

public class SelectionSortTester
{ 
  // Sort the Array
  //

    public static void selectionSort( int[] array )   
    {          
        // Find the integer that should go in each cell of     
        // the array, from cell 0 to the end     
        for ( int j=0; j<array.length-1; j++ )     
        {
            // Find min: the index of the integer that should go into cell j.       
            // Look through the unsorted integers (those at j or higher)       
            int min = j;       
            for ( int k=j+1; k<array.length; k++ )  
            {
                if ( array[k] < array[min] )
                {
                    min = k;          
                }
            }
                // Swap the int at j with the int at min        
            int temp = array[min];   
            array[min] = array[j];  
            array[j] = temp;     
        }
    } 

  // thank you https://stackoverflow.com/questions/31738717/java-count-duplicates-from-int-array-without-using-any-collection-or-another-i
  public static int countDuplicates(int[] array) {
    selectionSort(array);

    int previous = array[0] - 1;
    int duplicateCount = 0;

    for (int i = 0; i < array.length; ++i) {
      // check that we aren't comparing a null pointer then compare current and next integer in array
      if (array[i] == previous) {
        ++duplicateCount;
      }
      else {
        previous = array[i];
      }
    }
    return duplicateCount;
  }
  
  public static void main ( String[] args )
  {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    System.out.print("Input size of array: ");
    final int SIZE = scanner.nextInt();

    int[] values = new int[SIZE];

    // assign random value between 0 and 99 to each values[i]
    for (int i = 0; i < SIZE; i++) {
      values[i] = rand.nextInt(100);
    }
    
    // print out the array
    System.out.println("initial values: "); 
    for ( int val : values )
      {
          System.out.print( val + ", " ); 
        }

    // get start time
    long startTime = System.currentTimeMillis();

    // sort the array
    selectionSort( values );

    // get end time and print difference between start and end
    long endTime = System.currentTimeMillis();
    System.out.println("Total execution time: " + (endTime - startTime) );

    // print out the array
    System.out.println("\n\nsorted values: "); 
    for ( int val : values )
      {
          System.out.print( val + ", " ); 
        }
    

    // get start time
    long testStartTime = System.currentTimeMillis();

    System.out.println("\nSorting again to test selectionSort efficiency...");

    selectionSort(values);

    // get end time and print difference between start and end
    long testEndTime = System.currentTimeMillis();
    System.out.println("Total execution time: " + (endTime - startTime) );

    System.out.printf("Duplicates in array: %d", countDuplicates(values));
 
   }
}

/*
 * Sample output:
 * Input size of array: 100
 * initial values: 
 * 31, 89, 42, 58, 81, 55, 31, 90, 78, 61, 46, 72, 12, 30, 5, 7, 66, 63, 80, 40, 28, 57, 94, 98, 25, 72, 98, 28, 54, 64, 6, 12, 16, 1, 73, 28, 82, 93, 79, 98, 65, 17, 15, 37, 30, 52, 62, 8, 34, 73, 59, 48, 9, 
 * 92, 36, 86, 96, 58, 46, 45, 89, 22, 61, 30, 45, 31, 23, 79, 97, 63, 59, 46, 98, 17, 88, 92, 74, 55, 12, 0, 5, 32, 47, 2, 74, 74, 99, 22, 91, 76, 21, 62, 11, 3, 47, 41, 18, 67, 97, 37, Total execution time: 
 * 0
 * 
 * 
 * sorted values:
 * 0, 1, 2, 3, 5, 5, 6, 7, 8, 9, 11, 12, 12, 12, 15, 16, 17, 17, 18, 21, 22, 22, 23, 25, 28, 28, 28, 30, 30, 30, 31, 31, 31, 32, 34, 36, 37, 37, 40, 41, 42, 45, 45, 46, 46, 46, 47, 47, 48, 52, 54, 55, 55, 57, 
 * 58, 58, 59, 59, 61, 61, 62, 62, 63, 63, 64, 65, 66, 67, 72, 72, 73, 73, 74, 74, 74, 76, 78, 79, 79, 80, 81, 82, 86, 88, 89, 89, 90, 91, 92, 92, 93, 94, 96, 97, 97, 98, 98, 98, 98, 99,
 * Sorting again to test selectionSort efficiency...
 * Total execution time: 0
 * Duplicates in array: 33
*/