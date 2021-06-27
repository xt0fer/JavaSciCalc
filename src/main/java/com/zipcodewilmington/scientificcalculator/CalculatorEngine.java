package com.zipcodewilmington.scientificcalculator;

public class CalculatorEngine {
    CalculatorEngine calculatorEngine = new CalculatorEngine();

    public void run(){
        Console.println("Welcome to the calculator!\nWhat would you like to do?");
        Console.println("1. Basic Functions \n2. Scientific Functions \n3. Something Fun!");
        menuOption1();
    }


    public void menuOption1() {
        String firstChoice;
        do {
            firstChoice = Console.getStringInput("1, 2, 3");
            switch (firstChoice.toLowerCase()) {
                case "1":
                    System.out.println("Here are some Basic Functions. \n+ \nAddition , - \n-Subtraction , / \n-Division , * \n-Multiplication");
                    break;
                case "2":
                    System.out.println("Here are some Scientific Functions. \nSine() \nCosine()");
                    break;
                case "3":
                    System.out.println("Something Fun!");
                    break;
                default:
                    Console.println("[ %s ] is not a valid input!", firstChoice);
                    break;
            }
        } while (true);
    }

    private static int result;

    public static int sum(int firstNum, int secondNum) {
        result = firstNum + secondNum;
        return result;
    }

    public int subtract(int firstNum, int secondNum) {
        result = firstNum - secondNum;
        return result;
    }


}
