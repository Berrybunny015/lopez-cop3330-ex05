package org.example;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("\nWhat is the first number? "); //output #1
        Scanner firstNumberInput = new Scanner(System.in); //scan for first number
        int firstNumber = firstNumberInput.nextInt(); //number as an integer

        System.out.println("\nWhat is the second number? "); //output #2
        Scanner secondNumberInput = new Scanner(System.in); //scan for second number
        int secondNumber = secondNumberInput.nextInt(); //number as an integer

        int sum = firstNumber + secondNumber; //finding the sum of the two numbers
        System.out.println("\n" + firstNumber + " + " + secondNumber + " = " + sum);

        int difference = firstNumber - secondNumber; //finding the difference of the two numbers
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference);

        int product = firstNumber * secondNumber; //finding the product of the two numbers
        System.out.println(firstNumber + " * " + secondNumber + " = " + product);

        int quotient = firstNumber / secondNumber; //finding the quotient of the two numbers
        System.out.println(firstNumber + " / " + secondNumber + " = " + quotient);

    }
}