//package JunitTEST;
//
//import Junit.Calculator;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Disabled;
//import org.junit.jupiter.api.Tag;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.CsvSource;
//import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//public class TestA {
//    Calculator calculator = new Calculator();
//
//    @Test
//    @Disabled("Disabling add functionality temporarily")
//    @Tag("add")
//    public void checkAdd() {
//        Assertions.assertEquals(8, calculator.add(4, 4));
//        System.out.println("Add method disabled");
//    }
//
//    @Test
//    @Tag("multiply")
//    public void checkMultiply() {
//        Assertions.assertEquals(8, calculator.multiply(4, 2));
//        System.out.println("Multiply test");
//    }
//
//    @AfterAll
//    public static void closePage() {
//        System.out.println("Cleaning up after tests");
//    }
//
//    @ParameterizedTest(name = "{0} + {1} = {2}")
//    @CsvSource({"0, 0, 0", "1, 2, 3", "49, 51, 100", "1, 100, 101"})
//    public void add(int number1, int number2, int expectedResult) {
//        Assertions.assertEquals(expectedResult, calculator.add(number1, number2));
//    }
//
//    @ParameterizedTest(name = "Testing for number={0}")
//    @ValueSource(ints = {1, 2, 3, 10})
//    public void addUsingValueSource(int number) {
//        Assertions.assertEquals(number + number, calculator.add(number, number));
//    }
//
//    @ParameterizedTest(name = "{0} * {1} = {2}")
//    @MethodSource("multiplicationProvider")
//    public void multiplyUsingMethodSource(int a, int b, int expected) {
//        Assertions.assertEquals(expected, calculator.multiply(a, b));
//    }
//
//    static Stream<Object[]> multiplicationProvider() {
//        return Stream.of(new Object[]{1, 1, 1}, new Object[]{2, 4, 8}, new Object[]{0, 5, 0}, new Object[]{5, 5, 25}, new Object[]{-3, 3, -9});
//    }
//
//    void MethodthatThrows(int number) {
//        if (number < 0) {
//            throw new IllegalArgumentException("Number should be positive");
//        }
//    }
//
//    @Test
//    public void exceptionMethod() {
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            MethodthatThrows(-1);
//        });
//        System.out.println("Exception caught for negative numbers");
//    }
//
//    @Test
//    public void exceptionMethod2() {
//        assertThrows(IllegalArgumentException.class, () -> {
//            MethodthatThrows(1);
//        });
//        System.out.println("No exception for positive numbers");
//    }

//public class SampleGenrics<E, V> {
//    E name;
//    V age;
//
//    SampleGenrics(E name, V age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public E getName() {
//        return name;
//    }
//
//    public V getAge() {
//        return age;
//    }
//}
// /}
