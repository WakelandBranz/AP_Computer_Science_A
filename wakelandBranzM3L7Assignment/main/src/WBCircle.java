/*
 * Wakeland Branz
 * Date: 09/17/2023
 * Seaforth High School
 * Basic classes program M3L7 Assignment
 *
 * Description:  Creates classes and prints their attributes which are defined using methods.
 * Difficulties:  I accidentally set my constructor's return value to void which created a small error that I fixed quickly.
 * What I Learned:  How to create classes in Java.
 */

public class WBCircle {
    private double radius;
    private double area;
    private double circumference;
    private double diameter;

    public WBCircle(double rad) {
        radius = rad;
        area = area();
        circumference = circumference();
        diameter = diameter();
    }

    public WBCircle() { // overloaded constructor for default values
        radius = 0.f;
        // no need to do extra methods here, it would just waste time.
    }
    
    public double area() {
        return Math.PI * (Math.pow(radius, 2)); // Pi(radius^2)
    }

    public double diameter() {
        return area() * 2;
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public void printAttributes() { // neatly prints all attributes of circle
        if (radius == 0.f && area == 0.f && circumference == 0.f) {
            System.out.println("Circle's attributes are null for reason: No arguments passed into constructor!");
            return;
        }
        System.out.print("Radius -> " + radius + "\nDiameter -> " + diameter + "\nArea -> " + area + "\nCircumference -> " + circumference + "\n");
    }

    public static void main (String args[]) throws Exception {
        // creating all testing instances of WBCircle
        WBCircle testCircle = new WBCircle(35.5);
        testCircle.printAttributes();

        WBCircle testCircle2 = new WBCircle();
        testCircle2.printAttributes();

        WBCircle testCircle3 = new WBCircle(123.456);
        testCircle3.printAttributes();
    }
}
/*Sample output:
 * Radius -> 35.5
 * Diameter -> 7918.384283373073
 * Area -> 3959.1921416865366
 * Circumference -> 223.05307840487532
 * Circle's attributes are null for reason: No arguments passed into constructor!
 * Radius -> 123.456
 * Diameter -> 95764.43960775818
 * Area -> 47882.21980387909
 * Circumference -> 775.6969252831631
 */