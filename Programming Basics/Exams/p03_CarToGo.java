import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by magix on 4/12/2017.
 */
public class p03_CarToGo {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        if (budget <= 100) {
            if (season.equals("winter")) {
                budget = budget * 65 / 100;
                System.out.printf("Economy class%nJeep - %.2f", budget);
            } else if (season.equals("summer")) {
                budget = budget * 35 / 100;
                System.out.printf("Economy class%nCabrio - %.2f", budget);
            }
        } else if (budget > 100 && budget <= 500) {
            if (season.equals("winter")) {
                budget = budget * 80 / 100;
                System.out.printf("Compact class%nJeep - %.2f", budget);
            } else if (season.equals("summer")) {
                budget = budget * 45 / 100;
                System.out.printf("Compact class%nCabrio - %.2f", budget);
            }
        } else if (budget > 500) {
            if (season.equals("winter") || season.equals("summer")) {
                budget = budget * 90 / 100;
                System.out.printf("Luxury class%nJeep - %.2f", budget);
            }
        }
    }
}
