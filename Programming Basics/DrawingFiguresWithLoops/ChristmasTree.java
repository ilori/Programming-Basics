import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class ChristmasTree {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int times = Integer.parseInt(console.nextLine());
        for (int i = 0; i < times + 1; i++) {
            System.out.println(repeat(" ", times - i) + repeat("*", i) + " | " + repeat("*", i));
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
