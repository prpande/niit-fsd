package niit.fsd;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    double n1 = 2;
    double n2 = 7;


    double delta = 0.000001;
    @Test
    public void testAdd(){
        assertEquals(n1 + n2, Calculator.add(n1, n2), delta);
    }

    @Test
    public void testSbtract(){
        assertEquals(n1 - n2, Calculator.subtract(n1, n2), delta);
    }

    @Test
    public void testMultiply(){
        assertEquals(n1 * n2, Calculator.multiply(n1, n2), delta);
    }

    @Test
    public void testDivide(){
        assertEquals(n1 / n2, Calculator.divide(n1, n2), delta);
    }

    @Test
    public void testSqrt(){
        assertEquals(Math.sqrt(n1), Calculator.sqrt(n1), delta);
    }

    @Test
    public void testPow(){
        assertEquals(Math.pow(n1, n2), Calculator.pow(n1, n2), delta);
    }
}
