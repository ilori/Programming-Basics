import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class NumbersNto1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
