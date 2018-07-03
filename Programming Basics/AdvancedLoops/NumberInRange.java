import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class NumberInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        while (n < 1 || n > 100) {
            System.out.println("Enter a number in range [1...100]:");
            System.out.println("Invalid number!");
            n = console.nextInt();
        }
        System.out.println("The number is: " + n);

    }
}
