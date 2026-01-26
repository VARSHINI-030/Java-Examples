
import java.util.Scanner;

public class paper {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();  //29
        int width = sc.nextInt();  //21
        int area = length * width; //609
        if (area > 500) {
            System.out.println("Big");
        } else {
            System.out.println("Small");
        }
    }
}
