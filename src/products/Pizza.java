package products;

public class Pizza implements Food {
    private String name;
    private int calories;
    private String crustType;
    private double price;

    public Pizza(String name, int calories, String crustType, double price) {
        this.name = name;
        this.calories = calories;
        this.crustType = crustType;
        this.price = price;
    }

    public String getCrustType() {
        return crustType;
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
        return "Food: " + name + ", Calories: " + calories + ", Crust Type: " + crustType;
    }

    @Override
    public double getPrice() {
        return price;
    }
}