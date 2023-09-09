/*
 * Wakeland Branz
 * Date: 09/08/2023
 * Seaforth High School
 * Basic concatenation program
 *
 * Description:  Concatenates and prints predefined variables
 * Difficulties:  I had to figure out how I would remove the last 3 characters from each string, but I just got another substring out of my previous substring.
 * What I Learned:  How to extract specific characters from a string more effectively.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // introductory print
        System.out.print("By: Wakeland Branz\n - Module 3 Lesson 6 Assignment - \n");

        // required Strings
        String s1 = "Taylor Swift";
        String s2 = "John Boyega";
        String s3 = "Emma Stone";

        // concatenate string to remove first 2 and last 3 characters (HORRIBLY UNCONVENTIONAL AND MESSY)
        System.out.println(s1 + ">>>" + s1.toLowerCase().substring(2).substring(0, s1.length() - 5) + "\n" + s2 + ">>>" + s2.toLowerCase().substring(2).substring(0, s2.length() - 5) + "\n" + s3 + ">>>" + s3.toLowerCase().substring(2).substring(0, s3.length() - 5));
    }
}
/*
 * Sample output:
By: Wakeland Branz
 - Module 3 Lesson 6 Assignment -
Taylor Swift>>>ylor sw
John Boyega>>>hn boy
Emma Stone>>>ma st
 */