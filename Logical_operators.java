public class Logical_operators {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;
        if (a && b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        if (a || b){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

        System.out.println("For logical NOT");

        System.out.print("For Not(a):");
        System.out.println(!a);

        System.out.print("For Not(b):");
        System.out.println(!b);
    }
}
