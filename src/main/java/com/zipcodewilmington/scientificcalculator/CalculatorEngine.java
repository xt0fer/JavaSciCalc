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

    public static Double squareY(Double firstNum, Double secondNum) {
 return Math.pow(firstNum, secondNum);

    }

    public static Double squareRootY(Double firstNum, Double secondNum){
        double xPre = Math.random() % 10;
        double eps = 0.001;
        double delX = 2147483647;
        double xK = 0.00;
       double A = firstNum;
       double N = secondNum;


        while (delX > eps){
            xK = ((N - 1.0) * xPre + A / Math.pow(xPre, N - 1)) / N;
            delX = Math.abs(xK - xPre);
            xPre = xK;
        }
        double value = Math.round(xK * 1000.00) / 1000.00;
        return value;
        }

    }
