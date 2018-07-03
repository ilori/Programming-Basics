import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SecondDiamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int dots = n;
        int stars = 3 * n;
        int secondDots = 3 * n;
        int midRow = 5 * n;
        int lastRowDots = n * 2 + 1;
        int lastRowStars = (5 * n) - (lastRowDots * 2);
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat(".", dots) + repeat("*", stars) + repeat(".", dots));
        }
        for (int i = 0; i < n - 1; i++) {
            dots--;
            System.out.println(repeat(".", dots) + "*" + repeat(".", secondDots) + "*" + repeat(".", dots));
            secondDots += 2;
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat("*", midRow));
        }
        for (int i = 0; i < 2 * n; i++) {
            secondDots -= 2;
            System.out.println(repeat(".", dots) + "*" + repeat(".", secondDots) + "*" + repeat(".", dots));
            dots++;
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat(".", lastRowDots) + repeat("*", lastRowStars) + repeat(".", lastRowDots));
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
