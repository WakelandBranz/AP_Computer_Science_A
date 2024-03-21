/*
 * Wakeland Branz
 * Date: 3/20/2024
 * Seaforth High School
 *
 * Description:  Polymorphism example
 * Difficulties:  Figuring out how to structure the code to get the desired result.
 * What I Learned:  A deeper understanding of polymorphism with calling super methods.
 */

class Base {
    // Prints A
    public void methodOne() {
        System.out.print("A");
    }
    
    // Prints B
    public void methodTwo() {
        System.out.print("B");
    } 

    // Creates a Base object and assigns it a "Derived" object which extends Base
    public static void main(String[] args) {
        Base b = new Derived();
        b.methodOne();
    }
}

class Derived extends Base {
    // Calls methodOne which then calls Base methodOne and methodTwo, printing AB
    // then calls methodTwo printing D, followed by printing C
    public void methodOne() {
        super.methodOne();
        super.methodTwo();
        methodTwo();
        System.out.print("C");
    }

    public void methodTwo() {
        System.out.print("D");
    }
}

/*
 * Sample output:
 * ABDC
 */
