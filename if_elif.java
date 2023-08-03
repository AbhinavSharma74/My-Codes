import java.util.Scanner;

public class if_elif {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your Age");
        int age = s.nextInt();
        if (age>18){
            System.out.println("you are mature");
        } else if (age<18) {
            System.out.println("you are not mature");
        }
        else
            System.out.println("you are 18");
    }
}