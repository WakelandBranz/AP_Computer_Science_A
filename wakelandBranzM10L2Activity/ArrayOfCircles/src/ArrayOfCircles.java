/*
 * Wakeland Branz
 * Date: 1/18/2024
 * Seaforth High School
 *
 * Description:  Creates 500 circle objects in an array
 * Difficulties:  I did this activity without much friction fortunately.
 * What I Learned:  How to efficiently assign a large amount of indexes in an array to an object
 */

class Circle {
    // instance variables
    private double radius;
    private double diameter; // radius * 2
    private double area; // PI * (radius * radius)

    private final double PI = 3.1415926535;

    Circle (double radius) {
        this.radius = radius;
        update();
    }

    // update all instance variables based on newly set radius
    private void update() {
        diameter = radius * 2.0;
        area = PI * (radius * radius);
    }

    // setters

    public void setRadius(double radius) {
        this.radius = radius;
        update();
    }

    // getters

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}

public class ArrayOfCircles {
    public static void main(String[] args) throws Exception {
        Circle cir[] = new Circle[500];
        // cir[117] = new Circle(57.2);
        // cir[10] = new Circle(12.232);

        // assign all 500 circles a new circle object
        for (int i = 0; i < cir.length; i++) {
            cir[i] = new Circle(10.0);
        }

        System.out.printf("Circle 100's area = %f", cir[100].getArea());
    }
}

/* Sample output:
 * Circle 100's area = 314.159265
*/ 

// Question : Which of these methods will be easiest for 500 circles? Why? Type your answer in a comment at the bottom of your program

/*
 * Using a loop to assign a value to each of the indexes of a large array is easier than manually assigning values.
 * Not only will looping allow for more flexible and scaleable projects, but it is also significantly less time consuming and easier to do.
 */
