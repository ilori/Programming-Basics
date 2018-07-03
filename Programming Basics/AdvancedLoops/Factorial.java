import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int i = num; i <= n; i++) {
            num = num * i;
        }
        System.out.println(num);
    }
}
