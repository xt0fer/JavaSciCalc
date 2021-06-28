package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
   CalculatorEngine calculatorEngine = new CalculatorEngine();
    private static Double value;

    public static Double sum(double firstNum, double secondNum) {
        value = firstNum + secondNum;
        return value;
    }
    public Double subtract(double firstNum, double secondNum) {
        value = firstNum - secondNum;
        return value;
    }

    public Double divide(double firstNum, double secondNum) {
        value = firstNum / secondNum;
        return value;
    }

    public Double multiply(double firstNum, double secondNum) {
        value = firstNum * secondNum;
        return value;
    }

    public Double sqrt(double firstNum){
        value = Math.sqrt(firstNum);
        return value;

    }

}
