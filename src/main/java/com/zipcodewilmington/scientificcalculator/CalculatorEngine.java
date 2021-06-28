package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
   // CalculatorEngine calculatorEngine = new CalculatorEngine();
    private static Double value;

    public  Double sum(Double firstNum, Double secondNum) {
        return firstNum + secondNum;
    }

    public Double subtract(Double firstNum, Double secondNum) {
              return firstNum - secondNum;
    }

    public static Double divide(Double firstNum, Double secondNum) {
        return firstNum / secondNum;
    }

    public static Double multiply(Double firstNum, Double secondNum) {
        return firstNum * secondNum;
    }

    public static Double squareRoot(Double firstNum){
        double s;
        double value = firstNum / 2;
        do {
            s = value;
            value = (s +(firstNum / s)) / 2;
        }
        while ((s - value) != 0);
        return value;
    }

    public static Double square(Double firstNum){
        return firstNum * firstNum;
    }
}
