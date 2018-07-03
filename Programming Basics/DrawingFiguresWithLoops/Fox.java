import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Fox {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n + 3;
        int leftRightSars = n / 2;
        int midStars = n;
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat("*", i) + "\\" + repeat("-", width - 2 - (2 * i)) + "/" + repeat("*", i));
        }
        for (int i = 0; i < n / 3; i++) {
            System.out.println("|" + repeat("*", leftRightSars) + "\\" + repeat("*", midStars) + "/" + repeat("*", leftRightSars) + "|");
            leftRightSars++;
            midStars -= 2;
        }
        for (int i = 1; i <= n; i++) {
            System.out.println(repeat("-", i) + "\\" + repeat("*", width - 2 - (2 * i)) + "/" + repeat("-", i));
        }
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;

    }
}
