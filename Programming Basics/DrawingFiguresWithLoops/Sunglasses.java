import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Sunglasses {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int time = Integer.parseInt(console.nextLine());
        ;
        System.out.println(repeat("*", time * 2) + repeat(" ", time) + repeat("*", time * 2));
        for (int i = 0; i < time - 2; i++) {
            System.out.print("*" + repeat("/", 2 * time - 2) + "*");
            if (i != (time - 1) / 2 - 1) {
                System.out.print(repeat(" ", time));
            } else {
                System.out.print(repeat("|", time));
            }
            System.out.print("*" + repeat("/", 2 * time - 2) + "*");
            System.out.println();
        }
        System.out.println(repeat("*", time * 2) + repeat(" ", time) + repeat("*", time * 2));


    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}
