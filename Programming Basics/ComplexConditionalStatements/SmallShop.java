import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        product = product.toLowerCase();
        String city = console.nextLine();
        city = city.toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        if (city.equals("sofia")) {
            if (product.equals("coffee")) {
                System.out.println(0.50 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.80 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.20 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.45 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.60 * quantity);
            }
        } else if (city.equals("plovdiv")) {
            if (product.equals("coffee")) {
                System.out.println(0.40 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.15 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.30 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.50 * quantity);
            }
        } else if (city.equals("varna")) {
            if (product.equals("coffee")) {
                System.out.println(0.45 * quantity);
            }
            if (product.equals("water")) {
                System.out.println(0.70 * quantity);
            }
            if (product.equals("beer")) {
                System.out.println(1.10 * quantity);
            }
            if (product.equals("sweets")) {
                System.out.println(1.35 * quantity);
            }
            if (product.equals("peanuts")) {
                System.out.println(1.55 * quantity);
            }
        }
    }
}
