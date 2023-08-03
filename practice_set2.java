import  java.util.Scanner;
public class practice_set2 {
    public static void main(String[] args) {
        //Question 1:
      /*  System.out.println("Enter the number:" );
        int day = s.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");*/

        // Question 2:
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = s.nextInt();

        if (year % 4 == 0) {
            System.out.println("Year is a Leap year!!");
        }
        else
            System.out.println("Year is not a Leap year!!");
        }
}
