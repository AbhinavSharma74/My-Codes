import java.util.Scanner;
public class CountDigitsInANumber {
    public static void main(String[] args) {
        int num = 342113;
        int counter = 0;
        while(num!=0){
            num=num/10;
            counter++;
        }
        System.out.println("Total Digits: " + counter);

        System.out.println("===================================");
        int num2=100000;
        int counter2=0;
        if (num2%10==0){
            counter2++;
        }
        num=num/10;


        System.out.println("==================================");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1=s.nextInt();
        System.out.println("Enter the Second number: ");
        int n2=s.nextInt();

//        while (n2%n1!=0){
//        int remainder= n2%n1;
//        n2=n1;
//        n1=remainder;
//        System.out.println("GCD is:" + n1);

        while (n1-n2!=0){
            if (n1>n2){
                n1=n1-n2;
            }
            else {
                n2=n2-n1;
            }

    }
        System.out.println("GCD is: " + n1);
}}
