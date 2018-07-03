import java.util.Scanner;

/**
 * Created by magix on 4/12/2017.
 */
public class p05_SoftUniLogo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int height = 4 * n - 2;
        int width = 12 * n - 5;
        int dots = (width - 1) / 2;
        for (int i = 0; i < height / 2 + 1; i++) {
            System.out.println(repeat(".", dots) + repeat("#", width - dots * 2) + repeat(".", dots));
            dots -= 3;
        }
        dots = 3;
        for (int i = 0; i < height - (height / 2 + 1 + n); i++) {
            System.out.println("|" + repeat(".", dots - 1) + repeat("#", width - dots * 2) + repeat(".", dots));
            dots += 3;
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1)
            {
                System.out.println("@" + repeat(".",dots-1) + repeat("#",width-dots*2) + repeat(".",dots));
            }else{
                System.out.println("|" + repeat(".",dots-1) + repeat("#",width-dots*2) + repeat(".",dots));
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
