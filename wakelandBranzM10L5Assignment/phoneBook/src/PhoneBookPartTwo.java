/*
 * Wakeland Branz
 * Date: 1/29/2024
 * Seaforth High School
 *
 * Description:  Uses an algorithm to parse data from a phonebook while giving the user the ability to modify the phonebook
 * Difficulties:  I had to think through the solution to this for quite some time because they were quite abstract. Eventually I settled on taking the easy route and just doing what I knew, which worked.
 * What I Learned:  Slightly more advanced array usage as well as how to use switch-case statements in Java (I come from Rust so it was not too hard to relearn)
 */

import java.util.Scanner;

class PhoneEntry {
    private String firstName;
    private String lastName;
    private String phone; // their phone number

    PhoneEntry(String firstName, String lastName, String p) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = p;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getPhone() {
        return this.phone;
    }
}

public class PhoneBookPartTwo {
    PhoneEntry[] phoneBook;

    PhoneBookPartTwo() // constructor
    {
        phoneBook = new PhoneEntry[100];

        // refactored for firstName, lastName, phone args
        phoneBook[0] = new PhoneEntry("James", "Barclay", "(418) 665-1223");
        phoneBook[1] = new PhoneEntry("Grace", "Dunbar", "(860) 399-3044");
        phoneBook[2] = new PhoneEntry("Paul", "Kratides", "(815) 439-9271");
        phoneBook[3] = new PhoneEntry("Violet", "Smith", "(312) 223-1937");
        phoneBook[4] = new PhoneEntry("John", "Wood", "(913) 883-2874");

    }

    // Use linear search to find the targetName.
    // Return a reference to the matching PhoneEntry or null
    // if none is found.
    //
    PhoneEntry[] search(String targetFirstName, String targetLastName) {
        // normalize search terms
        targetFirstName = targetFirstName.toLowerCase();
        targetLastName = targetLastName.toLowerCase();

        PhoneEntry[] result = new PhoneEntry[phoneBook.length];
        int iteration = 0;

        for (int i = 0; i < phoneBook.length; i++) {
            // check if entry is null before comparing values
            if (phoneBook[i] == null) {
                continue;
            }
            if (targetFirstName.equals(phoneBook[i].getFirstName().toLowerCase()) && targetLastName.equals(phoneBook[i].getLastName().toLowerCase())) {
                PhoneEntry[] resultArray = new PhoneEntry[1];
                resultArray[0] = phoneBook[i];
                return resultArray;
            }
            else if (targetFirstName.equals(phoneBook[i].getFirstName().toLowerCase())) {
                result[iteration] = phoneBook[i];
                iteration++;
            }
            else if (targetLastName.equals(phoneBook[i].getLastName().toLowerCase())) {
                result[iteration] = phoneBook[i];
                iteration++;
            }
        }

        // normalize results into 

        // check if we receieved result
        if (iteration > 0) {
            return result;
        }
        return null;
    }

    // add a new name and phone number to the array
    void addEntry(String firstName, String lastName, String phone) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] == null) { // find unused memory section
                phoneBook[i] = new PhoneEntry(firstName, lastName, phone);
                System.out.println("Entry added successfully.");
                return;
            }
        }
        System.out.println("Error: No space available for a new entry.");
    }

    // delete a name and phone number from the array
    void deleteEntry(String targetFirstName, String targetLastName) {
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null) {
                String currentFirstName = phoneBook[i].getFirstName().toLowerCase();
                String currentLastName = phoneBook[i].getLastName().toLowerCase();

                if (targetFirstName.equals(currentFirstName) && targetLastName.equals(currentLastName)) {
                    phoneBook[i] = phoneBook[phoneBook.length - 1];
                    phoneBook[phoneBook.length - 1] = null;
                    System.out.println("Successfully deleted entry.");
                    return;
                }
            }
        }
        System.out.println("Entry not found.");
    }

    // check each index of array, verifying that it exists and then pushing it to the front of the array
    public void sort() {
        int iterator = 0;
        for (int i = 0; i < phoneBook.length; i++) {
            if (phoneBook[i] != null) {
                phoneBook[iterator] = phoneBook[i];
                iterator++;
            }
        }

        // set the remaining elements to null
        for (int i = iterator; i < phoneBook.length; i++) {
            phoneBook[i] = null;
        }
    }
}

// Test the PhoneBook object by searching for one person.
//
class PhoneBookTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneBookPartTwo pb = new PhoneBookPartTwo();

        System.out.println("-- Phone Book Application --");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Search for a name");
            System.out.println("2. Add a new name and phone number");
            System.out.println("3. Delete a name and phone number");
            System.out.println("4. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // reset scanner

            switch (choice) {
                case 1: 
                    System.out.println("Last Name: ");
                    String targetLastName = scanner.nextLine().toLowerCase();
    
    
                    System.out.println("First Name: ");
                    String targetFirstName = scanner.nextLine().toLowerCase();

                    // search for firstname, lastname
                    PhoneEntry[] entry = pb.search(targetFirstName, targetLastName);

                    // verify entry validity
                    if (entry == null) {
                        System.out.println("Name not found");
                        continue;
                    }

                    if (entry != null) {
                        for (int i = 0; i < entry.length; i++) {
                            // if found, print out the entry
                            if (entry[i] != null) {
                                System.out.println(entry[i].getFirstName() + " " + entry[i].getLastName() + ": " + entry[i].getPhone());
                            }
                        }
                    }
                    break;
                case 2:
                    System.out.println("Enter First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.println("Enter Last Name: ");
                    String newLastName = scanner.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String newPhone = scanner.nextLine();
                    pb.addEntry(newFirstName, newLastName, newPhone);
                    break;
                case 3:
                    System.out.println("Enter Last Name: ");
                    String deleteLastName = scanner.nextLine().toLowerCase();
                    System.out.println("Enter First Name: ");
                    String deleteFirstName = scanner.nextLine().toLowerCase();
                    pb.deleteEntry(deleteFirstName, deleteLastName);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input, please try again.");
            }

            
            
            

            
        }
    }
}

/*
 * Sample output:
 * -- Phone Book Application --
 *
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 1
 * Last Name: 
 * Barclay
 * First Name: 
 * J
 * James Barclay: (418) 665-1223
 * 
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 2
 * Enter First Name: 
 * New
 * Enter Last Name: 
 * Entry
 * Enter Phone Number: 
 * (123) 456-789 
 * Entry added successfully.
 * 
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 3
 * Enter Last Name: 
 * Entry
 * Enter First Name: 
 * New
 * Successfully deleted entry.
 * 
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 1
 * Last Name: 
 * Entry
 * First Name: 
 * New
 * Name not found
 * 
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 1
 * Last Name: 
 * wood
 * First Name: 
 * j
 * John Wood: (913) 883-2874
 * 
 * Choose an option:
 * 1. Search for a name
 * 2. Add a new name and phone number
 * 3. Delete a name and phone number
 * 4. Quit
 * 4
 * Goodbye!
 */