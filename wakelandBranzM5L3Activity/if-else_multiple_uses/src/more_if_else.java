import java.io.*;
import java.util.*;

public class more_if_else {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your grade? -> ");
        int myGrade = scanner.nextInt();

        if (myGrade >= 90) {
            System.out.println("You got an A");
        }
        else if (myGrade >= 80) {
            System.out.println("You got a B");
        }
        else if (myGrade >= 70) {
            System.out.println("You got a C");
        }
        else {
            System.out.println("You failed...");
        }

        scanner.close();
    }
}
