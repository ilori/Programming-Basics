import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p06_StupidPasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int l = Integer.parseInt(console.nextLine());
        for (int d1 = 1; d1 <= n; d1++)
            for (int d2 = 1; d2 <= n; d2++)
                for (int l1 = 'a'; l1 < 'a' + l; l1++)
                    for (int l2 = 'a'; l2 < 'a' + l; l2++)
                        for (int d3 = Math.max(d1, d2) + 1; d3 <= n; d3++) {
                            System.out.printf("%d%d%c%c%d ", d1, d2, l1, l2, d3);
                        }
        System.out.println();
    }
}
