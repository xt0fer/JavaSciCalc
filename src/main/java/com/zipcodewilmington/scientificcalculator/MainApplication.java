package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

  private CalculatorEngine engine = new CalculatorEngine();
  private CalculatorDisplay display = new CalculatorDisplay();

    public static void main(String[] args) {
      System.out.println("Welcome! \nTake a look at some of our functions!");
      System.out.println("(1) Basic Functions \n(2) Scientific Functions \n(3) Math time!");
      CalculatorDisplay.menuOption1();


      String s = Console.getStringInput("Enter a string");
      Integer i = Console.getIntegerInput("Enter an integer");
      Double d = Console.getDoubleInput("Enter a double.");
      Console.println("The user input %s as a string", s);
      Console.println("The user input %s as a integer", i);
      Console.println("The user input %s as a double", d);


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
    }
    */

