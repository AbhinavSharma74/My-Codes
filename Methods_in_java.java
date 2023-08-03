public class Methods_in_java {
    static int logic(int x, int y){  // 1. Make a method
        int z;                       // 2. initialize variables
        if(x>y){                     // 3. Make "conditions" which needs to be executed many times in the code
            z = x + y;
        }
        else
            z = (x + y) * 5;
        return z;                    // 4. return is imp.
    }
    public static void main(String[] args) {
        int a = 8;                   // 5. initialize the values
        int b = 7;
        int c;
        c = logic(a,b);              // 6. Use "logic" statement to run the "method"
        System.out.println(c);

//        int c2;
//        int a1 = 3;
//        int b2 = 4;
//        c2 = logic(a1,b2);
//        System.out.println(c2);
    }
    }