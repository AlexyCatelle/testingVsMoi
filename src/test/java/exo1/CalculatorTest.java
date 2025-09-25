package exo1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
class CalculatorTest {

    @Test
    @DisplayName("Error add")
    void testAddError(){
        Calculator calculator = new Calculator();

        double result = calculator.add(1,2);
        assertNotEquals(3,result);
    }


    @Test
    @DisplayName("addition")
    void testAdd_OnePlusTwo_ShouldReturntree() {
        Calculator calculator = new Calculator();

        double result = calculator.add(1, 2);
        assertEquals(3, result);
    }
}