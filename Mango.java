
import java.util.Scanner;

public class Mango {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int tree = sc.nextInt();
        if ((tree > rows) && (tree <= rows * 2)) {
            System.out.println("It is a Mango Tree");
        } else {
            System.out.println("It is not a Mango Tree");
        }
    }
}
