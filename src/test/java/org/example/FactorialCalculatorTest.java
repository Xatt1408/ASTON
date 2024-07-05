package org.example;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class  FactorialCalculatorTest {

    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfOne() {
        assertEquals(calculator.factorial(1), 1, "Факториал 1 = 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(calculator.factorial(5), 120, "Факториал 5 = 120");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        assertEquals(calculator.factorial(10), 3628800, "Факториал 10 = 3628800");
    }

    @Test(expectedExceptions = IllegalArgumentException.class, expectedExceptionsMessageRegExp = "Число должно быть неотрицательным.")
    public void testFactorialOfNegativeNumber() {
        calculator.factorial(-1);
    }
}
