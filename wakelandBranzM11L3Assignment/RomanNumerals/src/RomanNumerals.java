/*
 * Wakeland Branz
 * Date: 2/6/2024
 * Seaforth High School
 *
 * Description:  Converts roman numeral and decimal times back and forth and prints them
 * Difficulties:  This entire project was extremely difficult, from the conversions to the storing logic.
 * What I Learned:  A deeper knowledge of storing and modifying data from user input
 */

import java.util.ArrayList;

public class RomanNumerals {
    public static void main(String[] args) throws Exception {
        String[] romanNumeralArray = {"XII:XXV", "IX:XV", "III:XL"};
        String[] decimalArray = {"12:30", "5:32", "2:23"};

        System.out.println("Roman numeral array: ");
        Roman romanToDecimal = new Roman(romanNumeralArray);
        System.out.println("Decimal array: ");
        Roman decimalToRoman = new Roman(decimalArray);
    }
}

class Roman {
    String[] inputString;
    ArrayList<String> outputString = new ArrayList<>();
    boolean isInputRomanNumeral = false;

    Roman(String[] input) {
        this.inputString = input;
        if (isRomanNumeral(inputString[0])) {
            isInputRomanNumeral = true;
        }

        for (int i = 0; i < input.length; i++) {
            String current = input[i];
            if (isRomanNumeral(current)) {
                this.outputString.add(romanToDecimal(current));
            }
            else {
                this.outputString.add(decimalToRoman(current));
            }
        }
        sortOutput();
        printOutput();
    }

    // Sorts the output
    public void sortOutput() {
        // Create a new ArrayList to store the decimal times
        ArrayList<String> decimalTimes = new ArrayList<>();

        // Convert all the times to decimal format
        for (String time : outputString) {
            if (isRomanNumeral(time)) {
                decimalTimes.add(romanToDecimal(time));
            } 
            else {
                decimalTimes.add(time);
            }
        }

        // Perform bubble sort on the decimal times
        for (int i = 0; i < decimalTimes.size() - 1; i++) {
            for (int j = 0; j < decimalTimes.size() - i - 1; j++) {
                String current = decimalTimes.get(j);
                String next = decimalTimes.get(j + 1);

                // Split the strings into hours and minutes
                String[] currentParts = current.split(":");
                String[] nextParts = next.split(":");

                int currentHours = Integer.parseInt(currentParts[0]);
                int currentMinutes = Integer.parseInt(currentParts[1]);
                int nextHours = Integer.parseInt(nextParts[0]);
                int nextMinutes = Integer.parseInt(nextParts[1]);

                // Compare the times
                if (currentHours > nextHours || (currentHours == nextHours && currentMinutes > nextMinutes)) {
                    // Swap the elements if the current time is greater than the next time
                    decimalTimes.set(j, next);
                    decimalTimes.set(j + 1, current);
                }
            }
        }

        // Update the outputString with the sorted times
        outputString.clear();
        if (isInputRomanNumeral) {
            // Convert the sorted decimal times back to Roman numerals
            for (String time : decimalTimes) {
                outputString.add(decimalToRoman(time));
            }
        } 
        else {
            // Keep the sorted decimal times as is
            outputString.addAll(decimalTimes);
        }
    }

    // Print our converted output string
    public void printOutput() {
        for (int i = 0; i < this.outputString.size(); i++) {
            System.out.printf("%S\n", this.outputString.get(i));
        }
    }

    // Takes in a roman numeral time and converts it to its decimal equivalent
    public static String romanToDecimal(String romanNumeral) {
        if (romanNumeral == null) {
            System.out.println("Roman input is null");
            System.exit(0);
        }

        if (romanNumeral.length() == 0) {
            System.out.println("Roman input length is 0");
            System.exit(0);
        }

        String[] parts = romanNumeral.split(":");
        String romanHour = parts[0];
        String romanMinutes = parts[1];

        int hours = convertRomanToDecimal(romanHour);
        int minutes = convertRomanToDecimal(romanMinutes);

        return String.format("%d:%d", hours, minutes);
    }

    // Takes in a decimal time and converts it to its roman numeral equivalent
    public static String decimalToRoman(String decimal) {
        if (decimal == null) {
            System.out.println("Decimal input is null");
            System.exit(0);
        }

        if (decimal.length() == 0) {
            System.out.println("Decimal input length is 0");
            System.exit(0);
        }

        String[] parts = decimal.split(":");
        String romanHour = parts[0];
        String romanMinutes = parts[1];

        String hours = convertDecimalToRoman(Integer.parseInt(romanHour));
        String minutes = convertDecimalToRoman(Integer.parseInt(romanMinutes));

        return String.format("%S:%S", hours, minutes);
    }

    // Converts a roman numeral sequence to its decimal equivalent
    private static int convertRomanToDecimal(String romanNumeral) {
        // Initialize our total
        int result = 0;

        for (int i = 0; i < romanNumeral.length(); i++) {
            int current = getRomanValue(romanNumeral.charAt(i));

            // Ensure that there is another char to compare
            if (i + 1 < romanNumeral.length()) {
                int next = getRomanValue(romanNumeral.charAt(i + 1));

                // Comparing values
                if (current >= next) {
                    // Current is greater than the next val
                    result += current;
                }
                else {
                    // Current is less than the next val
                    result += next - current;
                    i++; // Iterates to next set of roman numerals
                }
            }
            else {
                result += current;
            }
        }
        return result;
    }

    // Converts a decimal to its roman numeral sequence equivalent
    private static String convertDecimalToRoman(int decimal) {
        StringBuilder roman = new StringBuilder();

        while (decimal >= 1000) {
            roman.append("M");
            decimal -= 1000;
        }
        if (decimal >= 900) {
            roman.append("CM");
            decimal -= 900;
        }
        if (decimal >= 500) {
            roman.append("D");
            decimal -= 500;
        }
        if (decimal >= 400) {
            roman.append("CD");
            decimal -= 400;
        }
        while (decimal >= 100) {
            roman.append("C");
            decimal -= 100;
        }
        if (decimal >= 90) {
            roman.append("XC");
            decimal -= 90;
        }
        if (decimal >= 50) {
            roman.append("L");
            decimal -= 50;
        }
        if (decimal >= 40) {
            roman.append("XL");
            decimal -= 40;
        }
        while (decimal >= 10) {
            roman.append("X");
            decimal -= 10;
        }
        if (decimal >= 9) {
            roman.append("IX");
            decimal -= 9;
        }
        if (decimal >= 5) {
            roman.append("V");
            decimal -= 5;
        }
        if (decimal >= 4) {
            roman.append("IV");
            decimal -= 4;
        }
        while (decimal >= 1) {
            roman.append("I");
            decimal -= 1;
        }
        return roman.toString();
    }

     // Returns the value of a roman symbol
     private static int getRomanValue(char r) {
        switch (r) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    private static boolean isRomanNumeral(String input) {
        // Check if the first char is alphabetic
        if (Character.isAlphabetic(input.charAt(0))) { return true; }
        return false;
    }
}

/*
 * Sample output:
 * Roman numeral array: 
 * III:XL
 * IX:XV
 * XII:XXV
 * Decimal array:
 * 2:23
 * 5:32
 * 12:30
 */