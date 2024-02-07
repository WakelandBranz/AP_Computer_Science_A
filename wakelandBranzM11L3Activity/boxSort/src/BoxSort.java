public class BoxSort {
 
  // Sort an array of Box
  public static void selectionSort( Box[] array )
  { 
    // Find the object reference that should go in each cell of
    // the array, from cell 0 to the end
    for ( int j=0; j < array.length-1; j++ )
    {
      // Find min: the index of the reference that should go into cell j.
      // Look through the unsorted references (those at j or higher)
      int min = j;
      for ( int k=j+1; k < array.length; k++ )
        if ( array[k].compareTo( array[min] ) < 0 ) min = k;  

      // Swap the reference at j with the reference at min 
      Box temp   = array[j];
      array[j]   = array[min];
      array[min] = temp;
    }
  }
  
  public static void main ( String[] args )
  {
    Box[] boxArray = 
      { new Box( 1.0, 2.3, 2.7),  new Box( 1.0, 4.9, 3.2), new Box( 3.0, 1.3, 2.7),
        new Box( 3.0, 0.1, 4.67), new Box( 1.3, 1.3, 1.3), new Box( 4.0, 2.3, 1.7),
        new Box( 2.2, 2.1, 1.67), new Box( 2.3, 7.3, 6.3), new Box( 2.0, 3.3, 5.3) 
      };
    
    // print out the array
    System.out.println("Before: "); 
    for ( Box box : boxArray )
      System.out.println( box ); 
    System.out.println( );
    
    // sort the array
    selectionSort( boxArray );
  
    // print out the array
    System.out.println("After: "); 
    for ( Box box : boxArray )
      System.out.println( box ); 
    System.out.println( );
 
   }
}