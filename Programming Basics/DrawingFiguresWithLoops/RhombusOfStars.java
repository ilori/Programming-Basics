import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int times = Integer.parseInt(console.nextLine());
        int spaces = times - 1;
        int stars = 1;
        for (int i = 0; i < times; i++) {
            System.out.println(repeat(" ", spaces) + repeat("* ", stars));
            spaces--;
            stars++;
        }
        spaces = 1;
        stars-=2;
        for (int i = 0; i < times; i++) {
            System.out.println(repeat(" ", spaces) + repeat("* ", stars));
            spaces++;
            stars--;
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
