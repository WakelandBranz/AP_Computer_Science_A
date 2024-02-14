public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getQuarters(210));
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