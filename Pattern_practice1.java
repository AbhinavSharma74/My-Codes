public class Pattern_practice1 {
    public static void main(String[] args) {

        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=========================================");
//        for (int i=0; i<5; i++){
//            System.out.print("*");
//        }

        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=1; j<=i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        int temp = 0;
        for (int i=0; i<4; i++){
            for (int j=0; j<i+1; j++){
                System.out.print(++temp);
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=4; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=5; j>i; j--){
                System.out.print(" ");
            }
            for (int j=0; j<(2*i)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<5-i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<i; j++){
                System.out.print(" ");
            }
            for (int j=0; j<(2*(5-i)-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("=========================================");
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || j==0 || i==4 || j==4){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("=========================================");
        int row=5, col=5;
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                if ( i==0 || j==0 || i==row-1 || j==col-1 || i==row/2 && j==col/2){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
