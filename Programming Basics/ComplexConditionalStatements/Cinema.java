import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String projection = console.nextLine().toLowerCase();
        int rows = Integer.parseInt(console.nextLine());
        int cols = Integer.parseInt(console.nextLine());
        double totalMoney;
        double premiere = 12.00;
        double normal = 7.50;
        double discount = 5.00;
        if (projection.equals("premiere")) {
            totalMoney = (rows * cols) * premiere;
            System.out.printf("%.2f leva", totalMoney);
        }
        if (projection.equals("normal")) {
            totalMoney = (rows * cols) * normal;
            System.out.printf("%.2f leva", totalMoney);
        }
        if (projection.equals("discount")) {
            totalMoney = (rows * cols) * discount;
            System.out.printf("%.2f leva", totalMoney);
        }
    }
}
