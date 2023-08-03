import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        //While loop:
       /* int i = 200;
        while (i<210) {
            System.out.println(i);
            i++;
        }}}*/
        //Do-While loop:
//        int a = 10;
//        do {
//            System.out.println(a);
//            a++;
//        } while (a <= 20);
//        System.out.println("loop is terminated");
//    }}

        //For loop:
//        for (int i=20; i<=30; i++) {
//            System.out.println(i);
//        }}}

        //Decrementing of for loop:
//        for (int i=10; i!=0; i--) {
//            System.out.println(i);
//        }}}

        //Quiz:
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = s.nextInt();
        for (int i=n; i!=0; i--) {
            System.out.print(i+"->");
        }}}


