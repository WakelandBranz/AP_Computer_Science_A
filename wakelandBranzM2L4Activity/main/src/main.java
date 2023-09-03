/*
 * Wakeland Branz
 * Date: 09/3/2023
 * Seaforth High School
 * String concatenation and manipulation program
 *
 * Description:  Take String data types and manipulate them with their methods
 * Difficulties:  I had no difficulties writing this code as I have done this a plethora of times,
 * What I Learned:  Python handles strings similarly to how Java does because they are high level languages.  C++ and Rust require a lot more steps to manipulate strings, unfortunately.
 */

public class main {
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 2 Lesson 4 Activity - \n");

        // create string variable buffers to concatenate in res
        String helloBuffer = "Hello", goodBuddyBuffer = " good buddy.", res = helloBuffer + goodBuddyBuffer;
        System.out.println("Variable res = " + res + " It's length is " + res.length() + ".");

        // create string variables to slice into subStrMyPet
        String myPet = "Bluebell the poodle", subStrMyPet = myPet.substring(0, 8);
        System.out.println("My dog's name is " + subStrMyPet + ".");
    }
}
/*
By: Wakeland Branz
 - Module 2 Lesson 4 Activity -
Variable res = Hello good buddy. It's length is 17.
My dog's name is Bluebell.
 */