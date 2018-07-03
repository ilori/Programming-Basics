import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TriangleOfDollars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int times = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= times; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
