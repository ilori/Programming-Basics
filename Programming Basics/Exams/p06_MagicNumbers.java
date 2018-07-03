import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p06_MagicNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int magicNumber = Integer.parseInt(console.nextLine());
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {
                                if (i * j * k * l * m * n == magicNumber) {
                                    System.out.printf("%d%d%d%d%d%d ", i, j, k, l, m, n);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
