package javawrtinghiomework2;

public class Programme_12_PrintExpression {
    /* Write a Java Program to compute the specified expressions and print the output.
    Test Data:((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

     public static void main(String[] args) {
         Programme_12_PrintExpression t = new Programme_12_PrintExpression();
         t.printexpressions();

     }
     public void printexpressions() {
         double a = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
         System.out.println(a);

     }
}
