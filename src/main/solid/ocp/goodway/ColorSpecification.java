package ocp.goodway;

import ocp.Color;
import ocp.Product;

public class ColorSpecification implements Specification<Product> {
    private Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getColor() == this.color;
    }
}
