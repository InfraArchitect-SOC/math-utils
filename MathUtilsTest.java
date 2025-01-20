import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    public void setUp() {
        mathUtils = new MathUtils();
    }

    @Test
    public void testAdd() {
        assertEquals(5, mathUtils.add(2, 3));
        assertEquals(-1, mathUtils.add(-2, 1)); // Negative numbers
        assertEquals(0, mathUtils.add(0, 0)); // Edge case: zeros
    }

    @Test
    public void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2));
        assertEquals(-5, mathUtils.subtract(0, 5)); // Negative result
    }

    @Test
    public void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3));
        assertEquals(0, mathUtils.multiply(5, 0)); // Multiply by zero
    }

    @Test
    public void testDivide() {
        assertEquals(2.5, mathUtils.divide(5, 2));
        assertEquals(-1.0, mathUtils.divide(5, 0)); // Division by zero
    }
}      
