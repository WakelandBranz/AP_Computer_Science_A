/*
 * Wakeland Branz
 * Date: 09/3/2023
 * Seaforth High School
 * String concatenation and manipulation program with my name
 *
 * Description:  Take String data types and manipulate them with their methods
 * Difficulties:  I had no difficulties writing this code as I have done this a plethora of times in other languages.
 * What I Learned:  I taught myself some more methods associated with the String data type.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 2 Lesson 4 Assignment - \n");

        // create string variable buffers to concatenate in fullName
        String firstName = "Wakeland", lastName = "Branz", fullName = firstName + " " + lastName;
        
        // basic printing
        System.out.print("My name is " + fullName + ".\nMy first name is " + firstName.length() + " letters long.\n");
        System.out.print("A substring of my name is " + fullName.substring(5, 8) + " (positions 5..8).\n");
    }
}
/*
By: Wakeland Branz
 - Module 2 Lesson 4 Assignment -
My name is Wakeland Branz.
My first name is 8 letters long.
A substring of my name is and.
 */