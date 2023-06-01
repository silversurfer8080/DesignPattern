package ocp.goodway;

public interface Specification<T> {
    boolean isSatisfiedBy(T item);
}
