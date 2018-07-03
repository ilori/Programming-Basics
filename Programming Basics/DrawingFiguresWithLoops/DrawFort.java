import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class DrawFort {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int smilie = n / 2;
        int sideSlashes = 4;
        int down = n * 2 - smilie * 2 - sideSlashes;
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat("/", 1) + repeat("^", smilie) + "\\" + repeat("_", down) + "/" + repeat("^", smilie) + "\\");
        }
        for (int i = 0; i < n - 3; i++) {
            System.out.println(repeat("|", 1) + repeat(" ", n * 2 - 2) + repeat("|", 1));

        }
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat("|", 1) + repeat(" ", smilie + 1) + repeat("_", down) + repeat(" ", smilie + 1) + repeat("|", 1));
        }
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat("\\", 1) + repeat("_", smilie) + "/" + repeat(" ", down) + "\\" + repeat("_", smilie) + "/");
        }

    }


    public static String repeat(String text, int count) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < count; i++) {
            output.append(text);
        }
        return output.toString();
    }
}

