import java.util.*; // for vector utilities

public class stanislauUlamTheorem {

    // we are looking for the final element of this vector to be 1
    public static Vector<Integer> applyTheorem(int input) {
        Vector<Integer> result = new Vector<Integer>();

        // we loop the theorem until we get 0
        while (true) {

            // if odd, multiply by 3 and add 1
            if (input % 2 != 0) {
                input *= 3;
                input++;

                result.add(input);
            }
            // if even, divide by 2
            else {
                input /= 2;

                result.add(input);
            }
            if (input == 1) {
                return result; // finished!
            }
        }
    }
    public static void main(String[] args) throws Exception {

        // apply theorem for 1 through 25 and print
        for (int i = 1; i < 26; i++) {
            Vector<Integer> currentList = applyTheorem(i);

            // prints which number you are applying the theorem to
            System.out.printf("%d: ", i);

            // for every element in currentList, print the element with a buffer space
            for (int j = 0; j < currentList.size(); j++) {
                System.out.printf("%d ", currentList.get(j));
            }

            System.out.println(""); // next line
        }
    }
}
