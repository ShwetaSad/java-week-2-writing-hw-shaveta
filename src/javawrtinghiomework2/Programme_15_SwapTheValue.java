package javawrtinghiomework2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Programme_15_SwapTheValue {
    /*
     * Write a Java program to swap two variables.
     */
    public static void main(String[] args) {
        // Scanner declaration
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second  = sc.nextInt();
        swapTheValue(first, second);
        // closing the scanner
        sc.close();

    }
    public static void swapTheValue(int a, int b) {
        int c;
        System.out.println("Before the swapping, The values of first variable is : " + a + " and second variable is : " + b);
        c = a;
        a = b;
        b = c;
        System.out.println("After the swapping, The values of first variable is : " + a + " and second variable is : " + b);

    }}