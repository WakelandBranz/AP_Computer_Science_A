/*
 * Wakeland Branz
 * Date: 10/03/2023
 * Seaforth High School
 * Practicing operators
 *
 * Description:  Takes an input of age and performs math on it based on the age entered.
 * Difficulties:  I initially forgot to truncate my decimals but I fixed that issue quuickly.
 * What I Learned:  How to use if statements with Java code.
 */

public class App {
    public static void main(String[] args) throws Exception {
        int x = 37;
        int y = 49;
        int r = 37;
        boolean b = (x >= y) && !(x==r);
        boolean c = (x >= y) || !(x==r);
        // && comes before || in operator precedence
        boolean d = true && false || false; // operator precedence example

        System.out.printf("B -> %b\nC -> %b\nD -> %b", b, c, d);

        System.out.printf("\n%d %d %d %d", (int)'A', (int)'P',
            (int)'C', (int)'S');
    }
}

/*
 * Sample output:
 * B -> false
 * C -> false
 * D -> false
 */