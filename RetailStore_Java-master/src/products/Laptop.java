package products;

public class Laptop implements Electronics {
    private String model;
    private double screenSize;
    private double price;

    public Laptop(String model, double screenSize, double price) {
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getDescription() {
        return "Electronics: Laptop, Model: " + model + ", Screen Size: " + screenSize + '"';
    }

    @Override
    public double getPrice() {
        return price;
    }
}