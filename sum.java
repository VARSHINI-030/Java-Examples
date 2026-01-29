
import java.util.Scanner;

public class sum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 1;
        while (a != -1) {
            sum = sum + a;
            a = sc.nextInt();
        }
        System.out.print(sum);
    }
}
