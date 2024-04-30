import java.util.ArrayList;

public class FoodTester {
    public static void main(String[] args) throws Exception {
        // Example foods
        Food cowMilk = new Food(1, "milk");
        Food eggs = new Food(1, "eggs");
        Food blackBeans = new Food(0.75, "black beans");

        ArrayList<Food> foodList = new ArrayList<Food>();
        foodList.add(cowMilk);
        foodList.add(eggs);
        foodList.add(blackBeans);
        ArrayList<Food> bestFoods = new ArrayList<Food>();

        double bestScore = foodList.get(0).getScore();

        // Get the best food score from our list
        for (int i = 0; i < foodList.size(); i++) {
            if (foodList.get(i).getScore() > bestScore) {
                bestScore = foodList.get(i).getScore();
            }
        }

        // Append all best foods to our list
        for (int i = 0; i < foodList.size(); i++) {
            double currentScore = foodList.get(i).getScore();
            if (currentScore == bestScore) {
                bestFoods.add(foodList.get(i));
            }
        }

        System.out.println("Best foods for muscle protein synthesis: ");
        for (int i = 0; i < bestFoods.size(); i++) {
            System.out.println(bestFoods.get(i).toString());
        }
    }
}

class Food {
    private double score;
    private String name;

    Food(double score, String name) {
        if (score > 1.00 || score < 0.00) {
            System.out.println("Error: Score cannot be greater than one or less than 0.");
            System.exit(1);
        }
        this.score = score;
        this.name = name;
    }

    // Setters

    public void setScore(double score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters

    public double getScore() {
        return this.score;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + " score -> " + this.score;
    }
}