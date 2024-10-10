package practice;

import junit.Restriction;
import junit.StudentMarks;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class prac {
    private StudentMarks mark;
    @BeforeEach
    public void init(){ mark= new StudentMarks();}
    @Test
    public void testAssert(){
        Restriction r = new Restriction();
//        assertEquals("valid", r.validate(18,"revanth"),"valid age");
//        assertNotEquals("invalid",r.validate(19,"kousik"));
        assertThrows(IllegalArgumentException.class,()->{r.validate(19,null);});
        int[] arr= {1,2,3,4};
        int[] arr2={1,2,3,4};
        assertArrayEquals(arr,arr2);
    }
    @ParameterizedTest()
    @CsvSource({"10,10,20","-10,12,-1"})
    public void testCsv(int math, int science, int expected){
//        StudentMarks mark= new StudentMarks();
        mark.check(science,math);
         assertEquals(expected,mark.getMarks());
    }

    @ParameterizedTest()
    @ValueSource(strings={"Revanth","kosuru","Bhuvan"})
    public void testVAlueSource(String s){
        assertFalse(s.startsWith("E"));
    }

    @ParameterizedTest
    @MethodSource("checkCheck")
    public void checkMSource(String s){
        assertTrue(s.length()>1);
    }
    public Stream<String> checkCheck(){
        return Stream.of("Revanth","kosuru","Bhuvan");
    }


}
