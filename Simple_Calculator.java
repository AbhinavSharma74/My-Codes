import java.util.Scanner;
public class Simple_Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your choice: 1,2,3,4");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        double choice = s.nextDouble();
        System.out.print("Enter first numbers: ");
        double num1 = s.nextDouble();
        System.out.print("Enter Second numbers: ");
        double num2 = s.nextDouble();
        if (choice == 1) {
            System.out.println(num1 + num2);
        } else if (choice == 2) {
            System.out.println(num1 - num2);
        } else if (choice == 3) {
            System.out.println(num1 * num2);
        } else if (choice == 4) {
            System.out.println(num1 / num2);
        }}}
