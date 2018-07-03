import java.util.Scanner;

/**
 * Created by magix on 03-Mar-17.
 */
public class p01_CurrencyCheck {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rublesInLeva = (Double.parseDouble(console.nextLine()) / 100) * 3.5;
        double dollarsInLeva = Double.parseDouble(console.nextLine()) * 1.5;
        double euroInLeva = Double.parseDouble(console.nextLine()) * 1.95;
        double bulgarianSiteB = Double.parseDouble(console.nextLine()) / 2.0;
        double bulgarianSiteM = Double.parseDouble(console.nextLine());
        double[] prices = new double[5];
        for (int i = 0; i < 1; i++) {
            prices[i] = rublesInLeva;
            prices[i + 1] = dollarsInLeva;
            prices[i + 2] = euroInLeva;
            prices[i + 3] = bulgarianSiteB;
            prices[i + 4] = bulgarianSiteM;
        }
        double minPrice = Double.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (minPrice >= prices[i]) {
                minPrice = prices[i];
            }
        }
        System.out.printf("%.2f", minPrice);
    }
}
