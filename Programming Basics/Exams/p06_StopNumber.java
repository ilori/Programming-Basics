import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p06_StopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int stopNumber = Integer.parseInt(console.nextLine());
        for (int i = secondNumber; i >= firstNumber; i--) {
            if (i == stopNumber && stopNumber % 2 == 0 && stopNumber % 3 == 0) {
                break;
            }
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
