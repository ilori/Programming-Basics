import java.util.Scanner;

/**
 * Created by magix on 5/24/2017.
 */
public class p12_NumberChecker {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        try {
            int n = Integer.parseInt(console.nextLine());
            System.out.printf("It is a number.");
        }catch (Exception ex)
        {
            System.out.printf("Invalid input!");
        }
    }
}
