/*
 * Wakeland Branz
 * Date: 08/31/2023
 * Seaforth High School
 * Basic printing program with basic calculations
 *
 * Description:  Basic printing program with very low level math.
 * Difficulties:  Truthfully, I had none.  This was very simple as I have programmed in other languages many times. 
 * What I Learned:  How Java's System.out.print() is very similar to Python but vastly different from C++ and Rust.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 2 Lesson 2 Assignment - \n");

        // assign variables
        String myName = "Wakeland Branz";
        int currentAge = 16, futureAge = currentAge + 5;

        // print variables in a formatted and easy to understand manner
        System.out.print("My name is " + myName + " and I am " + currentAge + " years old.  In 5 years I will be " + futureAge + " years old.\n");
    }
}
/*
 * Sample output:
 * "By: Wakeland Branz
 - Module 2 Lesson 2 Assignment -
My name is Wakeland Branz and I am 16 years old.  In 5 years I will be 21 years old."
 */