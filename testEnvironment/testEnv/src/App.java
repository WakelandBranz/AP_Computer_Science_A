public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(getQuarters(210));
    }

    public static int getQuarters(int cents) {
        return cents / 25;
    }
    
    
}
