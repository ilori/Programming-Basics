import java.util.Scanner;

/**
 * Created by magix on 4/16/2017.
 */
public class p06_ControlNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        int controlNumber = Integer.parseInt(console.nextLine());
        int moves = 0;
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                moves++;
                totalSum = totalSum + (i * 2 + j * 3);
                if (totalSum >= controlNumber) {
                    System.out.printf("%d moves\nScore: %d >= %d", moves, totalSum, controlNumber);
                    return;
                }
            }
        }
        for (int i = 1; i <= n; i++) {
            for (int j = m; j >= 1; j--) {
                moves++;
                totalSum = totalSum + (i * 2 + j * 3);
                if(totalSum < controlNumber)
                {
                    System.out.printf("%d moves",moves-1);
                    return;
                }
            }

        }
    }
}
