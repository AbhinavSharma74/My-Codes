import java.util.Scanner;

public class if_else3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the quantity: ");
        int unit = s.nextInt();

        if ((unit*100) >1000){
            System.out.println("You get a discount of " + (0.1*unit*100));
            System.out.println(" and your total cost is " + (unit*100-(0.1*unit*100)));
        }
        else {
            System.out.println("no discount SORRY....");
        }
    }
}
