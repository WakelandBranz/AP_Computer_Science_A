import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Intakes a text file that contains prompts, answers, and the correct response.
// File format example:
/*
 * Prompt1 (String)
 * AnswerA (String)
 * AnswerB (String)
 * AnswerC (String)
 * AnswerD (String)
 * AnswerE (String)
 * CorrectResponse (int)
 */
public class Quiz {
    /// PUBLIC INSTANCE VARIABLES
    public ArrayList<Question> questions;
    public int grade = 0;

    public Quiz() {
        questions = new ArrayList<Question>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void loadQuestionsFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String prompt = fileScanner.nextLine();
                ArrayList<String> answers = new ArrayList<String>();

                // Read answers until a line contains a single integer (correct response)
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    try {
                        int correctResponse = Integer.parseInt(line);
                        Question question = new Question(new Scanner(System.in), prompt, answers, correctResponse);
                        questions.add(question);
                        break;
                    } 
                    catch (NumberFormatException e) {
                        answers.add(line);
                    }
                }
            }

            fileScanner.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        }
    }

    public void askQuestions() {
        for (Question question : questions) {
            question.askQuestion();
            boolean isCorrect = question.checkResponse();
            if (isCorrect) {
                System.out.println("Correct!");
                grade += 10;
            } 
            else {
                System.out.println("Incorrect.");
            }
            System.out.println();
        }
        System.out.println("--- Result ---");
        System.out.println("Grade: " + grade);
    }
}

class Question {
    // PUBLIC INSTANCE VARIABLES
    public String prompt;
    public ArrayList<String> answers;
    public String[] answerLetters = {"A", "B", "C", "D", "E", "F", "G"};
    public int correctResponse; // The index of the correct answer

    // PRIVATE INSTANCE VARIABLES
    private Scanner scanner;

    // FUNCTIONS
    public Question(Scanner scanner) {
        this.scanner = scanner;
        prompt = "";
        answers = new ArrayList<String>();
        correctResponse = 0;
    }

    public Question(Scanner scanner, String prompt, ArrayList<String> answers, int correctResponse) {
        this.scanner = scanner;
        setPrompt(prompt);
        setAnswers(answers);
        this.correctResponse = correctResponse;
    }

    public void askQuestion() {
        // Print prompt
        System.out.printf("--- Question ---\n%s\n", prompt);

        // Print answers
        System.out.println("--- Answers ---");
        for (int i = 0; i < answers.size(); i++) {
            // Printed answer format: "B: AnswerB"
            System.out.printf("%s: %s\n", answerLetters[i], answers.get(i));
        }
    }

    // Returns true if the user's answer is correct, allowing for score to be kept.
    public boolean checkResponse() {
        System.out.print("Your response: ");
        String response = scanner.nextLine().toUpperCase();

        if (response.equals(answerLetters[correctResponse])) {
            return true;
        }
        return false;
    }

    // SETTERS
    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public void setCorrectResponse(int correctResponse) {
        this.correctResponse = correctResponse;
    }

    // GETTERS
    public String getPrompt() {
        return this.prompt;
    }

    public ArrayList<String> getAnswers() {
        return this.answers;
    }

    public int getCorrectResponse() {
        return this.correctResponse;
    }
}