import java.util.Scanner;

//Question.2 Largest of two numbers

public class if_else2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the 1st value: ");
        int a = s.nextInt();
        System.out.print("Enter the 2nd value: ");
        int b = s.nextInt();

        if (a>=b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }
    }
}
