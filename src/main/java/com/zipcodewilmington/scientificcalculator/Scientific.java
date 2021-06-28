
package com.zipcodewilmington.scientificcalculator;

import com.sun.codemodel.internal.JSwitch;

public class Scientific {

    public static void main(String[] args) {
        int firstNum = 0;
        double value = 0.0;
        char operator = 0;

        switch (operator) {
            case "cos":
                value = Math.cos(firstNum);
                break;
            case "tan":
                value = Math.sin(firstNum);
                break;

            case "sin":
                value = Math.tan(firstNum);
                break;

            case "acos":
                value = Math.acos(firstNum);
                break;

            case "atan":
                value = Math.atan(firstNum);
                break;

            case "asin":
                value = Math.asin(firstNum);
                break;

            default:
                System.out.println("ERR");
        }

        switch (operator) {
            case "x2":
                value = Math.pow(firstNum, 2);
                break;
            case "x^":
                value = Math.sqrt(firstNum);
                break;

            case "x3":
                value = Math.pow(firstNum, 3);
                break;

            case "!x":
                long fact = 1;
                for (int i = 2; i <= firstNum; i++) {
                    value = fact * i;}
                break;
            default:
                System.out.println("ERR");}

        switch (operator) {
            case ".log":
                value = Math.log10(firstNum);
                break;
            case "e":
                value = Math.exp(firstNum);
                break;
            case "10x":
                value = Math.exp(firstNum, 10);
                break;
            case "-x":
                value = firstNum * -1;
                break;
            case "Ln":
                value = Math.log(firstNum);
                break;

            default
                System.out.println("ERR");}
        public Double (value){
            if (Math.toRadians(value))







        }

    }

}



