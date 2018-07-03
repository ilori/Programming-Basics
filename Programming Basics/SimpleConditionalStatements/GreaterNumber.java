import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num1 = Double.parseDouble(console.nextLine());
        double num2 = Double.parseDouble(console.nextLine());
        if (num1 > num2) {
            System.out.printf("%f", num1);
        } else {
            System.out.printf("%f", num2);
        }
    }
}
