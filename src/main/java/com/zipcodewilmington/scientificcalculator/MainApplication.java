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

    System.out.println("Please choose an operator ( +, - , / , * )");
    String operator = Console.getStringInput("");
    Console.println("You entered %s\n", operator);
    System.out.println("Enter your first number");
    Double firstNum = Console.getDoubleInput("");
    Console.println("%s", firstNum);
    System.out.println("Enter your second number");
    Double secondNum = Console.getDoubleInput("");
    Console.println("%s", secondNum);

    String basicMathOperator = operator;

    switch (basicMathOperator) {
      case "+":
        System.out.println(CalculatorEngine.sum(firstNum, secondNum));
        break;
      case "-":
        System.out.println();
        CalculatorEngine.subtract(firstNum, secondNum);
        break;
      case "/":
        System.out.println(CalculatorEngine.divide(firstNum, secondNum));
        break;
      case "*":
        System.out.println(CalculatorEngine.multiply(firstNum, secondNum));
        break;
      default:
        System.out.println("Unable to do math.");
    }

  String scientificOperator = operator;
    switch (scientificOperator) {
      case "cos":
        System.out.println(Math.cos(firstNum));
        break;
      case "tan":
        System.out.println(Math.sin(firstNum));
        break;
      case "sin":
        System.out.println(Math.tan(firstNum));
        break;
      default:
        System.out.println("Unable to do math.");
    }
  }
}

/*
      String s = Console.getStringInput("Enter a string");
      Integer i = Console.getIntegerInput("Enter an integer");
      Double d = Console.getDoubleInput("Enter a double.");
      Console.println("The user input %s as a string", s);
      Console.println("The user input %s as a integer", i);
      Console.println("The user input %s as a double", d);
*/

