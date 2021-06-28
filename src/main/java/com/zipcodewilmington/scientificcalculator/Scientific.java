
package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    private static double value;

    public static Double tan (double value) {
    value = 0;
    value = Math.tan(value;
    return value;
    }

    public Double tanR(double value) {
        value = 0;
        value = Math.atan(value);
        return value;
    }


    public Double cos(double value) {
        value = 0;
        value = Math.cos(value);
        return value;
    }

    public double sin(double value) {
        value = 0;
        value = Math.sin(value);
    }

    public double cb(double value) {
        value = 0;
        value= Math.pow(value, 3);
    }

    public double sqrt(double value) {
        value = 0;
        value = Math.sqrt(value);
        return value;
    }

    public double squ(double value) {
        value = 0;
        value = Math.pow(value, 2);
        return value
    }


    public double sinR(double value) {
        value = 0;
        value = Math.asin(value);
        return value;
    }
    public double cosR(double value){
        value = 0;
        value = Math.acos(value);
        return value;
    }
}
    /*public double result;
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
                    value = fact * i;
                }
                break;
            default:
                System.out.println("ERR");
        }

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
                System.out.println("ERR");
        }
        public static boolean isRadian ( double input){
            double to180 = (input + ((180 / Math.PI) - input));
            // 57 is 180 degrees rounded to whole number
            if (Math.round(to180) == 57) {
                return true;
            } else {
            }
            return false;
        }
        */

