public class DeMorgansTheorem {
    public static void main(String[] args) throws Exception {
        int a = 5, b = 5;
        // they never gave me anything to apply, but heres some notes

        /*
         * + and * can be substituted for one another (the dude didn't explain this very well)
         * a && (b * c)
         * !(a + b) == (!a) * (!b)  and !(a * b) == (!a) + (!b)
         * 
         * DeMorgan's theorem means that when you have an if statement checking for "not (this AND that)", you can change it to check "if not this OR not that" instead. 
         * For example, instead of saying "if not (x > 5 AND y < 10)", you can say "if x <= 5 OR y >= 10". The OR and AND conditions get switched around when you add the NOT. 
         * This makes the if statements easier to read and understand.
         */
    }
}
