package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class CalculatorInterface {

    static Integer y = 0;
    static Integer z = 0;
    private static String prompt;


    public static void main(String[] args) {

        Scanner scanObject = new Scanner(System.in);

        CalculatorEngine.println("Welcome to the calculator!\nWhat would you like to do?");
        System.out.println("1. Basic Functions \n2. Scientific Functions \n3. Something Fun!");


        public String menuOption1(String prompt) {
        }
            switch (prompt) {
                case "1":
                    System.out.println("Here are some Basic Functions. \n+ \nAddition , - \n-Subtraction , / \n-Division , * \n-Multiplication";
                    break;
                case "2":
                    System.out.println("Here are some Scientific Functions. \nSine() \nCosine()");
                    break;
                case "3":
                    System.out.println("Something Fun!");
                    break;
            }


        System.out.println("Please enter a number");

        y = scanObject.nextInt();
        scanObject.nextLine();

       // System.out.println(y);
        // Connected the sum method
        System.out.println("Please enter another number");
        z = scanObject.nextInt();
       // scanObject.nextLine();

        System.out.println("Adding now...");
        int x = Calculator.sum(y, z);
        System.out.println(x);

        String

        String s = CalculatorEngine.getStringInput("Enter a string");



        Double d = CalculatorEngine.getDoubleInput("Enter a double.");

        CalculatorEngine.println("The user input %s as a string", s);
        // Console.println("The user input %s as a integer", i);
        CalculatorEngine.println("The user input %s as a d", d);
    }
}
