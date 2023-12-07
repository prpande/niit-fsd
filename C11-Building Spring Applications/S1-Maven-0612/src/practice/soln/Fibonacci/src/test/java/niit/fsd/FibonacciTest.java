package niit.fsd;

import org.junit.Test;
import static org.junit.Assert.*;

public class FibonacciTest{
    @Test
    public void testFibonacci0(){
        assertEquals(0, Fibonacci.get(0));
    }

    @Test
    public void testFibonacci5(){
        assertEquals(5, Fibonacci.get(5));
    }

    @Test
    public void testFibonacci16(){
        assertEquals(987, Fibonacci.get(16));
    }
}

