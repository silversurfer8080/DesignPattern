package ocp;

import java.util.List;
import java.util.stream.Stream;

public class WorngFilter {

    public static Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }
    public static Stream<Product> filterBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }
    public static Stream<Product> filterBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.getSize() == size && p.getColor() == color);
    }

    // So far, here we have 2 criteria and have 3 methods, imagine if we have, 3 criterias we gonna have 7 methods

}
