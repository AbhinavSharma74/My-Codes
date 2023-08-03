import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        //int age = 18;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = s.nextInt();
        if (age>=18){
            System.out.println("Boy you can drive!");
        }
        else
            System.out.println("No boy you can not drive yet!");

    }
}