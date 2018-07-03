import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_FlowerShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double mag = Double.parseDouble(console.nextLine()) * 3.25;
        double zumb = Double.parseDouble(console.nextLine()) * 4.0;
        double rose = Double.parseDouble(console.nextLine()) * 3.5;
        double kaktus = Double.parseDouble(console.nextLine()) * 8.0;
        double total = mag + zumb + rose + kaktus;
        total = total - (total * 0.05);
        double price = Double.parseDouble(console.nextLine());
        DecimalFormat dm = new DecimalFormat("#.##");
        double notEnough = Math.ceil(price - total);
        double enough = Math.floor(total - price);
        if (total >= price) {
            System.out.printf("She is left with %s leva.", dm.format(enough));
        } else
            System.out.printf("She will have to borrow %s leva.", dm.format(notEnough));

    }
}
