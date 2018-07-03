import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p01_VegetableMarket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double moneyVegetables = Double.parseDouble(scan.nextLine());
        double moneyFruits = Double.parseDouble(scan.nextLine());
        int kgVegetables = Integer.parseInt(scan.nextLine());
        int kgFruits = Integer.parseInt(scan.nextLine());
        double euro = 1.94;
        double total = (moneyVegetables*kgVegetables+moneyFruits*kgFruits)/euro;
        System.out.printf("%.13f",total);
    }
}
