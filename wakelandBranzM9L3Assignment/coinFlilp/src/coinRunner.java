/*
 * Wakeland Branz
 * Date: 12/15/2023
 * Seaforth High School
 *
 * Description:  Creates three coin objects and flips them until they have all landed on the same side
 * Difficulties:  Figuring out how to check if all coin states were the same took me two tries, but the rest of the assignment was not too difficult.
 * What I Learned:  How to organize a file with private classes and a runner class
 */

import java.util.Random;

class Coin {
    String state; 
    Random rand = new Random();

    public Coin() {}

    // false = tails, true = heads
    // generate a random boolean and then assign resulting String to this.state
    public void flip() {
        boolean res = this.rand.nextBoolean();

        this.state = "tails";
        if (res) {
            this.state =  "heads";
        }
    }

    // getters
    public String getState() {
        return this.state;
    }

    // setters
    public void setState(String state) {
        this.state = state;
    }
}

public class coinRunner {
    public static void main(String[] args) throws Exception {
        int iteration = 0;

        // loop until all coins flip to the same side
        while (true) {
            Coin coin1 = new Coin();
            Coin coin2 = new Coin();
            Coin coin3 = new Coin();

            coin1.flip();
            coin2.flip();
            coin3.flip();

            iteration++;

            System.out.println("Flip #" + iteration);
            System.out.println("Coin 1 -> " + coin1.state);
            System.out.println("Coin 2 -> " + coin2.state);
            System.out.println("Coin 3 -> " + coin3.state);

            // if all states are the same
            if (coin1.state == coin2.state && coin1.state == coin3.state) {
                System.out.println("The coins were flipped a total of " + iteration + " times before landing on the same side (" + coin1.state + ").");
                return;
            }

            // spacing
            System.out.println("");
        }
    }
}

/*
 * Sample output:
 * Flip #1
 * Coin 1 -> tails
 * Coin 2 -> tails
 * Coin 3 -> heads
 * 
 * Flip #2
 * Coin 1 -> tails
 * Coin 2 -> heads
 * Coin 3 -> heads
 * 
 * Flip #3
 * Coin 1 -> heads
 * Coin 2 -> heads
 * Coin 3 -> tails
 * 
 * Flip #4
 * Coin 1 -> tails
 * Coin 2 -> tails
 * Coin 3 -> heads
 * 
 * Flip #5
 * Coin 1 -> tails
 * Coin 2 -> heads
 * Coin 3 -> tails
 * 
 * Flip #6
 * Coin 1 -> tails
 * Coin 2 -> heads
 * Coin 3 -> tails
 * 
 * Flip #7
 * Coin 1 -> tails
 * Coin 2 -> tails
 * Coin 3 -> heads
 * 
 * Flip #8
 * Coin 1 -> tails
 * Coin 2 -> heads
 * Coin 3 -> tails
 * 
 * Flip #9
 * Coin 1 -> tails
 * Coin 2 -> tails
 * Coin 3 -> tails
 * The coins were flipped a total of 9 times before landing on the same side (tails).
 */