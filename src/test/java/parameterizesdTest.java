import junit.StudentMarks;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class parameterizesdTest {
    StudentMarks mark= new StudentMarks();
    @DisplayName("Csv Source")
    @ParameterizedTest()
    @CsvSource({"0,0,0","-10,80,-1","10,-11,-1","20,30,50","-20,-20,-1"})
    public void  checkTest(int math, int science, int expected){
        mark.check(math,science);
        assertEquals(expected, mark.getMarks());
    }

    @ParameterizedTest()
    @ValueSource(strings = {"Revanth", "kosuru", "bhuvan"})
    public void lengthCheck(String s){
        assertTrue(s.length()>5);
    }

    @ParameterizedTest()
    @MethodSource({"getStreams"})
    public void testSomething(String word){
        assertTrue(word.startsWith("R"));
    }
    public static Stream<String> getStreams(){
        return Stream.of("Revanth","RKosuru","RBhuvan");
    }
    public static Stream<String> tempt(){
        return Stream.of("fun","bun","gun");
    }

    private enum season{RAINY,SUMMER,WINTER,AUTUMN,SPRING};
    @ParameterizedTest()
    @EnumSource(season.class)
    public void checkSeason( season s){
        System.out.println(s);
    }


}
