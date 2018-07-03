import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class BonusScore {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        double total;
        double bonus;
        if (num <= 100) {
            if (num % 2 == 0) {
                bonus = 6;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 2 != 0 && num % 5 != 0) {
                bonus = 5;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 5 == 0 && num % 2 != 0) {
                bonus = 7;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
        }
        if (num > 100 && num < 1000) {
            if (num % 2 == 0) {
                bonus = 0.2 * num + 1;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 2 != 0 && num % 5 != 0) {
                bonus = 0.2 * num;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 5 == 0 && num % 2 != 0) {
                bonus = 0.2 * num + 2;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
        }
        if (num > 1000) {
            if (num % 2 == 0) {
                bonus = 0.1 * num + 1;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 2 != 0 && num % 5 != 0) {
                bonus = 0.1 * num;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
            if (num % 5 == 0 && num % 2 != 0) {
                bonus = 0.1 * num + 2;
                total = bonus + num;
                System.out.printf("%.1f%n%.1f%n", bonus, total);
            }
        }
    }
}
