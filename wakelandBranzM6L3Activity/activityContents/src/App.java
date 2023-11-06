public class App {
    public static void main(String[] args) throws Exception {
        // DO WHILE STATEMENT EXAMPLE
        /* 
         * do while loops guarantee that you go through the loop
         * at least once, so using them is nice for scenarios 
         * where that may be necessary
         */
        {
            int sum = 0;
            int i = 3;

            // exponential function
            do {
                sum += i;
                i++;
            }
            while (i <= 79);
            System.out.printf("Sum of do-while: %d -> Total iterations: %d\n", sum, i);
        }
        

        // same _____ different day
        /* 
         * checks if the loop is valid first, then execute.
         * this does not guarantee execution.
         */
        {
            int sum = 0;
            int i = 3;

            // expontential function
            while (i <= 79) {
                sum += i;
                i++;
            }
            System.out.printf("Sum of while: %d -> Total Iterations: %d\n", sum, i);
        }
    }
}
