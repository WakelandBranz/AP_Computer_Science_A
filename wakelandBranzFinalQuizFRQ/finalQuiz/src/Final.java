/* Write a superclass called Person and two subclasses called Student and Instructor using inheritance.  Each person has a name and a birthdate.  Each student has a major and grade point average.  Each instructor has a salary and hire date. Write class declarations, constructors, accessors, mutators, and toString() methods for all classes. */

class Person {
    public String name;
    public String birthdate;
    
    Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    Person() {
        this.name = "";
        this.birthdate = "";
    }
    
    // To String
    public String toString() {
        return "Name: " + name + " Birthdate: " + birthdate;
    }
    
    // Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    // Getters
    public String getName() {
        return this.name;
    }
    
    public String getBirthdate() {
        return this.birthdate;
    }
}
    
class Student extends Person {
    public String major;
    public double gradePointAverage;
    
    Student(String name, String birthdate, String major, double gradePointAverage) {
        super(name, birthdate);
        this.major = major;
        this.gradePointAverage = gradePointAverage;
    }
    
    Student() {
        super();
        this.major = "";
        this.gradePointAverage = 0.0;
    }

    // To String
    public String toString() {
        return super.toString() + " Major: " + this.major + " Grade Point Average: " + this.gradePointAverage;
    }

    // Setters
    public void setMajor(String major) {
        this.major = major;
    }
    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }

    // Getters
    public String getMajor() {
        return this.major;
    }
    public double getGradePointAverage() {
        return this.gradePointAverage;
    }
}

class Instructor extends Person {
    public double salary;
    public String hireDate;

    Instructor(String name, String birthdate, double salary, String hireDate) {
        super(name, birthdate);
        this.salary = salary;
        this.hireDate = hireDate;
    }

    Instructor() {
        super();
        this.salary = 0;
        this.hireDate = "";
    }

    // To String
    public String toString() {
        return super.toString() + " Salary: " + this.salary + " Hire Date: " + this.hireDate;
    }


    // Setters
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    // Getters
    public double getSalary() {
        return this.salary;
    }

    public String getHireDate() {
        return this.hireDate;
    }
}