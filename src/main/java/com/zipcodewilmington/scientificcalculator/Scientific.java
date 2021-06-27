package com.zipcodewilmington.scientificcalculator;

import com.sun.codemodel.internal.JSwitch;

public class Scientific {
    public static void main java.lang.String {
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

            default:
                System.out.println("ERR");
        }
        switch (operator){
            case "x2":
                answer= Math.pow(firstNum, 2);
                break;
            case "x^":
                answer = Math.sqrt(firstNum);
                break;

            case "x3":
                answer = Math.pow(firstNum, 3);
                break;

            case "!x":
                long fact = 1;
                for (int i = 2; i <= firstNum; i++) {
                    answer = fact * i;}
                System.out.println("true");
                break;

            case "":
                answer = Math.fact(firstNum);
                break;

            default:
                System.out.println("ERR");
        }
    }
    public static void long factorial(int n) {
        long answer = 1;
        for (int i = 2; i <= n; i++) {
            answer = answer * i;
        }
        return answer;
    }



}
