/*Project: M4L1AssignmentGallonsToLiters
 * Author: John Doe
 * Version: 2
 * Description: This class converts an inputed amount of gallons into liters.
 * In this program I learned how to initiate a new Scanner, assign calculations, round and display the results 
 * The only difficulty I had was forgetting one of the semi-colons, once I added it, the program ran.
*/
package section4lesson1;	//package

import java.util.Scanner;	//utility for Scanner

public class JohnDoeM4L1AssignmentGallonsToLiters {	//class
	public static void main(String[] args) {	//main method
		Scanner scanterm = new Scanner(System.in);	//initiate new Scanner
		System.out.println("Enter the number of gallons to be converted to liters.");	//prompt for number of gallons
		double gallons = Double.parseDouble(scanterm.nextLine());	// initiate double gallons to hold the inputed value
		double liters = gallons*3.78541;	//initiate double liters by multiplying gallons by 3.78541
		System.out.println(gallons + " gallons = " + Math.round(liters*1000.0)/1000.0 + " liters");	//print gallons and rounded liters
	}
}
/* Sample Output:
 * Input: 4 liters
 * Output: 4 gallons = 15.14 liters
*/