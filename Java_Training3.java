public class Java_Training3 {
    public static void main(String[] args) {


        //*****
        //*   *
        //*   *
        //*   *
        //*****
        int row = 5;
        int col = 5;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (i==0 || j==0 || i==row-1 || j==col-1){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }}}


        //*****
        //*   *
        //* * *
        //*   *
        //*****
//        int row2 = 5;
//        int col2= 5;
//        for (int i=0; i<row2; i++){
//            for (int j=0; j<col2; j++){
//                if (i==0 || j==0 || i==row2-1 || j==col2-1 || i==row2/2 && i=col2/2){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }}
