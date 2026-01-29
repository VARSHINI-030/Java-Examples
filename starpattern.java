
import java.util.Scanner;

public class starpattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
