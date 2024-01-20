/*
 * Wakeland Branz
 * Date: 1/18/2024
 * Seaforth High School
 *
 * Description:  Finds all prime numbers from 1-1000 and neatly prints them
 * Difficulties:  I had a really hard time interpreting what this assignment was asking for. Also, ensuring that my isPrime function worked was difficult.  I then had to find a way to find all primes efficiently without having ample empty indexes in my array.  I avoided this by creating a new array and only including valid prime numbers in it.
 * What I Learned:  How to print in clean rows/columns as well as manage arrays in an effective manner.
 */

public class sieveofErantosthenes {
    public static void main(String[] args) throws Exception {
        int[] primes = findAllPrimes(1000);
        System.out.printf("There are %d primes from 1-1000", primes.length);

        for (int i = 0; i < primes.length; i++) {
            if (i % 15 == 0) { // next line every 15 iterations
                System.out.print("\n");
            }
            System.out.printf("%s  ", primes[i]); // right justified, 2 spaces
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) { // don't evaluate numbers less than or equal to 1
            return false;
        }
        for (int i = 2; i <= num / 2; i++) { // for each number in 2..num / 2 check if the remainder is 0
            if ((num % i) == 0) {
                return false;
            } // if the remainder is 0, nonprime number.
        }
        return true; // the number has no remainders of 0, must be prime.
    }

    public static int[] findAllPrimes(int limit) {
        int[] tempList = new int[limit];
        int count = 0; // indexes and stores the number of primes
        if (limit <= 1) {
            return null; // invalid input
        }
        for (int next = 2; next <= limit; next++) { // for each int between 2..limit, check if prime, if so, add to primesList, iterate count
            if (isPrime(next)) {
                tempList[count] = next;
                count++;
            }
        }

        int[] primesList = new int[count]; // now that we have our primes and our total count of primes, create a clean array.
        for (int i = 0; i < count; i++) {
            primesList[i] = tempList[i];
        }
        
        return primesList;
    }
}

/* Sample output:
 * There are 168 primes from 1-1000
 * 2  3  5  7  11  13  17  19  23  29  31  37  41  43  47
 * 53  59  61  67  71  73  79  83  89  97  101  103  107  109  113
 * 127  131  137  139  149  151  157  163  167  173  179  181  191  193  197
 * 199  211  223  227  229  233  239  241  251  257  263  269  271  277  281
 * 283  293  307  311  313  317  331  337  347  349  353  359  367  373  379
 * 383  389  397  401  409  419  421  431  433  439  443  449  457  461  463
 * 467  479  487  491  499  503  509  521  523  541  547  557  563  569  571
 * 577  587  593  599  601  607  613  617  619  631  641  643  647  653  659
 * 661  673  677  683  691  701  709  719  727  733  739  743  751  757  761
 * 769  773  787  797  809  811  821  823  827  829  839  853  857  859  863
 * 877  881  883  887  907  911  919  929  937  941  947  953  967  971  977  
 * 983  991  997
 */