package products;

public class Smartphone implements Electronics {
    private String model;
    private boolean touchscreen;
    private double price;

    public Smartphone(String model, boolean touchscreen, double price) {
        this.model = model;
        this.touchscreen = touchscreen;
        this.price = price;
    }

    public boolean isTouchscreen() {
        return touchscreen;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getDescription() {
        return "Electronics: Smartphone, Model: " + model + ", Touchscreen: " + touchscreen;
    }

    @Override
    public double getPrice() {
        return price;
    }
}