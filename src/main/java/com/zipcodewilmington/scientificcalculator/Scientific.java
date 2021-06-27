package com.zipcodewilmington.scientificcalculator;

import com.sun.codemodel.internal.JSwitch;

public class Scientific {
    public static void main(String[]args) {
        int firstNum = 0;
        double answer = 0.0;
        char operator = 0;

        switch (operator) {
            case "cos":
                answer = Math.cos(firstNum);
                break;
            case "tan":
                answer = Math.sin(firstNum);
                break;

            case "sin":
                answer = Math.tan(firstNum);
                break;

            case "acos":
                answer = Math.acos(firstNum);
                break;

            case "atan":
                answer = Math.atan(firstNum);
                break;

            case "asin":
                answer = Math.asin(firstNum);
                break;

        }
    }
    public static void long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }



}
