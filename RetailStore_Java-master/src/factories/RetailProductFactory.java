package factories;

import products.*;

public class RetailProductFactory implements ProductFactory {

    @Override
    public Electronics createElectronics(String type) {
        if ("Smartphone".equals(type)) {
            return new Smartphone("X-Model", true, 299.99); // Price is hardcoded for the demonstration
        } else if ("Laptop".equals(type)) {
            return new Laptop("ProBook", 15.0, 799.99); // Price is hardcoded for the demonstration
        } else {
            throw new IllegalArgumentException("Unknown electronics type: " + type);
        }
    }

    @Override
    public Food createFood(String type) {
        if ("Pizza".equals(type)) {
            return new Pizza("Margherita", 250, "Thin Crust", 12.99); // Price is hardcoded for the demonstration
        } else if ("Salad".equals(type)) {
            return new Salad("Caesar", 150, 7.99); // Price is hardcoded for the demonstration
        } else {
            throw new IllegalArgumentException("Unknown food type: " + type);
        }
    }

    @Override
    public Clothing createClothing(String type) {
        if ("Jeans".equals(type)) {
            return new Jeans("M", "Unisex", 39.99); // Price is hardcoded for the demonstration
        } else if ("T-Shirt".equals(type)) {
            return new TShirt("L", "Men", 19.99); // Price is hardcoded for the demonstration
        } else {
            throw new IllegalArgumentException("Unknown clothing type: " + type);
        }
    }
}