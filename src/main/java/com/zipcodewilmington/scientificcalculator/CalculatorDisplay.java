package com.zipcodewilmington.scientificcalculator;

public class CalculatorDisplay {

    public static void menuOption1() {
        System.out.println("What would you like to do?");
         String prompt;
            do {
                prompt = Console.getStringInput("1, 2, 3");
                switch (prompt.toLowerCase()) {
                    case "1":
                        System.out.println("Here are some Basic Functions. \n+ \nAddition , - \n-Subtraction , / \n-Division , * \n-Multiplication");
                        break;
                    case "2":
                        System.out.println("Here are some Scientific Functions. \nSine() \nCosine() \nTangent");
                        break;
                    case "3":
                        System.out.println("Something Fun!");
                        break;
                    default:
                        Console.println("[ %s ] is not a valid input!", prompt);
                        break;
                }
            } while (true);
    }
