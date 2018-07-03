import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_Dumbbell {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int dots = n / 2 - 1;
        int stars = n / 2;
        System.out.println(repeat(".", n / 2) + repeat("&", (n + 1) / 2) + repeat(".", n) + repeat("&", (n + 1) / 2) + repeat(".", n / 2));
        for (int i = 0; i < (n - 2) / 2; i++) {
            System.out.println(repeat(".", dots) + "&" + repeat("*", stars) + "&" + repeat(".", n) + "&" + repeat("*", stars) + "&" + repeat(".", dots));
            dots--;
            stars++;
        }
        System.out.println("&" + repeat("*", n - 2) + "&" + repeat("=", n) + "&" + repeat("*", n - 2) + "&");
        dots++;
        stars--;
        for (int i = 0; i < (n - 2) / 2; i++) {
            System.out.println(repeat(".", dots) + "&" + repeat("*", stars) + "&" + repeat(".", n) + "&" + repeat("*", stars) + "&" + repeat(".", dots));
            dots++;
            stars--;
        }
        System.out.println(repeat(".", n / 2) + repeat("&", (n + 1) / 2) + repeat(".", n) + repeat("&", (n + 1) / 2) + repeat(".", n / 2));
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
