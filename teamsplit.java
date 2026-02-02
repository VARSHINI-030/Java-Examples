
import java.util.Scanner;

public class teamsplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int teams = sc.nextInt();
        int size = total / teams;
        int left = total % teams;
        System.out.println("The number of students in each team is " + size + " and the leftout is " + left);
    }
}
