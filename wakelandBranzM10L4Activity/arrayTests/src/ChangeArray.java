 // Array Example
//
class ChangeArray
{
  void print ( int[] x )
  {
    for ( int j=0; j < x.length; j++ )
      System.out.print( x[j] + " " );
    System.out.println( );
  }

  void zeroElt ( int[] x, int elt )             // 6.
  {
    if ( elt < x.length )                       // 7.
      x[ elt ] = 0;                             // 8.
  }

  // Make all the elements zero.
  void zeroAll ( int[] ar )
  {
    for ( int j=0; j < ar.length; j++ )
      ar[j] = 0;
  }

}

class ChangeTest
{
  public static void main ( String[] args )     // 1.
  {
    ChangeArray cng = new ChangeArray();        // 2.
    
    int[] value = {27, 19, 34, 5, 12} ;         // 3.
    
    System.out.println( "Before:" );            // 4.
    cng.print( value );
    
    cng.zeroElt( value, 0 );                    // 5.
    System.out.println( "After:" );             // 9.
    cng.print( value );
  }
}

// 2. Did the zeroElt() method change one of the array's elements? 
// Yes, the zeroElt() method changes the first element of the array.

// 3. Since the method zeroElt() has a reference to the array, can it change individual array elements?      
// Yes, it can change individual array elements because it's second argument is the index of the array you'd like to modify.

// 4. If main() had the following method call, what would happen to the array?
// The element at index 4 of the array would be changed to 0.

// 6. Will the j in zeroAll() and the j in print() interfere with each other?    
// The j in zeroAll() and the j in print() will not interfere with each other because they are not in the same scope, therefore they are not treated as the same variable.

