public class practice_set5 {
//    static void pattern(int n){                         Ques1.question for pattern
//        for (int i=0; i<=n; i++){
//            for (int j=0; j<i+1; j++){
//                System.out.print("*");
//        }
//        System.out.println();
//    }
    static int NaturalNums(int n){                             //Ques2.Sum of natural numbers
        if ( n==1){
            return 1;
        }
        return n + NaturalNums(n-1);
    }
    public static void main(String[] args) {
        int c = NaturalNums(4);
        System.out.println(c);
        //pattern();
    }
}