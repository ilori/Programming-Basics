import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class GreatestCommonDivisor {public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    int a = Integer.parseInt(console.nextLine());
    int b = Integer.parseInt(console.nextLine());
    while (b != 0) {
        int oldB = b;
        b = a % b;
        a = oldB;
    }
    System.out.println(a);
}
}
