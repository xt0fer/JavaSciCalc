package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
   // CalculatorEngine calculatorEngine = new CalculatorEngine();
    private static Double value;

    public static Double sum(Double firstNum, Double secondNum) {
        value = firstNum + secondNum;
        return value;
    }
    public Double subtract(Double firstNum, Double secondNum) {
        value = firstNum - secondNum;
        return value;
    }

    public Double divide(Double firstNum, Double secondNum) {
        value = firstNum / secondNum;
        return value;
    }

    public Double multiply(Double firstNum, Double secondNum) {
        value = firstNum * secondNum;
        return value;
    }

    public Double squareRoot(Double firstNum){
        double s;
        double value = firstNum / 2;
        do {
            s = value;
            value = (s +(firstNum / s)) / 2;
        }
        while ((s - value) != 0);
        return value;
    }

}
