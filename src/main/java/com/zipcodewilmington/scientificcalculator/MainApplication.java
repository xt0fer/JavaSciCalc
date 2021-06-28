package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

  // String s = Console.getStringInput("Enter a string");
  private CalculatorEngine engine = new CalculatorEngine();
  private CalculatorDisplay display = new CalculatorDisplay();

    public static void main(String[] args) {
        CalculatorDisplay.menuOption1();
    }
}

/*

        System.out.println("Please enter a number");
       // System.out.println(y);
        // Connected the sum method
        System.out.println("Please enter another number");
        System.out.println("Adding now...");
        int x = Calculator.sum(y, z);
        System.out.println(x);


        String s = Console.getStringInput("Enter a string");
        String s = Console.getStringInput("Enter a string");
        String s = CalculatorEngine.getStringInput("Enter a string");

        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        // Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
    */

