package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
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

    public Double squareRoot(double firstNum){
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
