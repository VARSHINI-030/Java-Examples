
import java.util.Scanner;

public class mango2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        System.out.print("Enter tree number to check: ");
        int treeNo = sc.nextInt();

        if (treeNo / row == (row / 2) + 1) {

            if ((treeNo > (cols / 2) * row)
                    && (treeNo <= ((cols / 2) + 1) * row)) {

                System.out.println("It is a Mango Tree");
            }

        } else {
            System.out.println("It is not a Mango Tree");
        }

    }
}
