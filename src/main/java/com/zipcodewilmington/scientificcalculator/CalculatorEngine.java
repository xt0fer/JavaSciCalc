package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
   // CalculatorEngine calculatorEngine = new CalculatorEngine();
    private static Double value;

    public static Double sum(Double firstNum, Double secondNum) {
        value = firstNum + secondNum;
        return value;
    }
    public static Double subtract(Double firstNum, Double secondNum) {
        value = firstNum - secondNum;
        return value;
    }

    public static Double divide(Double firstNum, Double secondNum) {
        value = firstNum / secondNum;
        return value;
    }

    public static Double multiply(Double firstNum, Double secondNum) {
        value = firstNum * secondNum;
        return value;
    }
}
