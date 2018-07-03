import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 05-Mar-17.
 */
public class p01_HungryGarfield {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        BigDecimal money = new BigDecimal(console.nextLine());
        BigDecimal exchangeRate = new BigDecimal(console.nextLine());
        BigDecimal pizzaPriceLv = new BigDecimal(console.nextLine());
        BigDecimal lasagnaPriceLv = new BigDecimal(console.nextLine());
        BigDecimal sandwichPriceLv = new BigDecimal(console.nextLine());
        BigDecimal pizzaQuantity = new BigDecimal(console.nextLine());
        BigDecimal lasagnaQuantity = new BigDecimal(console.nextLine());
        BigDecimal sandwichQuantity = new BigDecimal(console.nextLine());

        BigDecimal totalCost = pizzaPriceLv.multiply(pizzaQuantity);
        totalCost = totalCost.add(lasagnaPriceLv.multiply(lasagnaQuantity));
        totalCost = totalCost.add(sandwichPriceLv.multiply(sandwichQuantity));
        totalCost = totalCost.divide(exchangeRate, 2, BigDecimal.ROUND_HALF_UP);

        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal moneyLeft = money.subtract(totalCost);
        if (moneyLeft.compareTo(BigDecimal.ZERO) >= 0) {
            System.out.printf("Garfield is well fed, John is awesome. Money left: $%s.%n", df.format(moneyLeft));
        } else {
            System.out.printf("Garfield is hungry. John is a badass. Money needed: $%s.%n", df.format(moneyLeft.abs()));
        }
    }
}
