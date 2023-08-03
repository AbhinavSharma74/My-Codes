import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the no: " );
//        int no = s.nextInt();
//        int temp = 0;
//
//        for (int i=2; i<no-1; i++){
//            if (no%i==0){
//                temp = temp + 1;
//            }
//        }
//        if (temp>0){
//            System.out.println("Number is not prime...");
//        }else {
//            System.out.println("Number is prime...");
//        }

        System.out.println("=====================================================");
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int no2 = sc.nextInt();
        int count = 0;

        while(no2>0){
            no2 = no2/10;
            count = count + 1;
        }
        System.out.println(count);
    }

}
