
import java.util.Scanner;

public class PrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % 2 == 0) {
                count++;
            } else {
                System.out.println("Not a prime number");
            }
        }
        System.out.println("Prime Number");
    }
}
