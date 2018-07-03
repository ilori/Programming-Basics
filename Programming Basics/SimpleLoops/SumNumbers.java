import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            totalSum += num;
        }
        System.out.println(totalSum);
    }
}
