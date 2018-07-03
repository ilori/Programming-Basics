import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int f0 = 1;
        int f1 = 1;
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i < n - 1; i++) {
            int next = f0 + f1;
            f0 = f1;
            f1 = next;
        }
        System.out.println(f1);
    }
}
