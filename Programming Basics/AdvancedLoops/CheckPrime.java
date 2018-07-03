import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class CheckPrime {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        float n = Float.parseFloat(console.nextLine());
        boolean isPrime = true;
        if (n < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (i % 2 == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
