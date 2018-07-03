import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Stop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int dots = n;
        int undersCores = dots * 2 - 1;
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat(".", dots + 1) + repeat("_", dots * 2 + 1) + repeat(".", dots + 1));
        }
        for (int i = 0; i < n; i++) {
            System.out.println(repeat(".", dots) + "//" + repeat("_", undersCores) + "\\\\" + repeat(".", dots));
            dots--;
            undersCores += 2;
        }
        for (int i = 0; i < 1; i++) {
            System.out.println("//" + repeat("_", (undersCores - 5) / 2) + "STOP!" + repeat("_", (undersCores - 5) / 2) + "\\\\");
            System.out.println("\\\\" + repeat("_", undersCores) + "//");

        }
        for (int i = 0; i < n - 1; i++) {
            dots++;
            undersCores -= 2;
            System.out.println(repeat(".", dots) + "\\\\" + repeat("_", undersCores) + "//" + repeat(".", dots));
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
