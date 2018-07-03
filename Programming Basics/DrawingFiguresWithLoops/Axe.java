import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Axe {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;
        int left = 3 * n;
        int middle = 0;
        int right = width - 2 - left;
        for (int i = 0; i < n; i++) {
            System.out.printf("%s*%s*%s%n", repeat("-", left), repeat("-", middle), repeat("-", right));
            middle++;
            right--;
        }
        middle--;
        right++;
        for (int i = 0; i < n / 2; i++) {
            System.out.printf("%s*%s*%s%n", repeat("*", left), repeat("-", middle), repeat("-", right));
        }
        for (int i = 0; i < n / 2 - 1; i++) {
            System.out.printf("%s*%s*%s%n", repeat("-", left), repeat("-", middle), repeat("-", right));
            middle += 2;
            left--;
            right--;
        }
        System.out.printf("%s*%s*%s%n", repeat("-", left), repeat("*", middle), repeat("-", right));
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
