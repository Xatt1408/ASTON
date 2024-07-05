package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, calculator.factorial(1), "\n" + "Факториал 1 = 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5), "\n" +"Факториал 5 = 1");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(3628800, calculator.factorial(10), "Факториал 10 = 3628800");
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Число должно быть неотрицательным.", exception.getMessage());
    }
}
