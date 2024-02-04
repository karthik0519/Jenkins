import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @Before
    public void setUp() {
        // Initialize MathUtils before each test
        mathUtils = new MathUtils();
    }

    @After
    public void tearDown() {
        // Clean up after each test if needed
    }

    @Test
    public void testAdd() {
        // Test adding positive numbers
        assertEquals("Adding 10 + 5 should return 15", 15, mathUtils.add(10, 5));
        
        // Test adding negatives
        assertEquals("Adding -10 + -5 should return -15", -15, mathUtils.add(-10, -5));
        
        // Test adding positive and negative
        assertEquals("Adding -10 + 10 should return 0", 0, mathUtils.add(-10, 10));
    }

    @Test
    public void testSubtract() {
        // Test normal subtraction
        assertEquals("Subtracting 10 - 5 should return 5", 5, mathUtils.subtract(10, 5));
        
        // Test subtracting negatives
        assertEquals("Subtracting -5 - (-10) should return 5", 5, mathUtils.subtract(-5, -10));
        
        // Test result is negative
        assertEquals("Subtracting 5 - 10 should return -5", -5, mathUtils.subtract(5, 10));
    }

    @Test
    public void testMultiply() {
        // Test multiplying positive numbers
        assertEquals("Multiplying 10 * 5 should return 50", 50, mathUtils.multiply(10, 5));
        
        // Test multiplying by zero
        assertEquals("Multiplying any number by 0 should return 0", 0, mathUtils.multiply(10, 0));
        
        // Test multiplying negatives
        assertEquals("Multiplying -10 * -5 should return 50", 50, mathUtils.multiply(-10, -5));
        
        // Test multiplying positive by negative
        assertEquals("Multiplying 10 * -5 should return -50", -50, mathUtils.multiply(10, -5));
    }

    @Test
    public void testDivide() {
        // Test normal division
        assertEquals("Dividing 10 / 5 should return 2.0", 2.0, mathUtils.divide(10, 5), 0.001);
        
        // Test division by zero
        assertEquals("Dividing any number by 0 should return -1.0", -1.0, mathUtils.divide(10, 0), 0.001);
        
        // Test division resulting in decimal
        assertEquals("Dividing 10 / 4 should return 2.5", 2.5, mathUtils.divide(10, 4), 0.001);
        
        // Test negative division
        assertEquals("Dividing -10 / 5 should return -2.0", -2.0, mathUtils.divide(-10, 5), 0.001);
    }
}
