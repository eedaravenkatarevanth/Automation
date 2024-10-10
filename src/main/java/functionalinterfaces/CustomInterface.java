package functionalinterfaces;
@FunctionalInterface
public interface CustomInterface<I extends Number, I1 extends Number, I2 extends Number> {
    I add(I a,I b);
}
