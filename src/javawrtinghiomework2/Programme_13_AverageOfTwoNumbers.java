package javawrtinghiomework2;

import java.util.Scanner;

public class Programme_13_AverageOfTwoNumbers {
    /*
     *Write a Java program that takes three numbers as input to calculate and
     *print the average of the numbers.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        double x = sc.nextDouble();
        System.out.print("Enter Second Number: ");
        double y = sc.nextDouble();
        System.out.print("Enter Third Number: ");
        double z = sc.nextDouble();
        averageOfThreeNumbers(x, y, z);
        // closing the scanner object
        sc.close();
    }
    public static void averageOfThreeNumbers(double x, double y, double z) {
        double average = (x + y + z) / 3;
        System.out.println("The average of " + x + " , " + y + " and " + z + " is : " + average);
    }
}
