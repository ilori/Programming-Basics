import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_Pets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        double foodInKg = Double.parseDouble(console.nextLine());
        double dogFood = Double.parseDouble(console.nextLine()) * days;
        double catFood = Double.parseDouble(console.nextLine()) * days;
        double turtleFood = Double.parseDouble(console.nextLine()) / 1000 * days;
        double totalFood = dogFood + catFood + turtleFood;
        if (totalFood <= foodInKg) {

            double total = Math.floor(Math.abs(totalFood - foodInKg));
            BigDecimal bd = new BigDecimal(total);
            System.out.printf("%.0f kilos of food left.", bd);
        } else {
            double total = Math.ceil(Math.abs(totalFood - foodInKg));
            BigDecimal bd = new BigDecimal(total);
            System.out.printf("%.0f more kilos of food are needed.", bd);
        }
    }
}
