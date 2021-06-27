package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class CalculatorInterface {
    public static void main(String[] args) {

        Integer y = 0;
        Integer z = 0;

        Scanner scanObject = new Scanner(System.in);

        CalculatorEngine.println("Welcome to the calculator!\nWhat would you like to do?");
        System.out.println("1. Basic Functions \n2. Scientific Functions \n3. Something Fun!");

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


        String s = CalculatorEngine.getStringInput("Enter a string");



        Double d = CalculatorEngine.getDoubleInput("Enter a double.");

        CalculatorEngine.println("The user input %s as a string", s);
        // Console.println("The user input %s as a integer", i);
        CalculatorEngine.println("The user input %s as a d", d);
    }
}
