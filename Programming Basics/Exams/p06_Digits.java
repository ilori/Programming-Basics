import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p06_Digits {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int firstDigit = n / 100;
        int secondDidgit = n / 10 % 10;
        int lastDigit = n % 10;
        for (int i = 0; i < firstDigit + secondDidgit; i++) {
            for (int j = 0; j < firstDigit + lastDigit; j++) {
                if (n % 5 == 0) {
                    n -= firstDigit;
                } else if (n % 3 == 0) {
                    n -= secondDidgit;
                } else {
                    n += lastDigit;
                }
                System.out.printf("%d ", n);
            }
            System.out.println();
        }
    }
}
