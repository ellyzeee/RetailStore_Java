package products;

public class Salad implements Food {
    private String name;
    private int calories;
    private double price;

    public Salad(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getDescription() {
        return "Food: " + name + ", Calories: " + calories;
    }

    @Override
    public double getPrice() {
        return price;
    }
}