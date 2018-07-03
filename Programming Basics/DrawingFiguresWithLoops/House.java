import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class House {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int stars = 1;
        int dashes = (n - stars) / 2;
        for (int i = 0; i < (n + 1) / 2; i++) {
            if (n % 2 != 0) {
                System.out.println(repeat("-", dashes) + repeat("*", stars) + repeat("-", dashes));
                stars += 2;
                dashes--;
            }
            else{
                System.out.println(repeat("-",dashes) + repeat("*",stars+1) + repeat("-",dashes));
                stars+=2;
                dashes--;
            }
        }
        for (int i = 0; i < n/2; i++) {
            System.out.println(repeat("|",1) + repeat("*",n-2) + repeat("|",1));
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
