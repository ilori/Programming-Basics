import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println(repeat("*",n));
        for (int i = 0; i < n-2; i++) {
            System.out.println("*" + repeat(" ",n-2) + "*");
        }
        System.out.println(repeat("*",n));
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
