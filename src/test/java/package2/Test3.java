package package2;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Test3 {
    @RepeatedTest(3)
    public void set(){
        assertEquals(1,1);
    }
}
