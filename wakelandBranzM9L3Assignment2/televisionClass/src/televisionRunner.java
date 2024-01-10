/*
 * Wakeland Branz
 * Date: 12/15/2023
 * Seaforth High School
 *
 * Description:  Creates a television instance with actions that allow you to control its instance variables
 * Difficulties:  Determining my logic to make this program modular was slightly difficult, but some basic organization got me where I needed relatively fast.
 * What I Learned:  How to organize a file with private classes and a runner class as well as create a modular and scaleable class.
 */

import java.util.Scanner;

class Television {
    // instance variables

    boolean powerStage; // tv on or off
    int channel; // channels range from 1 to 5
    int volume; // volume ranges from 1 to 10

    // meet assignment requirements by setting default constructor with the following values
    public Television() {
        this.powerStage = false;
        this.channel = 1;
        this.volume = 5;
    }

    public void powerToggle() {
        if (this.powerStage == false) { 
            this.powerStage = true;
            return;
        }
        this.powerStage = false; 
    }

    // setters

    // if true, successfully set channel, otherwise the operation was unsuccessful because the channel was out of bounds or the TV was off
    public boolean setChannel(int channel) {
        if (!this.powerStage) { return false; } // if tv is off

        if (channel >=1 && channel <= 5) {
            this.channel = channel;
            return true;
        }
        return false;
    }

    // if true, successfully set volume, otherwise the operation was unsuccessful because the volume was out of bounds or the TV was off
    public boolean setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
            return true;
        }
        return false;
    }

    // true = up, false = down... if false is returned then the tv is off
    public boolean incrementVolume(boolean direction) {
        if (!this.powerStage) { return false; } // if tv is off

        if (direction) {
            return setVolume(this.volume + 1);
        }
        return setVolume(this.volume - 1);
    }

    // getters

    public boolean getPowerState() {
        return this.powerStage;
    }

    public int getChannel() {
        return this.channel;
    }

    public int getVolume() {
        return this.volume;
    }
}

public class televisionRunner {
    public static void main(String[] args) throws Exception {
        boolean userTerminateLoop = false;
        Television tv = new Television();
        Scanner scanner = new Scanner(System.in);
        String userInput = new String();

        System.out.println("INFO: TV IS BY DEFAULT POWERED OFF!");

        while (!userTerminateLoop) {
            System.out.println("Please input your desired action");
            System.out.println("1: Power on/off");
            System.out.println("2: Change channel");
            System.out.println("3: Increment volume");
            System.out.println("4: Quit program");

            userInput = scanner.nextLine().trim();

            if (userInput.equals("1")) {
                tv.powerToggle();
                
                if (tv.powerStage == true) {
                    System.out.println("TV is now on!  Actions can be performed.");
                }
                else {
                    System.out.println("TV is now off!  Actions can no longer be performed.");
                }
            }

            else if (userInput.equals("2")) {
                System.out.println("What channel would you like to change to? (Range 1-5)");
                userInput = scanner.nextLine().trim().toLowerCase();

                // parse user input into required type
                // if return value is true then the operation has successfully completed, otherwise there was an error.
                if (tv.setChannel(Integer.parseInt(userInput))) {
                    System.out.println("Successfully set channel to " + tv.getChannel() + ".");
                }
                else {
                    System.out.println("Channel unsuccessfully changed.  Input could be out of bounds or TV is off.");
                }
            }

            else if (userInput.equals("3")) {
                System.out.println("Would you like to increment volume up or down? (up | down)");
                userInput = scanner.nextLine().trim().toLowerCase();
                boolean direction = upOrDown(userInput);
            
                // parse user input into required type
                // if return value is true then the operation has successfully completed, otherwise there was an error.
                if (tv.incrementVolume(direction)) {
                    System.out.println("Successfully incremented volume to " + tv.getVolume() + ".");
                }
                else {
                    System.out.println("Volume unsuccessfully incremented.  Input could be out of bounds or TV is off.");
                }
            }

            else if (userInput.equals("4")) {
                System.out.println("Goodbye!");
                userTerminateLoop = true;
            }

            else {
                System.out.println("Invalid input.");
            }
        }
        scanner.close();
    }

    // concise way to determine whether or not the user wants to increment the volume up or down
    static public boolean upOrDown(String input) {
        if (input.equals("up")) {
            return true;
        }
        else if (input.equals("down")) {
            return false;
        }
        System.out.println("Invalid input, exiting program.");
        System.exit(0);
        return false;
    }
}

/*
 * Sample output:
 * INFO: TV IS BY DEFAULT POWERED OFF!
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 2
 * What channel would you like to change to? (Range 1-5)
 * 1
 * Channel unsuccessfully changed.  Input could be out of bounds or TV is off.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 1
 * TV is now on!  Actions can be performed.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 2
 * What channel would you like to change to? (Range 1-5)
 * 3
 * Successfully set channel to 3.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 2
 * What channel would you like to change to? (Range 1-5)
 * 1
 * Successfully set channel to 1.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 3
 * Would you like to increment volume up or down? (up | down)
 * up
 * Successfully incremented volume to 6.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 3
 * Would you like to increment volume up or down? (up | down)
 * down
 * Successfully incremented volume to 5.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 3
 * Would you like to increment volume up or down? (up | down)
 * down
 * Successfully incremented volume to 4.
 * Please input your desired action
 * 1: Power on/off
 * 2: Change channel
 * 3: Increment volume
 * 4: Quit program
 * 4
 * Goodbye!
 */
