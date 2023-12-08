/*
 * Wakeland Branz
 * Date: 12/7/2023
 * Seaforth High School
 * Application of file input
 *
 * Description:  Takes student data from a file and neatly prints it in the style of a UI with normalized spacing.
 * Difficulties:  I had a BUNCH of issues with reading data from file, but I found it to be easiest to just do it sequentially rather than making some clever
 * functions to do it for me.  I then had to figure out how to nicely print the data, which didn't take as much thinking, but it took a while.  Creating a 
 * normalized graph wasn't easy either, but some basic thought got me to where I needed.
 * What I Learned:  How to read data from a file and perform an algorithm to neatly display the data in the file.
 */

import java.io.File;
import java.util.Scanner;

public class gradingTools {
  public static void main(String[] args) throws Exception {
    // get file "data.in" from path
    Scanner file = new Scanner(new File("wakelandBranzM8L2Assignment1\\gradingTools\\src\\ModuleEightLessonTwoAssignmentTwoDataFile.data"));
    String student1Name = file.nextLine();
    Student student1 = new Student(1, student1Name, file);

    file.nextLine();
    String student2Name = file.nextLine();
    Student student2 = new Student(2, student2Name, file);

    // formatted printing
    System.out.printf("Course ID   Student#   Course Average\n");
    System.out.printf("CIS 110       %d            %.2f\n", student1.sID, student1.CIS110);
    System.out.printf("              %d            %.2f\n", student2.sID, student2.CIS110);
    System.out.printf("ENG 111       %d            %.2f\n", student1.sID, student1.ENG111);
    System.out.printf("              %d            %.2f\n", student2.sID, student2.ENG111);
    System.out.printf("MTH 141       %d            %.2f\n", student1.sID, student1.MTH141);
    System.out.printf("              %d            %.2f\n", student2.sID, student2.MTH141);
    System.out.printf("CHM 121       %d            %.2f\n", student1.sID, student1.CHM121);
    System.out.printf("              %d            %.2f\n\n", student2.sID, student2.CHM121);
    System.out.printf("Average for student 1: %.2f\n", student1.overallAverage);
    System.out.printf("Average for student 2: %.2f\n\n", student2.overallAverage);

    // these next two lines signify how grade graphs will be graphed
    // each dash is 2 points, so I will divide their grade by two points and then print that amount of x's via the class method
    System.out.printf("0     10    20    30    40    50    60    70    80    90    100\n");
    System.out.printf("|-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|\n"); 

    System.out.println("Student 1 CIS110 Graph");
    student1.printGraphedDataCIS110();

    System.out.println("Student 2 CIS110 Graph");
    student2.printGraphedDataCIS110();

    System.out.println("Student 1 ENG 111 Graph");
    student1.printGraphedDataENG111();

    System.out.println("Student 2 MTH 141 Graph");
    student2.printGraphedDataENG111();

    System.out.println("Student 1 MTH 141 Graph");
    student1.printGraphedDataMTH141();

    System.out.println("Student 2 MTH 141 Graph");
    student2.printGraphedDataMTH141();

    System.out.println("Student 1 CHM 121 Graph");
    student1.printGraphedDataCHM121();

    System.out.println("Student 2 CHM 121 Graph");
    student2.printGraphedDataCHM121();
  }

  static public class Student {
    // instance variables
    int sID;
    String name;
    Scanner file;

    double CIS110;
    double ENG111;
    double MTH141;
    double CHM121;
    double overallAverage;

    // constructor
    public Student(int sID, String name, Scanner file) {
      this.sID = sID;
      this.name = name;
      this.file = file;

      // iterate through each line of file and get grade data, acquire average
      // i wish i could do this with a json instead haha
      String next = file.nextLine().substring(9);
      this.CIS110 = getAverage(next);

      next = file.nextLine().substring(9);
      this.ENG111 = getAverage(next);

      next = file.nextLine().substring(9);
      this.MTH141 = getAverage(next);

      next = file.nextLine().substring(9);
      this.CHM121 = getAverage(next);

      this.overallAverage = (CIS110 + ENG111 + MTH141 + CHM121) / 4.0;
    }

    // print all normalized graphs
    // each x represents 2 grade points.  divides sections with a "|" for easier reading.
    public void printGraphedDataCIS110() {
      double dashCount = this.CIS110 / 2.0;

      for (double i = 0; i < dashCount; i++) {
        if (i % 5 == 0) {
          System.out.print("|");
        }
        System.out.print("x");
      }
      System.out.print("\n");
    }

    public void printGraphedDataENG111() {
      double dashCount = this.ENG111 / 2.0;

      for (double i = 0; i < dashCount; i++) {
        if (i % 5 == 0) {
          System.out.print("|");
        }
        System.out.print("x");
      }
      System.out.print("\n");
    }

    public void printGraphedDataMTH141() {
      double dashCount = this.MTH141 / 2.0;

      for (double i = 0; i < dashCount; i++) {
        if (i % 5 == 0) {
          System.out.print("|");
        }
        System.out.print("x");
      }
      System.out.print("\n");
    }

    public void printGraphedDataCHM121() {
      double dashCount = this.CHM121 / 2.0;

      for (double i = 0; i < dashCount; i++) {
        if (i % 5 == 0) {
          System.out.print("|");
        }
        System.out.print("x");
      }
      System.out.print("\n");
    }
  }

  // gets a set of grades and gets the average of them by using the delimiter of -999
  public static double getAverage(String grades) {
    Scanner scanner = new Scanner(grades);

    double total = 0;
    int numGrades = 0;  

    while(scanner.hasNextDouble()) {
      double grade = scanner.nextDouble();
      if (grade == -999) {
        break;
      }
      total += grade;
      numGrades++;
    }
    scanner.close();
    return total / numGrades;
  }
}

/*
 * Sample Output:
 * Course ID   Student#   Course Average
 * CIS 110       1            79.10
 *               2            65.00
 * ENG 111       1            73.40
 *               2            85.00
 * MTH 141       1            89.80
 *               2            80.60
 * CHM 121       1            72.20
 *               2            91.40
 * 
 * Average for student 1: 78.63
 * Average for student 2: 80.50
 * 
 * 0     10    20    30    40    50    60    70    80    90    100
 * |-----|-----|-----|-----|-----|-----|-----|-----|-----|-----|
 * Student 1 CIS110 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx
 * Student 2 CIS110 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxx
 * Student 1 ENG 111 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xx
 * Student 2 MTH 141 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxx
 * Student 1 MTH 141 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx
 * Student 2 MTH 141 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|x
 * Student 1 CHM 121 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xx
 * Student 2 CHM 121 Graph
 * |xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|xxxxx|x
 */