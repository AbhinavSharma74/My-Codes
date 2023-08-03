import java.util.Scanner;

//Question.1 If it is a square or not?
public class if_else1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = s.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = s.nextInt();

        if (length==breadth){
            System.out.println("It is a square...");
        }
        else {
            System.out.println("It is a rectangle...");
        }
    }
}
