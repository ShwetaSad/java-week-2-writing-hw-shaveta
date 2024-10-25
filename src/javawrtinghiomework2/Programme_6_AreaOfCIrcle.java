package javawrtinghiomework2;

import java.util.Scanner;

public class Programme_6_AreaOfCIrcle {
    /**
     * Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
     */
    public static void main(String[] args) {
        //Scanner declaration for reading input from console
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of a circle: ");
        double radius = sc.nextDouble();
        areaOfCircle(radius);
        // closing the scanner object
        sc.close();

}
    // Calculating the area of circle
    public static void areaOfCircle(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("The area of a circle is " + area);

    }
}
