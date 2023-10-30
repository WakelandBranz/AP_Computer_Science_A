public class App {
    public static void main(String[] args) throws Exception {
        // example 1: iterates up and adds
        System.out.println("Example 1");
        int sum = 0;

        for (int i = 3; i < 80; i++) {
            sum+=i;
            System.out.println(sum);
        }

        System.out.printf("Final: %d\n", sum);

        // example 2: iterates down
        System.out.println("Example 2");
        for (int j = 100; j >= 0; j--) {
            System.out.println(j);
        }

        // example 3: braceless for loop
        System.out.println("Example 3");
        for (int l = 0; l < 101; l++) System.out.println(l);

        // example 4: nested loop
        int total = 0;
        for (int n = 0; n < 10; n++) {
            for (int m = 0; m < 5; m++) {
                total++;
            }
        }
        System.out.println(total);
    }
}
