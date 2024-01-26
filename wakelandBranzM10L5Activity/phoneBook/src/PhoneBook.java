class PhoneEntry
{
  private String name;    // name of a person
  private String phone;   // their phone number

  PhoneEntry( String n, String p )
  {
    name = n; phone = p;
  }
  //add a getter for both instance variables

  String getName() {
    return this.name;
  }

  String getPhone() {
    return this.phone;
  }
}

public class PhoneBook
{ 
  PhoneEntry[] phoneBook; 

  PhoneBook()    // constructor
  {
    phoneBook = new PhoneEntry[ 5 ] ;

    phoneBook[0] = new PhoneEntry( "James Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John Wood", "(913) 883-2874" );
  
  }

  // Use linear search to find the targetName.
  // Return a reference to the matching PhoneEntry or null
  // if none is found.
  //
  PhoneEntry search( String targetName )  
  {
    for (int i = 0; i < phoneBook.length; i++) {
      if (targetName.equals(phoneBook[i].getName())) {
        return phoneBook[i];
      }
    }
    return null;
  }
}

// Test the PhoneBook object by searching for one person.
//
class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
  
    // search for "Violet Smith"
    PhoneEntry entry = pb.search( "Violet Smith" ); 

    // if found, print out the entry
    if ( entry != null )
      System.out.println( entry.getName() + ": " + entry.getPhone() );
    else
      System.out.println("Name not found" );

  }
}

// Question 2.
// The variable phoneBook is a 5 wide array containing nulls which are intended to be populated with new PhoneEntry instances.

// Question 3.
// The search method is intended to return null if it does not find a matching PhoneEntry.

// Question 5.
// Yes, the linear search algorithm can be used on a completely full array.

// Question 7.
// Yes, those two expressions do the same thing. The order as to which element compares which does not matter as long as they are the same element.