/*
 * Wakeland Branz
 * Date: 10/16/2023
 * Seaforth High School
 * Application of file input
 *
 * Description:  Takes a file as input and uses the data within it to construuct a functional equation.
 * Difficulties:  I had to restructure my file path for the scanner to read the file, but after a short time I fixed it.
 * What I Learned:  How to read and store data from files in Java.
 */

import java.util.*;
import java.io.*;

public class fileData {
    public static void main(String[] args) throws IOException {
        Scanner file = new Scanner(new File("wakelandBranzM5L8Activity\\fileData\\src\\NumData.in"));

        int maxIndex = -1;
        String text[] = new String [100];

        // while there is more to look for in the file
        while (file.hasNext()) {
            maxIndex++;

            text[maxIndex] = file.nextLine();
        }

        file.close();

        // loop through file and create a readable output using the number data in the file
        for (int i = 0; i <= maxIndex; i++) {
            Scanner sc = new Scanner(text[i]);
            int sum = 0;
            String answer = "";

            while (sc.hasNext()) {
                int j = sc.nextInt();
                answer = answer + " + " + j;
                sum+=j;
            }
            answer = answer + " = " + sum;
            System.out.println(answer);
        }
    }
}

/* 
 * Sample output:
 * + 12 + 10 + 3 + 5 = 30
 * + 18 + 1 + 5 + 92 + 6 + 8 = 130
 * + 2 + 9 + 3 + 22 + 4 + 11 + 7 = 58
 */