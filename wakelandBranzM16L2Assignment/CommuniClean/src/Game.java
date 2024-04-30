import java.util.Scanner;

public class Game {
    private Quiz climateChangeQuiz;
    private Quiz biodiversityQuiz;
    private Quiz sustainableLivingQuiz;
    private Scanner scanner;

    public Game(Scanner scanner) {
        climateChangeQuiz = new Quiz();
        biodiversityQuiz = new Quiz();
        sustainableLivingQuiz = new Quiz();
        this.scanner = scanner;

        String[] filenames = {"wakelandBranzM16L2Assignment\\CommuniClean\\src\\ClimateChange.txt", "wakelandBranzM16L2Assignment\\CommuniClean\\src\\Biodiversity.txt", "wakelandBranzM16L2Assignment\\CommuniClean\\src\\SustainableLiving.txt"};

        climateChangeQuiz.loadQuestionsFromFile(filenames[0]);
        biodiversityQuiz.loadQuestionsFromFile(filenames[1]);
        sustainableLivingQuiz.loadQuestionsFromFile(filenames[2]);
    }

    public void quizMenu() {
        boolean quit = false;

        while (!quit) {
            System.out.println("=== CommuniClean: Environmental Quiz Game ===");
            System.out.println("1. Climate Change Quiz");
            System.out.println("2. Biodiversity Quiz");
            System.out.println("3. Sustainable Living Quiz");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Starting Climate Change Quiz...");
                    climateChangeQuiz.askQuestions();
                    break;
                case 2:
                    System.out.println("Starting Biodiversity Quiz...");
                    biodiversityQuiz.askQuestions();
                    break;
                case 3:
                    System.out.println("Starting Sustainable Living Quiz...");
                    sustainableLivingQuiz.askQuestions();
                    break;
                case 4:
                    System.out.println("Thank you for playing CommuniClean!");
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }
}