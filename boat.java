
import java.util.Scanner;

public class boat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();  //340
        int adult = sc.nextInt();  //2
        int child = sc.nextInt();  //3
        int total = ((adult * 75) + (child * 50)); //300
        if (total < weight) {
            System.out.println("Stable");
        } else {
            System.out.println("Drown");
        }
    }
}
