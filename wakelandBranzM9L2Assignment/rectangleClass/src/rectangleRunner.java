/*
 * Wakeland Branz
 * Date: 12/14/2023
 * Seaforth High School
 * Instantiating three rectangles and printing their attributes through calculations
 *
 * Description:  Creates three rectangles and prints their attributes
 * Difficulties:  This was quite simple because I had done all of this in the triangle calculator assignment.
 * What I Learned:  How to organize a file with private classes and a runner class
 */

import java.util.Scanner;

class Rectangle { 
        // instance variables
        public double length;
        public double width;

        // default constructor
        public Rectangle() {
            this.length = 0;
            this.width = 0;
        }

        // parameterized constructor
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        // setters
        public void setLength(double length) {
            this.length = length;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        // calculators
        public double calculatePerimeter() {
            return 2 * (length + width);
        }

        public double calculateArea() {
            return width * length;
        }

    }

public class rectangleRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // instantiate three objects
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();
        Rectangle rec3 = new Rectangle();

        // input for rec1
        System.out.println("Enter length of rec1:");
        double lengthRec1 = scanner.nextDouble();
        rec1.setLength(lengthRec1);

        System.out.println("Enter width of rec1:");
        double widthRec1 = scanner.nextDouble();
        rec1.setWidth(widthRec1);

        // input for rec2
        System.out.println("Enter length of rec2:");
        double lengthRec2 = scanner.nextDouble();
        rec2.setLength(lengthRec2);

        System.out.println("Enter width of rec2:");
        double widthRec2 = scanner.nextDouble();
        rec2.setWidth(widthRec2);

        // input for rec3
        System.out.println("Enter length of rec3:");
        double lengthRec3 = scanner.nextDouble();
        rec3.setLength(lengthRec3);

        System.out.println("Enter width of rec3:");
        double widthRec3 = scanner.nextDouble();
        rec3.setWidth(widthRec3);

        // display results
        System.out.println("\nResults:");
        System.out.println("Rec1 Perimeter: " + rec1.calculatePerimeter());
        System.out.println("Rec1 Area: " + rec1.calculateArea());

        System.out.println("\nRec2 Perimeter: " + rec2.calculatePerimeter());
        System.out.println("Rec2 Area: " + rec2.calculateArea());

        System.out.println("\nRec3 Perimeter: " + rec3.calculatePerimeter());
        System.out.println("Rec3 Area: " + rec3.calculateArea());

        scanner.close();
    }
}

/* 
 * Sample output:
 * Enter length of rec1:
 * 3
 * Enter width of rec1:
 * 2
 * Enter length of rec2:
 * 4
 * Enter width of rec2:
 * 3
 * Enter length of rec3:
 * 2
 * Enter width of rec3:
 * 2
 * 
 * Rec1 Perimeter: 10.0
 * Rec1 Area: 6.0
 * 
 * Rec2 Perimeter: 14.0
 * Rec2 Area: 12.0
 * 
 * Rec3 Perimeter: 8.0
 * Rec3 Area: 4.0
 */