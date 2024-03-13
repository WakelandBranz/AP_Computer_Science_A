public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getQuarters(210));

        LoudDog dummy = new LoudDog("dummy");
        System.out.println(dummy.speak());
    }

    public static int getQuarters(int cents) {
        return cents / 25;
    }
    
    //public static int circleTest(ArrayList<Circle> cir) {
    //    for (int i = 0; i < cir.size(); i++) {
    //        if (Math.abs(5 - cir[i].getRadius()) < 0.01) {
    //            return i;
    //        }
    //    }
    //    return -1;
    //}
}


//class Circle {
//    public void setRadius(double r);
//    public double getRadius();
//    public String toString();
//}

abstract class Pet {
    private String myName;
    
    public Pet(String name) {
        myName = name;
    }

    public String getName() {
        return myName;
    }

    public abstract String speak();
}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }

    public String speak() {
        return "dog-sound";
    }

}

class LoudDog extends Dog {

    public LoudDog(String name) {
        super(name);
    }

    public String speak() {
        return super.speak() + " " + super.speak();
    }
}