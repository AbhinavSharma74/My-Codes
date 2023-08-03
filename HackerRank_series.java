import java.util.Scanner;
public class HackerRank_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
        in.close();

    }
}