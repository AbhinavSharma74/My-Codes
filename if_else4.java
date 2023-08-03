import java.util.Scanner;

public class if_else4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your service years: ");
        int service = s.nextInt();

        if (service>=5){
            System.out.println("Congrats... You earned a bonus");
            System.out.println("Enter your salary: ");
            float salary = s.nextInt();
            System.out.println("Your bonus is - " + salary*0.05);
            System.out.println("Your salary is - " + salary+(salary*0.05));
        }
        else{
            System.out.println("SORRY... Better luck next time");
        }
    }
}
