package javawrtinghiomework2;

import java.util.Scanner;

public class Programme_5_Calculator {
    /**
     * Write a program for a calculator with addition, subtraction, multiplication and division
     * methods all with parameters and use string concatenation methods.
     * (Note: Two static and Two instance methods.)
     */
    public static void addition(int a, int b) {
        int result = a + b;
        System.out.println("The addition of " + a + "+" + b + " = " + result);

    }

    public static void subtraction(int a, int b) {
        int result = a - b;
        System.out.println("The subtraction of " + a + "+" + b + " = " + result);
    }

    //instance methods
    public void multiplication(int a, int b) {
        int result = a * b;
        System.out.println("The multiplication of " + a + " and " + b + " is : " + result);
    }

    public void division(int a, int b) {
        System.out.println("The division of " + a + " and " + b + " is : " + a / b);
    }

public static void main(String[] args) {
    // Scanner declaration for reading input from console
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter the first number: ");
    int a = sc.nextInt();

    System.out.println("Please enter the second number: ");
    int b = sc.nextInt();

    addition(a, b);
    subtraction(a, b);
    Programme_5_Calculator obj = new Programme_5_Calculator();
    obj.multiplication(a, b);
    obj.division(a, b);

    // closing the scanner object
    sc.close();
}
}

