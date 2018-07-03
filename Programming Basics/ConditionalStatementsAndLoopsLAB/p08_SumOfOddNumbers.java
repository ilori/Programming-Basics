import java.util.Scanner;

/**
 * Created by magix on 5/24/2017.
 */
public class p08_SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        for (int i = 1; i <= n * 2; i += 2) {
            System.out.println(i);
            sum+=i;
        }
        System.out.printf("Sum: %d",sum);
    }
}
