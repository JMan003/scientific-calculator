import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private static final double DELTA = 1e-15;

    @Test
    public void testSquareRoot() {
        assertEquals(4.0, Calculator.squareRoot(16.0), DELTA);
        assertEquals(5.0, Calculator.squareRoot(25.0), DELTA);
    }

    @Test
    public void testFactorial() {
        assertEquals(120, Calculator.factorial(5));
        assertEquals(1, Calculator.factorial(0));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(0.0, Calculator.naturalLog(1.0), DELTA);
        assertEquals(Math.log(10), Calculator.naturalLog(10.0), DELTA);
    }

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.power(2.0, 3.0), DELTA);
        assertEquals(1.0, Calculator.power(5.0, 0.0), DELTA);
    }
}
