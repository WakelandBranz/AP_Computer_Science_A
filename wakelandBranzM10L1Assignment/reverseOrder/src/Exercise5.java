/*
 * Wakeland Branz
 * Date: 1/17/2024
 * Seaforth High School
 *
 * Description:  Reverses an array
 * Difficulties:  I forgot that in order to reverse an array you only had to iterate through the list for length / 2 iterations, so I had incorrect results for a while.
 * What I Learned:  How to efficiently reverse an array.
 */

class Exercise5
{
  public static void main ( String[] args )
  {
    int[] val = {0, 1, 2, 3}; 
    int temp;
 
    System.out.println( "Original Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
    // reverse the order of the numbers in the array
 
    // only iterate for array length / 2 because two swaps are made per iteration
    for (int i = 0; i < val.length / 2; i++) {
      temp = val[i]; // store val[i] for later swap
      val[i] = val[val.length - i - 1]; // change element i to be corresponding element i distance from end of array
      val[val.length - i - 1] = temp; // change element i from end of array to element from the front of array
    }
    
    System.out.println( "Reversed Array: " 
        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
   }
}

/*
 * Sample output:
 * Original Array: 0 1 2 3
 * Reversed Array: 3 2 1 0
 */