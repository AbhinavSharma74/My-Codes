import java.util.Scanner;

public class recursion {
    /*static int factorial(int n) {
        if (n == 0 || n == 1) {                  //1. Always the exceptional condition
            return 1;
        } else {
            return n * factorial(n - 1);      //2. Give the main condition in this line
        }*/

        static int factorial_iterative(int l) {
            if (l == 0 || l == 1) {                 //1. Always the exceptional condition
                return 1;
            } else {
                int product = 1;                    //2. Give the main condition in this line
                for (int i = 1; (i <= l); i++){
                    product *= i;
                }
                return product;
            }
            }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int y = s.nextInt();
        //System.out.println("The factorial of '" + y + "' using recursion is " + factorial(y) + "...");
        System.out.println("the factorial of " + y + " using iteration is " + factorial_iterative(y));
    }
}


