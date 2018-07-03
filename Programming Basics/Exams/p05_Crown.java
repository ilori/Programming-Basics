import java.util.Scanner;

/**
 * Created by magix on 5/11/2017.
 */
public class p05_Crown {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n - 1;
        int height = n / 2 + 4;
        int spaces = n - 3;
        int midDots = 1;
        int lastRow = (width - (n + 3)) / 2;
        System.out.println("@" + repeat(" ", (width - 3) / 2) + "@" + repeat(" ", (width - 3) / 2) + "@");


        for (int i = 0; i < height - 4; i++) {
            if (i == 0) {
                System.out.println("**" + repeat(" ", spaces) + "*" + repeat(" ", spaces) + "**");
                spaces -= 2;
            } else if (i != height - 5) {
                System.out.println("*" + repeat(".", i) + "*" + repeat(" ", spaces) + "*" + repeat(".", midDots) + "*" + repeat(" ", spaces) + "*" + repeat(".", i) + "*");
                spaces -= 2;
                midDots += 2;
            } else {
                System.out.println("*" + repeat(".", i) + "*" + repeat(".", midDots) + "*" + repeat(".", i) + "*");
            }
        }
        System.out.println("*" + repeat(".", n / 2) + repeat("*", lastRow) + "." + repeat("*", lastRow) + repeat(".", n / 2) + "*");
        System.out.println(repeat("*", width));
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
