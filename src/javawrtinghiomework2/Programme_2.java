package javawrtinghiomework2;

public class Programme_2 {
    /** write a java programme using the following steps.
     * 2.1 Declare 2 static variables
     * 2.2 Declare 1 static method
     * 2.3  Call both static variables into the static method inside the print statement.
     * 2.4 Declare the main method.
     * 2.5  Call the static method into the Main method and Run the programme.
     */
    //2.1 Declare two static variables
    static int a = 100;
    static int b = 200;

    //Declare one static method
    // Call both static variables into the static method inside the print statement
    public static void staticMethod() {
        System.out.println(a);
        System.out.println(b);

    }
    // Declare the main method.
    //  Call the static method into the Main method and Run the programme.

    public static void main(String[] args) {
        staticMethod();
    }

}
