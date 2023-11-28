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

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		int initialStatementLength = statement.length();

		statement.toLowerCase().trim();

		int differenceInLength = initialStatementLength - statement.length();


		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}

		// newly added checks by Wakeland Branz
		else if (statement.contains("please say something")) {
			response = "Something.";
		}
		else if (statement.contains("sport")) {
			if (statement.contains("baseball")) {
				response = "What do you like about baseball?";
			}
			else if (statement.contains("weightlifting")) {
				response = "What do you like about weightlifting?";
			}
			else if (statement.contains("tennis")) {
				response = "What do you like about tennis?";
			}
			else {
				response = "What is your favorite sport?";
			}
		}
		else if (statement.contains("food")) {
			response = "What is your favorite food?";
		}
		else if (statement.contains("computer")) {
			response = "What do you do with computers?";
		}
		else if (statement.contains("pet")) {
			response = "What is your pet's name?";
		}
		else if (statement.contains("hate")) {
			response = "What about it do you so strongly dislike?";
		}
		// end of new checks

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}

		return response;
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