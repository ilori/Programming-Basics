import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class MaxNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int userNum = Integer.parseInt(console.nextLine());
            if (userNum > max){
                max = userNum;
            }

        }
        System.out.println(max);
    }
}
