import java.util.Scanner;
public class practice_set3 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
           /* System.out.print("Enter the number of even numbers to be printed : ");
            int n = s.nextInt();
            int i = 1;
            while(i<=n){
                System.out.println(2*i);
                i++;*/

            //Question 1:
           /*int sum=0;
            int n=4;
            for (int i=0; i<n; i++){
                sum = sum + (2*i);
            }
            System.out.println("The sum of first " + n + " even numbers is: " + sum);*/

            //Question 2:
          /* int n = 5;
            for (int i=1; i<=10; i++){
                System.out.printf("%d * %d = %d\n", n, i, n*i);*/

            //Question 3:
            /* n = 10;
            for (int i=10; i!=0; i--){
                System.out.printf("%d * %d = %d\n",n,i,n*i);*/

            //Question 4: Factorial of a number
            System.out.print("Enter the factorial number: ");
            int n = s.nextInt();
            int factorial = 1;
            for ( int i = 1; i<=n; i++){
                factorial = factorial * i;
            }
            System.out.println("the factorial of " +n+ "! is " + factorial);

            //Question 5:

        }}