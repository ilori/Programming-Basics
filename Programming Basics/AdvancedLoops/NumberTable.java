import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class NumberTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
                int num = rows + cols + 1;
                if (num > n) {
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
