import java.util.Scanner;
public class CBSE_Percentage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float total = 500;
        System.out.print("Enter 1st number:");
        float n1 = s.nextInt();
        System.out.print("Enter 2nd number:");
        float n2 = s.nextInt();
        System.out.print("Enter 3rd number:");
        float n3 = s.nextInt();
        System.out.print("Enter 4th number:");
        float n4 = s.nextInt();
        System.out.print("Enter 5th number:");
        float n5 = s.nextInt();

        float sum = n1 + n2 + n3 + n4 + n5;
        System.out.println("Your total marks are:" + sum);

        float percentage = (sum/total)*100;
        System.out.println("Your percentage is :" + percentage);

    }
}
