import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class MinNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int userNum = Integer.parseInt(console.nextLine());
            if (userNum < min) {
                min = userNum;
            }

        }
        System.out.println(min);
    }
}
