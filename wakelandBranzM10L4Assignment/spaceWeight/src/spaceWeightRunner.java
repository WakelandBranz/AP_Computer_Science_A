/*
 * Wakeland Branz
 * Date: 1/25/2024
 * Seaforth High School
 *
 * Description:  Calculates basic data for a user and outputs it.
 * Difficulties:  I had to brainstorm how I would structure this code before writing it, but after that it was relatively easy.
 * What I Learned:  Proper class structuring for easy comprehension, modification, and displaying.
 */

import java.util.Scanner;

public class spaceWeightRunner {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // print all options
            System.out.println("Convert your weight on Earth to:");
            System.out.println("1.   Mercury");
            System.out.println("2.   Venus");
            System.out.println("3.   Uranus");
            System.out.println("4.   Mars");
            System.out.println("5.   Jupiter");
            System.out.println("6.   Saturn");
            System.out.println("7.   Neptune");
            System.out.println("8.   Pluto");
            System.out.println("9.   Quit");
            System.out.print("Select a destination by number (or 9 to quit): ");

            int userInput = scanner.nextInt();

            // ensure that user input is within defined bounds
            if (userInput < 1 || userInput > 9) {
                System.out.println("Input out of bounds.");
                continue;
            }

            // if user selected quit
            if (userInput == 9 ) {
                System.out.println("Goodbye!");
                System.exit(1);
            }
            // otherwise, output desired user conversion
            System.out.print("Enter your weight (accepts floats): ");
            double userWeight = scanner.nextDouble();
            spaceWeight space = new spaceWeight(userWeight);
            // get the arrays storing all data and index through them to reduce a lot of if statements
            System.out.printf("Your weight on %S is %f\n\n", space.getNamesArray()[userInput], space.getWeightsArray()[userInput]);
        }
    }
}

class spaceWeight {
    // constants
    private final double RATIO_MERCURY = 0.38;
    private final double RATIO_VENUS = 0.91;
    private final double RATIO_URANUS = 0.89;
    private final double RATIO_MARS = 0.38;
    private final double RATIO_JUPITER = 2.36;
    private final double RATIO_SATURN = 0.91;
    private final double RATIO_NEPTUNE = 1.12;
    private final double RATIO_PLUTO = 0.06;

    // instance variables
    private double earthWeight;
    private double mercuryWeight;
    private double venusWeight;
    private double uranusWeight;
    private double marsWeight;
    private double jupiterWeight;
    private double saturnWeight;
    private double neptuneWeight;
    private double plutoWeight;

    private double[] weightsArray;
    private String[] namesArray;

    spaceWeight(double weight) {
        this.earthWeight = weight;
        this.weightsArray = new double[9];
        this.namesArray = new String[9];

        calculateWeights();
        updateArrays();
    }

    // setters
    
    public void setEarthWeight(double weight) {
       this.earthWeight = weight;
       calculateWeights();
    }

    // getters

    public double getEarthWeight() {
        return this.earthWeight;
    }

    public double getMercuryWeight() {
        return this.mercuryWeight;
    }

    public double getVenusWeight() {
        return this.venusWeight;
    }

    public double getUranusWeight() {
        return this.uranusWeight;
    }

    public double getMarsWeight() {
        return this.marsWeight;
    }

    public double getJupiterWeight() {
        return this.jupiterWeight;
    }

    public double getSaturnWeight() {
        return this.saturnWeight;
    }

    public double getNeptuneWeight() {
        return this.neptuneWeight;
    }

    public double getPlutoWeight() {
        return this.plutoWeight;
    }

    public double[] getWeightsArray() {
        return this.weightsArray;
    }

    public String[] getNamesArray() {
        return this.namesArray;
    }

    // calculate weights on other planets
    private void calculateWeights() {
        this.mercuryWeight = this.earthWeight * RATIO_MERCURY;
        this.venusWeight = this.earthWeight * RATIO_VENUS;
        this.uranusWeight = this.earthWeight * RATIO_URANUS;
        this.marsWeight = this.earthWeight * RATIO_MARS;
        this.jupiterWeight = this.earthWeight * RATIO_JUPITER;
        this.saturnWeight = this.earthWeight * RATIO_SATURN;
        this.neptuneWeight = this.earthWeight * RATIO_NEPTUNE;
        this.plutoWeight = this.earthWeight * RATIO_PLUTO;
    }

    // update weightsArray with calculated weights
    private void updateArrays() {
        this.weightsArray[0] = this.earthWeight;
        this.weightsArray[1] = this.mercuryWeight;
        this.weightsArray[2] = this.venusWeight;
        this.weightsArray[3] = this.uranusWeight;
        this.weightsArray[4] = this.marsWeight;
        this.weightsArray[5] = this.jupiterWeight;
        this.weightsArray[6] = this.saturnWeight;
        this.weightsArray[7] = this.neptuneWeight;
        this.weightsArray[8] = this.plutoWeight;

        this.namesArray[0] = "Earth";
        this.namesArray[1] = "Mercury";
        this.namesArray[2] = "Venus";
        this.namesArray[3] = "Uranus";
        this.namesArray[4] = "Mars";
        this.namesArray[5] = "Jupiter";
        this.namesArray[6] = "Saturn";
        this.namesArray[7] = "Neptune";
        this.namesArray[8] = "Pluto";
    }
}

/*
 * Sample output:
 * Convert your weight on Earth to:
 * 1.   Mercury
 * 2.   Venus
 * 3.   Uranus
 * 4.   Mars
 * 5.   Jupiter
 * 6.   Saturn
 * 7.   Neptune
 * 8.   Pluto
 * 9.   Quit
 * Select a destination by number (or 9 to quit): 7
 * Enter your weight (accepts floats): 160
 * Your weight on NEPTUNE is 179.200000
 * 
 * Convert your weight on Earth to:
 * 1.   Mercury
 * 2.   Venus
 * 3.   Uranus
 * 4.   Mars
 * 5.   Jupiter
 * 6.   Saturn
 * 7.   Neptune
 * 8.   Pluto
 * 9.   Quit
 * Select a destination by number (or 9 to quit): 11
 * Input out of bounds.
 * Convert your weight on Earth to:
 * 1.   Mercury
 * 2.   Venus
 * 3.   Uranus
 * 4.   Mars
 * 5.   Jupiter
 * 6.   Saturn
 * 7.   Neptune
 * 8.   Pluto
 * 9.   Quit
 * Select a destination by number (or 9 to quit): 3
 * Enter your weight (accepts floats): 160
 * Your weight on URANUS is 142.400000
 * 
 * Convert your weight on Earth to:
 * 1.   Mercury
 * 2.   Venus
 * 3.   Uranus
 * 4.   Mars
 * 5.   Jupiter
 * 6.   Saturn
 * 7.   Neptune
 * 8.   Pluto
 * 9.   Quit
 * Select a destination by number (or 9 to quit): 9
 * Goodbye!
 */