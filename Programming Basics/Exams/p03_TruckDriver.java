import java.util.Scanner;

/**
 * Created by magix on 4/16/2017.
 */
public class p03_TruckDriver {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String season = console.nextLine().toLowerCase();
        double kilometersPerMonth = Double.parseDouble(console.nextLine());
        double pricePerKilometer = 0;
        if (season.equals("spring") || season.equals("autumn")) {
            if (kilometersPerMonth <= 5000) {
                pricePerKilometer = 0.75;
            } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {
                pricePerKilometer = 0.95;
            } else {
                pricePerKilometer = 1.45;
            }
        } else if (season.equals("summer")) {
            if (kilometersPerMonth <= 5000) {
                pricePerKilometer = 0.90;
            } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {
                pricePerKilometer = 1.10;
            } else {
                pricePerKilometer = 1.45;
            }
        } else {
            if (kilometersPerMonth <= 5000) {
                pricePerKilometer = 1.05;
            } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {
                pricePerKilometer = 1.25;
            } else {
                pricePerKilometer = 1.45;
            }
        }
        double totalMoney = kilometersPerMonth * pricePerKilometer * 4;
        totalMoney -= totalMoney * 0.10;
        System.out.printf("%.2f",totalMoney);
    }
}
