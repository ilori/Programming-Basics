import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = 0;
        while (true) {
            try {
                System.out.println("Enter even number: ");
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0) {
                    break;
                }
                System.out.println("The number is not even.");
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number.");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
