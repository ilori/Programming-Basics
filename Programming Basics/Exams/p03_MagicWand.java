import java.util.Scanner;

/**
 * Created by magix on 03-Mar-17.
 */
public class p03_MagicWand {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int width = 3 * n + 2;
        int lefDots = (width - 1) / 2;
        int rightDots = (width - 1) / 2;
        int middleDots = 1;
        for (int i = 0; i < 1; i++) {
            System.out.println(repeat(".", lefDots) + "*" + repeat(".", rightDots));
        }
        for (int i = 0; i <= n; i+=2) {
            lefDots--;
            rightDots--;
            System.out.println(repeat(".", lefDots) + "*" + repeat(".", middleDots) + "*" + repeat(".",rightDots));
            middleDots+=2;
            if(i==n-1)
            {
                System.out.println(repeat("*",lefDots) + repeat(".",middleDots) + repeat("*",rightDots));
            }
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
