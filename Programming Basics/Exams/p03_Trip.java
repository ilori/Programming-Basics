import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p03_Trip {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double studentBudget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        double totalMoney = 0;
        if (studentBudget <= 100) {
            if (season.equals("summer")) {
                totalMoney = studentBudget * 30 / 100;
                System.out.printf("Somewhere in Bulgaria %nCamp - %.2f", totalMoney);
            } else {
                totalMoney = studentBudget * 70 / 100;
                System.out.printf("Somewhere in Bulgaria %nHotel - %.2f", totalMoney);
            }
        } else if (studentBudget <= 1000 && studentBudget > 100) {
            if (season.equals("summer")) {
                totalMoney = studentBudget * 40 / 100;
                System.out.printf("Somewhere in Balkans %nCamp - %.2f", totalMoney);
            } else {
                totalMoney = studentBudget * 80 / 100;
                System.out.printf("Somewhere in Balkans %nHotel - %.2f", totalMoney);
            }
        } else {
            totalMoney = studentBudget * 90 / 100;
            System.out.printf("Somewhere in Europe %nHotel - %.2f", totalMoney);
        }
    }
}
