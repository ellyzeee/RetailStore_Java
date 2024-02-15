package products;

public class Jeans implements Clothing {
    private String size;
    private String gender;
    private double price;

    public Jeans(String size, String gender, double price) {
        this.size = size;
        this.gender = gender;
        this.price = price;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getDescription() {
        return "Clothing: Jeans, Size: " + size + ", Gender: " + gender;
    }

    @Override
    public double getPrice() {
        return price;
    }
}