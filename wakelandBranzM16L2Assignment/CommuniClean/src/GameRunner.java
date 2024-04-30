/*
 * Wakeland Branz
 * Date: 4/23/2024
 * Seaforth High School
 *
 * Description:  CommuniClean game
 * Difficulties:  Creating the logic for retrieving and displaying questions was a big challenge.
 * What I Learned:  How to format text files to store information more efficiently
 */

import java.util.Scanner;

public class GameRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            System.out.println("=== Welcome to CommuniClean! ===");
            System.out.println("1. View User Manual");
            System.out.println("2. Begin Playing");
            System.out.println("3. Quit");
            System.out.print("Enter your choice (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    displayUserManual();
                    break;
                case 2:
                    startGame(scanner);
                    break;
                case 3:
                    System.out.println("Thank you for using CommuniClean. Goodbye!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    private static void displayUserManual() {
        System.out.println("=== CommuniClean User Manual ===");
        System.out.println("I. Introduction");
        System.out.println("   A. Welcome to CommuniClean, a simple quiz app for high school students.");
        System.out.println("   B. Purpose: Learn about environmental topics through short quizzes.");
        System.out.println();
        System.out.println("II. Getting Started");
        System.out.println("    A. Open the app on your device.");
        System.out.println("    B. Enter your name to start playing.");
        System.out.println("    C. Select \"Start Quiz\" from the main menu.");
        System.out.println();
        System.out.println("III. Quiz Gameplay");
        System.out.println("     A. Each quiz has 10 multiple-choice questions.");
        System.out.println("     B. Read the question and enter the correct answer.");
        System.out.println("     C. You will see if your answer is correct or incorrect.");
        System.out.println("     D. Earn 10 points for each correct answer.");
        System.out.println("     E. After 10 questions, the quiz ends and shows your total score.");
        System.out.println();
        System.out.println("IV. Troubleshooting");
        System.out.println("    A. If the app freezes, close and reopen it.");
        System.out.println("    B. If filepaths cannot be parsed, change the formatting to your native system's format.");
        System.out.println("    C. If you encounter any issues, inform Wakeland.");
        System.out.println();
        System.out.println("V. FAQs");
        System.out.println("   A. Can I retake a quiz? - Yes, you can retake quizzes to improve your score.");
        System.out.println("   B. Is there a time limit for each question? - No, take your time to answer.");
        System.out.println("   C. How many quizzes are there? - There are 3 quizzes (subject to change) covering different topics.");
        System.out.println();
        System.out.println("VI. Conclusion");
        System.out.println("    A. CommuniClean helps you learn about the environment through simple quizzes.");
        System.out.println("    B. Have fun and do your best!");
        System.out.println("    C. If you have any suggestions, let Wakeland know.");
        System.out.println();
    }

    private static void startGame(Scanner scanner) throws Exception {
        Game game = new Game(scanner);
        game.quizMenu();
    }
}