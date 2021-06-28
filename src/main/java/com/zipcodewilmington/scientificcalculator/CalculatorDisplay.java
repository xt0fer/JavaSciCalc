package com.zipcodewilmington.scientificcalculator;

public class CalculatorDisplay {

    public static void menuOption1() {
        String prompt;
        do {
            prompt = Console.getStringInput("");
            switch (prompt.toLowerCase()) {
                case "1":
                    System.out.println("Here are some Basic Functions. \n(+) - Addition \n(-) - Subtraction \n(/) - Division \n(*) - Multiplication");
                    break;
                case "2":
                    System.out.println("Here are some Scientific Functions. \nSine() \nCosine() \nTangent()");
                    break;
                case "3":
                    System.out.println("Return to menu? \n ( Y / N?)");
                            Console.getStringInput("");
                    break;
                default:
                    Console.println("[ %s ] is not a valid input!", prompt);
                    break;
            }
        } while (true);
    }
}
