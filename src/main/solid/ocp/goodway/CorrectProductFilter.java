package ocp.goodway;

import ocp.Product;

import java.util.List;
import java.util.stream.Stream;

public class CorrectProductFilter implements Filter<Product> {
    @Override
    public Stream<Product> filter(List<Product> items, Specification<Product> spec) {
        return items.stream().filter(p -> spec.isSatisfiedBy(p));
    }

}
