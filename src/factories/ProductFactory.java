package factories;

import products.Electronics;
import products.Food;
import products.Clothing;

public interface ProductFactory {
    Electronics createElectronics(String type);
    Food createFood(String type);
    Clothing createClothing(String type);
}