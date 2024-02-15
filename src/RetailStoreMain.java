import products.*;
import factories.*;
import java.util.ArrayList;
import java.util.List;

public class RetailStoreMain {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added to the cart: " + product.getDescription());
    }

    public void removeProduct(Product product) {
        products.remove(product);
        System.out.println("Product removed from the cart: " + product.getDescription());
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotal() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        RetailProductFactory factory = new RetailProductFactory();
        RetailStoreMain cart = new RetailStoreMain();

        Electronics smartphone = factory.createElectronics("Smartphone");
        Food pizza = factory.createFood("Pizza");
        Clothing jeans = factory.createClothing("Jeans");
        Electronics laptop = factory.createElectronics("Laptop");

        cart.addProduct(smartphone);
        cart.addProduct(pizza);
        cart.addProduct(jeans);
        cart.addProduct(laptop);

        // Display the description of all items in the shopping cart
        System.out.println("\n");
        System.out.println("Your shopping cart: ");
        for (Product product : cart.getProducts()) {
            System.out.println(product.getDescription());
        }
        System.out.println("Total price: " + cart.calculateTotal());
    }
}