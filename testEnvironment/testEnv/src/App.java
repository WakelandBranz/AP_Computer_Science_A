public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(numVowels("Hi there, AP CSA!"));
        testFunc();
    }
    public static int numVowels(String input) {
            int count = 0;
            String vowels = "aeiou";
            for (int i = 0; i < input.length(); i++) {
                char current = input.toLowerCase().charAt(i);
                if (vowels.contains("" + current)) {
                    count++;
                }
            }
        return count;
    }
    public static void testFunc() {
        String quote = "Eighty percent of success is showing up";
        System.out.println("Quote length: " + quote.length());
        System.out.println("First index of f: " + quote.indexOf("f"));
        quote = quote.substring(0, 29);
        quote += "creativity";
        System.out.println(quote);
    }
}
