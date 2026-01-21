
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            if (n == 1) {
                System.out.print(a);
            } else if (i == 2) {
                System.out.print(b);
            } else {
                int c = a + b;
                System.out.print(c);
                a = b;
                b = c;
            }
        }
    }
}
