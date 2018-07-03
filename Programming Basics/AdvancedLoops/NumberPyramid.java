import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int num = 1;
        for (int row = 1; row <= n; row++) {
            for (int cols = 1; cols <= row; cols++) {
                if (cols > 1) {
                    System.out.print(" ");
                }
                System.out.print(num);
                num++;
                if (num > n) {
                    break;
                }
            }
            System.out.println();
            if (num > n) {
                break;
            }
        }

    }
}
