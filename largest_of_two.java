import java.util.Scanner;
public class largest_of_two {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
       // int c = s.nextInt();
        System.out.println("Largest number is " + Math.max(a,b));

        //For minimum number :
        System.out.println("Lowest number is " + Math.min(a,b));
    }
}