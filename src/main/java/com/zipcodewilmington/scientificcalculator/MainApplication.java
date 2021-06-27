package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Integer y = 0;
        Integer z = 0;

        Scanner scanObject = new Scanner(System.in);

        Console.println("Welcome to my calculator!");

    // Connected the sum method

        System.out.println("Please enter a number");

        y = scanObject.nextInt();
        scanObject.nextLine();

       // System.out.println(y);

        System.out.println("Please enter another number");
        z = scanObject.nextInt();
       // scanObject.nextLine();

        System.out.println("Adding now...");
        int x = Calculator.sum(y, z);
        System.out.println(x);


        String s = Console.getStringInput("Enter a string");



        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        // Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
}
