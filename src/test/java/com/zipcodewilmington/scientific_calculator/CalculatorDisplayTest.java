package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import org.junit.Assert;
import org.junit.Test;



public class CalculatorDisplayTest {

    @Test
    public void testSum() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        int result;
        result = calculatorEngine.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }
    @Test
    public void testSum1() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        int result;
        result = calculatorEngine.sum(1200, 500);
        // Then
        if (result != 1700) {   // if 1200 + 500 != 1700
            Assert.fail();
        }
    }
    @Test
    public void testSubtract() {
        // Given
        CalculatorEngine calculatorEngine = new CalculatorEngine();
        // When
        int result;
        result = calculatorEngine.subtract(10, 5);
        // Then
        if (result != 5) {   // 10 - 5 = 5
            Assert.fail();
        }
    }
    @Test
    public void testSubtract1() {
            // Given
            CalculatorEngine calculatorEngine = new CalculatorEngine();
            // When
            int result;
            result = calculatorEngine.subtract(20, 3);
            // Then
            if (result != 17) {   // 20 - 3 = 17
                Assert.fail();
            }
        }
    }

