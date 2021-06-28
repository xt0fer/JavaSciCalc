package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import org.junit.Assert;
import org.junit.Test;



public class CalculatorEngineTest {

    @Test
    public void testSum1() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        Double result;
        result = CalculatorEngine.sum(2.00, 2.00);
        // Then
        if (result != 4.00) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }
    @Test
    public void testSum2() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        Double result;
        result = CalculatorEngine.sum(1200.00, 500.00);
        // Then
        if (result != 1700.00) {   // if 1200 + 500 != 1700
            Assert.fail();
        }
    }
    @Test
    public void testSubtract1() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        Double result;
        result = calculatorEngine.subtract(10.00, 5.00);
        // Then
        if (result != 5.00) {   // 10 - 5 = 5
            Assert.fail();
        }
    }
    @Test
    public void testSubtract2() {
            // Given
            CalculatorEngine calculatorEngine = new CalculatorEngine();
            // When
            Double result;
            result = calculatorEngine.subtract(20.00, 3.00);
            // Then
            if (result != 17.00) {   // 20 - 3 = 17
                Assert.fail();
            }
        }

    @Test
    public void testDivide1() {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        Double result;
        result = calculatorEngine.divide(6.00, 3.00);
        if (result != 2.00); {
            Assert.fail();
            }
        }

    @Test
    public void testDivide2() {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        Double result;
        result = calculatorEngine.divide(33.33, 11.11);
        if (result != 3.00); {
            Assert.fail();
        }
    }

    @Test
    public void testMultiply1() {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        Double result;
        result = calculatorEngine.multiply(5.00, 20.00);
        if (result != 100.00); {
            Assert.fail();
        }
    }

    @Test
    public void testMultiply2() {
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        Double result;
        result = calculatorEngine.multiply(7.00, 20.00);
        if (result != 140.00); {
            Assert.fail();
        }
    }
    @Test
    public void testSquare1(){
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        Double result;
        result = calculatorEngine.square(9.00);
        if (result != 3.00);{
            Assert.fail();
        }

    }
}



/*    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
} */


