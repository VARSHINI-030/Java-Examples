
import java.util.Scanner;

public class Friend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int count1 = 0;
        int count2 = 0;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count1 += i;
            }
        }
        for (int j = 1; j <= num2; j++) {
            if (num2 % j == 0) {
                count2 += j;
            }
        }
        if ((count1 / num1) == (count2 / num2)) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not a Friendly Pair");
        }
    }
}
