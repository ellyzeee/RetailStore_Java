import products.Product;
import java.util.List;

public interface ShoppingCart {
    void addProduct(Product product);
    void removeProduct(Product product);
    List<Product> getProducts();
}