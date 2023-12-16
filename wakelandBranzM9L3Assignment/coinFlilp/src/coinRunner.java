import java.util.Random;

class Coin {
    boolean state; // 0 = tails, 1 = heads
    Random rand = new Random();

    public Coin() {}

    public void flip() {
        this.state = this.rand.nextBoolean();
    }

    // getters
    public boolean getState() {
        return this.state;
    }

    // setters
    public void setState(boolean state) {
        this.state = state;
    }
}

public class coinRunner {
    public static void main(String[] args) throws Exception {
        int iteration = 0;

        // infinite loop
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
                System.out.println("The coins were flipped a total of " + iteration + " times before landing on the same side.");
                return;
            }

            // spacing
            System.out.println("");
        }
    }
}
