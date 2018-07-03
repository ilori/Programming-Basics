import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SquareFrame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int times = Integer.parseInt(console.nextLine());
        System.out.println("+" + repeat(" -",times-2) + " +");
        for (int i = 0; i <times-2 ; i++) {
            System.out.println("|" + repeat(" -",times-2) + " |");
        }
        System.out.println("+" + repeat(" -",times-2) + " +");
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
