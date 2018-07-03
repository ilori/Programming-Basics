import java.util.Scanner;

/**
 * Created by magix on 5/24/2017.
 */
public class p11_OddNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        while (n % 2 == 0)
        {
            System.out.println("Please write an odd number.");
            n = Integer.parseInt(console.nextLine());
        }
        System.out.printf("The number is: %d",Math.abs(n));
    }
}
