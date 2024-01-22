import java.util.Scanner;


// 1. and 2.
class CountArray {
    public static void main(String[] args) {
        int[] egArray = { 2, 4, 6, 8, 10, 1, 3, 5, 7, 9 };

        // does the assignment want this sorted?  it makes it seem as if it doesn't
        for (int i = 0; i < egArray.length; i++) {
            System.out.println(egArray[i]);
        }

        /* to reverse this, the for loop should be structured as such:
         * for (int i = egArray.length - 1; i >= 0; i--) 
         */
    }
}

// 3.
//class InputArray {
//  public static void main ( String[] args )
//  {
//
//    int[] array = new int[5];
//    int   data;
//
//    Scanner scan = new Scanner( System.in );
//
//    // input the data
//    for (int index = 0 ; index < array.length ; index++)
//    {
//      System.out.println( "enter an integer: " );
//      data = scan.nextInt();
//      array[ index ] = data ;
//    }
//      
//    // write out the data
//    for (int index = 0; index < array.length ; index++)
//    {
//      System.out.println( "array[ " + (index + 1) + " ] = " + array[ index ] );
//    }
//
//  }
//} 

// 4.
class InputArray{
  public static void main ( String[] args )
  {

    int[] array;
    int   data;
    Scanner scan = new Scanner( System.in );

    // determine the size and construct the array
    System.out.print( "What length is the array? " );
    int size = scan.nextInt();

    array = new int[size];

    // input the data
    for (int index=0; index < array.length; index++)
    {
      System.out.print( "enter an integer: " );
      array[ index ] = scan.nextInt();
    }
      
    // write out the data
    for ( int index=0; index < array.length; index++ )
    {
      System.out.println( "array[ " + index + " ] = " + array[ index ] );
    }
  }
}

/*
 * 5.
 * Examine the following collection of integers:
 * -20, 19, 1, 27, 5, -1, 27, 19, 5
 * 
 * What is the maximum of the collection? -> The maximum of the collection is 27
 * How did you figure this out? -> It is the largest number out of this collection
 */

// 6.
class MaxAlgorithm{
 public static void main ( String[] args ) {
   int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
   int   max;
   // initialize the current maximum

   max = array[0];
   // scan the array
   for ( int index=0; index < array.length; index++ ) {
        if (array[index] > max) {
           max = array[index];
        }
    }
     
    System.out.println("The maximum of this array is: " + max );
    }
}

/*
 * 7.
 * Change the test part of the for to
 * index < array.length-1
 * 
 * Now run the program again on the above test cases.
 * Will the program (with the changed loop) find the correct maximum of the data that is given in the original initializer list? -> Yes the way in which the current array is set up will not lead to any unwanted results.
 * When will the program not work correctly? -> The program will not work correctly when the largest value in the array is at index array.length - 1
 * Is it obvious that there is a bug? -> No, it is not obvious that there is a bug.
 */

/*
 * 8. What happens when the following code is run?
 * int[] myWeeklyPay = {769, 588, 1245, 309, 388, 902};
 * int sum = 0;
 * 
 * for ( int j=0; j<=6; j++ ) sum += myWeeklyPay[j];
 * This will lead to an out of bounds error since you are accessing index 6 of an array with a maximum index of 5.
 */

 // 9.
 class MinAlgorithm {
    public static void main ( String[] args ) {

    int[] array =  { -20, 19, 1, 5, -1, 27, 19, 5 } ;
    int   min;

    // initialize the current minimum
    min = array[0];


    // scan the array
    for ( int index=0; index < array.length; index++ )
    { 
     if (array[index] < min)

        min = array[index];

    }
      
    System.out.println("The minimum of this array is: " + min );
    }
}


// 10.
class AverageAlgorithm {
    public static void main ( String[] args) {
        int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 } ;
        double average = 0;

        // get sum of array
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }

        // divide sum by total amount of elements in array
        average /= array.length;

        System.out.printf("The average of this array is %.2f\n", average);
    }
}