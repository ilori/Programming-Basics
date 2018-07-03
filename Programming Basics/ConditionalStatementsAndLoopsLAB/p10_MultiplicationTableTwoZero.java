import java.util.Scanner;

/**
 * Created by magix on 5/24/2017.
 */
public class p10_MultiplicationTableTwoZero {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int times = Integer.parseInt(console.nextLine());
        if (times > 10) {
            System.out.printf("%d X %d = %d", n, times, n * times);
        } else {
            for (int i = times; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n",n,i,n*i);
            }
        }
    }
}
