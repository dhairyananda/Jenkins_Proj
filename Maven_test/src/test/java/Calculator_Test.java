//import org.junit.jupiter.api.Test;

import org.junit.Test;
import static org.junit.Assert.*;
//import static junit.framework.TestCase.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertEquals;

public class Calculator_Test {
        @Test
        public void testSum() {
            System.out.println("sum");
            Integer x = 15;
            Integer y = 15;
            Integer expResult = 30;
            Integer result = Calculator.sum(x, y);
            assertEquals(expResult, result);
            assertEquals(null, Calculator.sum(15, null));
            assertEquals(null, Calculator.sum(null, 15));
            assertEquals(null, Calculator.sum(null, null));
        }
    }