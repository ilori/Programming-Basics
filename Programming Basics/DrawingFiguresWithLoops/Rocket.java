import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Rocket {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 3 * n - 2;
        int spaces = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(repeat(".", width / 2) + "/" + repeat(" ", spaces) + "\\" + repeat(".", width / 2));
            width -= 2;
            spaces += 2;
        }
        System.out.println(repeat(".", n / 2) + repeat("*", n * 2) + repeat(".", n / 2));
        for (int i = 0; i < n * 2; i++) {
            System.out.println(repeat(".", n / 2) + "|" + repeat("\\", 2 * n - 2) + "|" + repeat(".", n / 2));
        }
        for (int i = n / 2; i >= 1; i--) {
            System.out.println(repeat(".", i) + "/" + repeat("*", 2 * n - 2) + "\\" + repeat(".", i));
            n++;
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
