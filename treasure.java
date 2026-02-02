
import java.util.Scanner;

public class treasure {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Pin to open the Treasure: ");
        String input = sc.nextLine();
        input = input.replaceAll("[+-]", "");
        char firstChar = input.charAt(0);
        char lastChar = input.charAt(input.length() - 1);
        int firstDigit = Character.getNumericValue(firstChar);
        int lastDigit = Character.getNumericValue(lastChar);
        int result = firstDigit + lastDigit;
        System.out.println("The Treasure Pin code is: " + result);

    }
}
