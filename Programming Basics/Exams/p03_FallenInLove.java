import java.util.Scanner;

/**
 * Created by magix on 4/3/2017.
 */
public class p03_FallenInLove {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int dots = 2 * n;
        int middleDots = 0;
        int consoles = n;
        for (int i = 0; i < n; i++) {
            System.out.println("#" + repeat("~", i) + "#" + repeat(".", dots) + "#" + repeat(".", middleDots) + "#" + repeat(".", dots) + "#" + repeat("~", i) + "#");
            dots -= 2;
            middleDots += 2;
        }
        dots = 1;
        middleDots = 2 * n;
        for (int i = 0; i < n; i++) {
            System.out.println(repeat(".", dots) + "#" + repeat("~", consoles) + "#" + repeat(".", middleDots) + "#" + repeat("~", consoles) + "#" + repeat(".", dots));
            dots += 2;
            consoles--;
            middleDots -= 2;
        }
        dots = 2 * n + 1;
        int hash = 4;
        for (int i = 0; i < n + 1; i++) {
            if(i==0)
            {
                System.out.println(repeat(".",dots) + repeat("#",hash) + repeat(".",dots));
            }else{
                System.out.println(repeat(".",dots+1) + repeat("#",hash-2) + repeat(".",dots+1));
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
