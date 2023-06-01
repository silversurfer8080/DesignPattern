package ocp.goodway;

import ocp.Product;
import ocp.Size;

public class SizeSpecification implements Specification<Product> {
    private Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfiedBy(Product item) {
        return item.getSize() == this.size;
    }
}
