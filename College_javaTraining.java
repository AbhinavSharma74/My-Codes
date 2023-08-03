public class College_javaTraining {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("======================");
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println("========================");
        int k =0;
        for (int i=0; i<4; i++){
            for (int j=0; j<i+1; j++){
                k++;
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
