import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals("2", calculator.divide(4, 2));
    }

    @Test
    public void testDivideByZero() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot divide by zero", calculator.divide(4, 0));
    }

    @Test
    public void testAddFloat() {
        Calculator calculator = new Calculator();
        assertEquals(3.0f, calculator.addFloat(1.0f, 2.0f));
    }

    @Test
    public void testSubtractFloat() {
        Calculator calculator = new Calculator();
        assertEquals(-1.0f, calculator.subtractFloat(1.0f, 2.0f));
    }

    @Test
    public void testMultiplyFloat() {
        Calculator calculator = new Calculator();
        assertEquals(8.814f, calculator.multiplyFloat(11.3f, 0.78f));
    }

    @Test
    public void testMultiplyFloat2() {
        Calculator calculator = new Calculator();
        float a = 11.35596359952398569825635f;
//        System.out.println(a);
        assertEquals(11.3559635f, calculator.multiplyFloat(a, 1.0f));
    }

    @Test
    public void testDivideFloat() {
        Calculator calculator = new Calculator();
        assertEquals("1.5578947", calculator.divideFloat(14.8f, 9.5f));
    }

    @Test
    public void testDivideByZeroFloat() {
        Calculator calculator = new Calculator();
        assertEquals("Cannot divide by zero", calculator.divideFloat(4.0f, 0.0f));
    }
}
