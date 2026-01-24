
import java.util.Scanner;

public class numberseries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int num_square = i * i;
            int reversed = 0;
            while (num_square != 0) {
                int digit = num_square % 10;
                reversed = reversed * 10 + digit;
                num_square = num_square / 10;
            }
            System.out.print(reversed + " ");
        }
    }
}
