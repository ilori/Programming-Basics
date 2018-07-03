import java.util.Scanner;

/**
 * Created by magix on 5/24/2017.
 */
public class p09_MultiplicationTable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n",n,i,n*i);
        }
    }
}
