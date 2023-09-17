public class Employee {
    private String name;
    private String employeeID;
    private int pay;

    public Employee(String nm, String empID, int py) {
        name = nm;
        employeeID = empID;
        pay = py;
    }

    public Employee(String nm, String empID) {
        name = nm;
        employeeID = empID;
        pay = 20;
    }

    public Employee() {
        name = null;
        employeeID = null;
        pay = 0;
    }
}

// Employee person1 = new Employee("Simon", "7268", 60000);
// Employee person2 = new Employee("Bryan", "7269");
// Employee johnDoe = new Employee();

/*2.1 Videos:
    A class is a blueprint or template that defines the structure and behavior of objects in Java.

    An object is an instance of a class, representing a real-world entity or concept, and it can have its own unique data and behavior.

    No, objects and classes are not the same. A class is a blueprint, while an object is an instance created from that blueprint.

    Instance variables are variables declared within a class that hold data unique to each object created from that class.

    Behaviors in Java refer to the methods (functions) defined within a class that describe what objects of that class can do.

    A tester (or test class) is used to create and test objects of a class to ensure that the class's methods and behaviors work correctly. It helps verify that the class functions as intended.

2.2 Videos:
    A constructor's signature is a unique combination of its name and the types of its parameters, used to identify and differentiate constructors within a class.

    Classes have multiple constructors to provide flexibility for creating objects with different sets of initial values or for various initialization scenarios.

    Call by value means that when passing arguments to a method or function, a copy of the argument's value is passed, not the actual variable itself. Changes made to the parameter within the method do not affect the original variable.

    Actual parameters are the values passed to a method or function when it is called. Formal parameters are the placeholders for these values within the method's definition.

    The compiler determines which constructor to use based on the number and types of arguments passed when creating an object. It matches the constructor's signature with the provided arguments.

    Yes, an object can be initialized without any initial values. In Java, if you don't provide a constructor that explicitly initializes instance variables, they will be given default values (e.g., 0 for numeric types, null for objects) when the object is created. */
