package ocp.goodway;

public class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;
    @Override
    public boolean isSatisfiedBy(T item) {
        return first.isSatisfiedBy(item) && second.isSatisfiedBy(item);
    }

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }
}
