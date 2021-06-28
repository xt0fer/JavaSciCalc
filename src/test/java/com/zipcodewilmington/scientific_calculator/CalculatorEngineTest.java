package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.CalculatorEngine;
import org.junit.Assert;
import org.junit.Test;

import static com.sun.tools.doclint.Entity.divide;
import static com.zipcodewilmington.scientificcalculator.CalculatorEngine.*;


public class CalculatorEngineTest {

    @Test
    public void testSum1() {
        // Given
        CalculatorEngine CalculatorEngine = new CalculatorEngine();
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
        CalculatorEngine CalculatorEngine = new CalculatorEngine();
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
        Double expected = 100.00;
        Double firstNum = 1000.00;
        Double secondNum = 10.00;
        Double actual = CalculatorEngine.divide(firstNum, secondNum);
        Assert.assertEquals(expected, actual);
        }

    @Test
    public void testDivide2() {
        Double expected = 4.00;
        Double firstNum = 20.00;
        Double secondNum = 5.00;
        Double actual = CalculatorEngine.divide(firstNum, secondNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiply1() {
        Double expected = 100.00;
        Double firstNum = 20.00;
        Double secondNum = 5.00;
        Double actual = multiply(firstNum, secondNum);
        Assert.assertEquals(expected, actual);
        }


    @Test
    public void testMultiply2() {
     Double expected = 4.00;
     Double firstNum = 2.00;
     Double secondNum = 2.0;
     Double actual = multiply(firstNum, secondNum);
     Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquareRoot(){
        Double expected = 2.00;
        Double firstNum = 4.00;
        Double actual = squareRoot(firstNum);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquare(){
     Double expected = 16.00;
     Double firstNum = 4.00;
     Double actual = square(firstNum);
     Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSquareY(){
        Double expected = 7776.00;
        Double firstNum = 6.00;
        Double secondNumb = 5.00;
        Double actual = CalculatorEngine.squareY(firstNum, secondNumb);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSquareRootY(){
        Double expected = 1.431;
        Double firstNum = 6.00;
        Double secondNumb = 5.00;
        Double actual = CalculatorEngine.squareRootY(firstNum, secondNumb);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testInverse(){
        Double expected = 0.125;
        Double firstNum = 8.00;
        Double actual = CalculatorEngine.inverse(firstNum);
        Assert.assertEquals(expected, actual);
    }
    @Test
    public  void testSignSwitch(){
        Double expected = (-6.00);
        Double firstNum = (6.00);
        Double actual = CalculatorEngine.signSwitch(firstNum);
    }
}



/*    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Calculator calculator = new Calculator();
        calculator.divide(6, 0);
    }
} */


