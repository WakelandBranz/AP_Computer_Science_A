/*
 * Wakeland Branz
 * Date: 12/08/2023
 * Seaforth High School
 * Looping a set of geometric functions
 *
 * Description:  Loops a set of preexisting geometric functions and prints the results
 * Difficulties:  Implementing heron's formula and remembering how to properly loop my function was a struggle at first, but I had to take a second to figure everything out and it all came to me.
 * What I Learned:  How to take user input to perform geometric functions on it.
 */

import java.util.Scanner;

public class triangleCalculator {
    public static void main(String[] args) throws Exception {
        boolean completed = false;
        System.out.println("This program calculates the traits of a triangle.");

        Scanner scanner = new Scanner(System.in);

        while (!completed) {

            System.out.println("What the sides of the triangle?");

            System.out.print("Side A: ");
            double side1 = scanner.nextDouble();

            System.out.print("Side B: ");
            double side2 = scanner.nextDouble();

            System.out.print("Side C: ");
            double side3 = scanner.nextDouble();

            Triangle triangle = new Triangle(side1, side2, side3);

            System.out.printf("This %s triangle's area is %f\n", triangle.type, triangle.area);

            if (triangle.isRightTriangle) {
                System.out.printf("This triangle is a right triangle.\n");
            }
            else {
                System.out.printf("This triangle is not a right triangle.\n");
            }


            // ask if user wants to enter another triangle's properties
            // continue the loop if yes, otherwise end the program.
            System.out.println("Would you like to enter another triangle? Y | N");
            String res = scanner.next().toLowerCase().trim();

            if (res.equals("y")) {
                continue;
            }
            else if (res.equals("n")) {
                break;
            }
            else {
                System.err.println("Invalid input, ending program.");
                System.exit(1);
            }
        }
        scanner.close();
        System.out.println("Goodbye!");
    }

    public static class Triangle {
        // instance variables
        double side1;
        double side2;
        double side3;

        double area;
        String type;
        boolean isRightTriangle;

        public Triangle(double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

            this.area = calculateArea();
            this.type = determineType();
            this.isRightTriangle = isRight();
        }

        // this is a SSS triangle
        // implemented using heron's formula
        // thanks https://www.omnicalculator.com/math/3-sides-triangle-area#calculating-the-area-of-a-triangle-with-3-sides-herons-formula
        private double calculateArea() {
            double p = (side1 + side2 + side3) / 2.0;
            double differenceProduct = (p - side1) * (p - side2) * (p - side3);

            return Math.sqrt(p * differenceProduct);
        }

        private String determineType() {

            // Determine longest and shortest sides
            double longest = Math.max(Math.max(side1, side2), side3); 
            double shortest = Math.min(Math.min(side1, side2), side3);
          
            // Check if all sides equal  
            if(side1 == side2 && side2 == side3) {
              return "Equilateral"; 
            }
            
            // Check if longest side less than sum of other sides
            else if(longest < side1 + side2 + side3 - longest) {
              if(side1 == side2 || side2 == side3 || side1 == side3) {
                return "Isosceles";
              }

              else {
                return "Scalene"; 
              }
            }
            else {
              return "Not a valid triangle";
            }  
          
        }

        // bruteforce way to check if any combination of 2 sides squared is equal to the third side squared
        private boolean isRight() {
            return squared(side1) + squared(side2) == squared(side3) ||
                squared(side1) + squared(side3) == squared(side2) ||
                squared (side2) + squared(side3) == squared(side1);
        }

    }

    public static double squared(double num) {
        return num * num;
    }

}

/*
 * Sample output:
 * This program calculates the traits of a triangle.
 * What the sides of the triangle?
 * Side A: 4 
 * Side B: 5
 * Side C: 6
 * This Scalene triangle's area is 9.921567
 * This triangle is not a right triangle.
 * Would you like to enter another triangle? Y | N
 * y
 * What the sides of the triangle?
 * Side A: 6
 * Side B: 6
 * Side C: 6
 * This Equilateral triangle's area is 15.588457
 * This triangle is not a right triangle.
 * Would you like to enter another triangle? Y | N
 * y
 * What the sides of the triangle?
 * Side A: 9
 * Side B: 9
 * Side C: 6
 * This Isosceles triangle's area is 25.455844
 * This triangle is not a right triangle.
 * Would you like to enter another triangle? Y | N
 * y
 * What the sides of the triangle?
 * Side A: 3
 * Side B: 4
 * Side C: 5
 * This Scalene triangle's area is 6.000000
 * This triangle is a right triangle.
 * Would you like to enter another triangle? Y | N
 * n
 * Goodbye!
 */