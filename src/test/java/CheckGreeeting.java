import junit.Calculator;
import junit.Greeting;
import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;



public class CheckGreeeting {

    private Calculator calculate;
    // normal codes to check assertions asserequal assertfail assertthrows ...........................................................

    @BeforeEach
    public void initTest(){
         calculate= new Calculator();
    }

    @Test
    public void CheckGreeting(){
            Greeting g= new Greeting();
            assertEquals("Hello World",g.greet());
    }
    @Test
    public void checkDivision(){
        assertEquals(4.0,calculate.divide(16.0,4.0));
    }
    @Test
    public void CheckDivisionByZero(){
        ArithmeticException thrown=Assertions.assertThrows(ArithmeticException.class,()->calculate.divide(100.0,0));
        assertEquals("division by zero",thrown.getMessage());
    }

    @Disabled("No need to run this test")
    @Test
    public void CheckMultiplication(){

        assertNotEquals(36,calculate.Multiply(6,5));
        assertEquals(36,calculate.Multiply(6,6));

        assertTimeout(Duration.ofMillis(1000),()->{Thread.sleep(500);});
    }



    //Nested Testing...........
    @Nested
    class NestedTest{
        @Test
        public void testU(){
            System.out.println("Testing the nested class test by runnung the outside class");
        }
    }








}
