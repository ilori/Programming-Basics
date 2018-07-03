import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class ChristmasHat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 4 * n + 1;
        int height = 2 * n + 5;
        System.out.println(repeat(".", (width - 3) / 2) + "/|\\" + repeat(".", (width - 3) / 2));
        System.out.println(repeat(".", (width - 3) / 2) + "\\|/" + repeat(".", (width - 3) / 2));
        for (int i = 0; i < 2 * n; i++) {
            System.out.println(repeat(".",(width-3)/2 - i) + "*" + repeat("-",i) + "*" + repeat("-",i) + "*" + repeat(".",(width-3)/2-i));
        }
        System.out.println(repeat("*", width));
        System.out.println("*" + repeat(".*", (width - 1) / 2));
        System.out.println(repeat("*", width));
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
