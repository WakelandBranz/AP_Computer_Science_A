/*
 * Wakeland Branz
 * Date: 1/23/2024
 * Seaforth High School
 *
 * Description:  Takes input from a .dat file and performs an algorithm to extract, print and modify the data
 * Difficulties:  My logic to read from the file was initially incorrect, but then I took a more simple approach and got the correct data from the file into my arrays.
 * What I Learned:  How to format extracted data from a file into a class.
 */

import java.util.Scanner;
import java.io.File;

public class scoreRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("wakelandBranzM10L3Assignment\\scoreArray\\src\\M10L3A1.dat"));
        Scores scores = new Scores(scanner);

        scanner.close();
    }
}

class Scores {
    // instance variables
    private Scanner scanner;

    private int[] ids;
    private int[] scores;
    private double sum;
    private double average;

    Scores(Scanner scanner) {
        this.scanner = scanner;
        
        this.ids = new int[20];
        this.scores = new int[20];
        this.assignIdsAndScores(); // set ids and scores
        this.calculateSum(); // set sum
        this.calculateAverage(); // set average

        System.out.printf("Sum = %f\nAverage = %f\nCount = %d\n", this.sum, this.average, this.scores.length);
        this.printInfo();
    }

    // inititialize variables

    public void assignIdsAndScores() {
        int i = 0;

        // while we have an int, grab each two subsequent values from each row and place them into their respective array variable
        while(this.scanner.hasNextInt()) {
            if (i < this.ids.length) {
                this.ids[i] = this.scanner.nextInt();
            }
            else {
                break;
            }

            if (this.scanner.hasNextInt()) {
                this.scores[i] = this.scanner.nextInt();
            }
            else {
                break;
            }

            i++;
        }
        System.out.println("End of reading from file.");
    }

    private void calculateSum() {
        for (int i = 0; i < this.scores.length; i++) {
            this.sum += this.scores[i];
        }
    }

    private void calculateAverage() {
        this.average = this.sum / this.scores.length;
    }

    // print

    public void printInfo() {
        System.out.println("Id     Score     Diff");
        for (int i = 0; i < this.ids.length; i++) {
            System.out.printf("%d    %d      %.2f\n", this.ids[i], this.scores[i], this.scores[i] - this.average);
        }
    }

    // setters

    public void setIds(int index, int modifier) {
        this.ids[index] = modifier;
    }

    public void setScores(int index, int modifier) {
        this.scores[index] = modifier;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    // getters

    public int[] getIds() {
        return this.ids;
    }

    public int[] getScores() {
        return this.scores;
    }

    public double getSum() {
        return this.sum;
    }

    public double getAverage() {
        return this.average;
    }

}

/*
 * Sample output:
 * End of reading from file.
 * Sum = 4853.000000
 * Average = 242.650000
 * Count = 20
 * Id     Score     Diff
 * 115    257      14.35
 * 123    253      10.35
 * 116    246      3.35
 * 113    243      0.35
 * 112    239      -3.65
 * 104    239      -3.65
 * 110    238      -4.65
 * 218    243      0.35
 * 208    242      -0.65
 * 222    223      -19.65
 * 223    230      -12.65
 * 213    229      -13.65
 * 207    228      -14.65
 * 203    224      -18.65
 * 305    265      22.35
 * 306    262      19.35
 * 311    256      13.35
 * 325    246      3.35
 * 321    245      2.35
 * 323    245      2.35
 */