/*
 * Wakeland Branz
 * Date: 11/28/2023
 * Seaforth High School
 * Keywords: sport, baseball, weightlifting, tennis, food, computer, pet, hate, please say something
 * 
 * Responses
 * Sport - What is your favorite sport?
 * Sport + Baseball - What do you like about baseball?
 * Sport + Tennis - What do you like about tennis?
 * Sport + Weightlifting - What do you like about weightlifting?
 * Food - What is your favorite food?
 * Computer - What do you like about computers?
 * Pet - What is your pet's name?
 * Hate - What about it do you so strongly dislike?
 *
 * Description:  Takes user input and checks for certain keywords to respond.
 * Difficulties:  Figuring out what the assignment was asking was a large struggle for me at first, but I figured it out after.
 * What I Learned:  How to effectively use if else and else statements for checking for keywords in strings.
 */


import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.toLowerCase().equals("bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}

/*
 * Sample output:
 * Hello, let's talk.
 * sport
 * What is your favorite sport?
 * baseball
 * Hmmm.
 * my favorite sport is baseball
 * What do you like about baseball?
 * my favorite sport is tennis
 * What do you like about tennis?
 * my favorite sport is weightlifting 
 * What do you like about weightlifting?
 * food                 
 * What is your favorite food?
 * computer
 * What do you do with computers?
 * pet
 * What is your pet's name?
 * hate
 * What about it do you so strongly dislike?
 * please say something
 * Something.
 * my favorite sport is food
 * What is your favorite sport?
 * bye
 */