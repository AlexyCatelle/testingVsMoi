package exo1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    @DisplayName("addition")
    void testAdd_OnePlusTwo_ShouldReturntree() {
        Calculator calculator = new Calculator();

        double result = calculator.add(1, 2);
        assertEquals(4, result);
    }
};