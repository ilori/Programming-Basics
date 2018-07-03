import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p03_OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum1 = Integer.parseInt(console.nextLine());
        int userNum2 = Integer.parseInt(console.nextLine());
        String mathOperation = console.nextLine().toLowerCase();
        if (mathOperation.equals("+")) {
            int total = userNum1 + userNum2;
            if (total % 2 == 0) {
                System.out.printf("%d + %d = %d - even", userNum1, userNum2, total);
            } else {
                System.out.printf("%d + %d = %d - odd", userNum1, userNum2, total);
            }
        } else if (mathOperation.equals("-")) {
            int total = userNum1 - userNum2;
            if (total % 2 == 0) {
                System.out.printf("%d - %d = %d - even", userNum1, userNum2, total);
            } else {
                System.out.printf("%d - %d = %d - odd", userNum1, userNum2, total);

            }
        } else if (mathOperation.equals("*")) {
            int total = userNum1 * userNum2;
            if (total % 2 == 0) {
                System.out.printf("%d * %d = %d - even", userNum1, userNum2, total);
            } else {
                System.out.printf("%d * %d = %d - odd", userNum1, userNum2, total);
            }
        } else if (mathOperation.equals("/")) {
            double total = (double) userNum1 / userNum2;
            if (userNum1 == 0) {
                System.out.printf("Cannot divide %d by zero", userNum2);
            } else if (userNum2 == 0) {
                System.out.printf("Cannot divide %d by zero", userNum1);
            } else {
                System.out.printf("%d / %d = %.2f", userNum1, userNum2, total);
            }
        } else if (mathOperation.equals("%")) {
            double total = (double) userNum1 % userNum2;
            if (userNum1 == 0) {
                System.out.printf("Cannot divide %d by zero", userNum2);
            } else if (userNum2 == 0) {
                System.out.printf("Cannot divide %d by zero", userNum1);
            } else {
                System.out.printf("%d %s %d = %.0f", userNum1,"%", userNum2, total);
            }
        }
    }
}
