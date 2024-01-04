import java.util.*;

public class mailingAddress {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // get all user data
        Address address = new Address(scanner);

        // print data in required formats
        address.printFormatted();
        address.printLines();
    }
}

class Address {
    // instance variables

    private String street;
    private String city;
    private String state;
    private String zip;
    
    private Scanner scanner;

    // constructors 

    public Address (String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;

        this.scanner = new Scanner(System.in);
    }

    public Address (Scanner scanner) {
        this.scanner = scanner;
        
        this.street = getUserStreet();
        this.city = getUserCity();
        this.state = getUserState();
        this.zip = getUserZip();
    }

    // setters

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // getters

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getState() {
        return this.state;
    }

    public String getZip() {
        return this.zip;
    }

    // user input

    public String getUserStreet() {
        String input;

        do {
            System.out.print("Enter street or P.O. Box: ");
            input = scanner.nextLine().trim();
        }
        // while our input length isn't unrealistically small and the first character is a digit, rerun
        while (!(input.length() > 3) && !(Character.isDigit(input.charAt(0))));

        return input;
    }

    public String getUserCity() {
        String input;

        do {
            System.out.print("Enter city: ");
            input = scanner.nextLine().trim();
        }
        // while our input length isn't unrealistically small, rerun
        while (!(input.length() > 3));

        return input;
    }

    public String getUserState() {
        String input;

        do {
            System.out.print("Enter state (2-letter code): ");
            input = scanner.nextLine().trim().toUpperCase();
        }
        // while our input length isn't 2 and isn't alphabetic, rerun
        while (!(input.length() == 2) || !(Character.isAlphabetic(input.charAt(0))));
        return input;
    }

    public String getUserZip() {
        String input;

        do {
            System.out.print("Enter zip code (5 digits): ");
            input = scanner.nextLine().trim();
        }
        // while our input length isn't 5 and isn't digits, rerun
        while (!(input.length() == 5) || !(Character.isDigit(input.charAt(0))));

        return input;
    }

    // printing

    // print all data in a formatted way, like a letter
    public void printFormatted() {
        System.out.printf("%S\n%S, %S %S\n", this.street, this.city, this.state, this.zip);
    }

    // print all data in different lines
    public void printLines() {
        System.out.printf("%S\n%S\n%S\n%S\n", this.street, this.city, this.state, this.zip);
    }
}