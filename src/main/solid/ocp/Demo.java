package ocp;

import ocp.goodway.ColorSpecification;
import ocp.goodway.CorrectProductFilter;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product product = new Product("Product 1", Color.RED, Size.SMALL);
        Product product2 = new Product("Product 2", Color.GREEN, Size.LARGE);
        Product product3 = new Product("Product 3", Color.BLUE, Size.LARGE);
        Product product4 = new Product("Product 4", Color.BLUE, Size.LARGE);
        Product product5 = new Product("Product 5", Color.BLUE, Size.SMALL);

        List<Product> products = List.of(product, product2, product3, product4, product5);

        System.out.println(products);
        //Wrong way
        System.out.println("Old products filter by small size and blue color:");
        products.stream().filter(p -> p.getColor() == Color.BLUE && p.getSize() == Size.SMALL).forEach(p -> System.out.println(" - " + p.getName() + " is blue and small"));

        //Correct way
        CorrectProductFilter filter = new CorrectProductFilter();
        System.out.println("Green products only with new filter: ");
        filter.filter(products, new ColorSpecification(Color.GREEN)).forEach(p -> System.out.println(" - " + p.getName() + " is green"));

    }
}
