import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = 0; i <= n; i += 2) {

            System.out.println(num);
            num *= 2 * 2;
        }
    }
}
