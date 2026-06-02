
import java.util.Scanner;


      
public class discalc{
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p1 = sc.nextFloat();
        float p2 = sc.nextFloat();

        float percent = sc.nextFloat();

        float p3 = p1 + p2;
        System.out.println(p3);
        float reduce_price = (percent / 100) * p3;

        System.out.println(p3 - reduce_price);
        System.out.println(reduce_price);

    }
}
