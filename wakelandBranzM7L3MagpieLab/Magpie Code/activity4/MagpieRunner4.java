/*
 * Wakeland Branz
 * Date: 11/28/2023
 * Seaforth High School
 * Chatbot phrase recognition
 * 
 * Keywords:
 * I like (user input) -> "What do you like about (user input)?"
 * I do not want (user input) -> "Why don't you want (user input)?"
 * I like (user input 1) and (user input 2) -> "What do you like about (user input 1) and (user input 2)?"
 *
 * Description:  Takes user input and checks for phrases, responds with keywords within said phrases.
 * Difficulties:  Figuring out the logic for how to effectively extract phrases from key words was difficult when it came to two inputs, but I figured it out after drawing out the scenario on my whiteboard.
 * What I Learned:  How to extract specific phrases from a set of keywords.
 */

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}

/*
 * Sample output:
 * Hello, let's talk.
 * I like things
 * What do you like about things?
 * I do not want things
 * Why don't you want things?
 * I like apples and oranges
 * What do you like about apples and oranges?
 */