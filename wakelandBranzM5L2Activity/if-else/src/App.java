import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your grade? -> ");
        int myGrade = scanner.nextInt();

        if (myGrade >= 70) {
            System.out.println("You passed!");
        }
        else {
            System.out.println("You failed...");
        }

        scanner.close();
    }
}
