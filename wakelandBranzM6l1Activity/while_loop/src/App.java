public class App {
    public static void main(String[] args) throws Exception {
        int sum = 0;
        int iterator = 3;
        while (iterator < 80) {
            sum+=iterator;
            iterator++;
        }

        System.out.println(sum);
    }
}
