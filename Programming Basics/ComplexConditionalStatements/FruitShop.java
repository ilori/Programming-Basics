import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine().toLowerCase();
        String day = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        if (day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
            if (fruit.equals("banana")) {
                System.out.println(quantity * 2.50);
            }
            if (fruit.equals("app   le")) {
                System.out.println(quantity * 1.20);
            }
            if (fruit.equals("orange")) {
                System.out.println(quantity * 0.85);
            }
            if (fruit.equals("grapefruit")) {
                System.out.println(quantity * 1.45);
            }
            if (fruit.equals("kiwi")) {
                System.out.println(quantity * 2.70);
            }
            if (fruit.equals("pineapple")) {
                System.out.println(quantity * 5.50);
            }
            if (fruit.equals("grapes")) {
                System.out.println(quantity * 3.85);
            }
        }
        if (day.equals("saturday") || day.equals("sunday")) {
            if (fruit.equals("banana")) {
                System.out.println(quantity * 2.70);
            }
            if (fruit.equals("apple")) {
                System.out.println(quantity * 1.25);
            }
            if (fruit.equals("orange")) {
                System.out.println(quantity * 0.90);
            }
            if (fruit.equals("grapefruit")) {
                System.out.println(quantity * 1.60);
            }
            if (fruit.equals("kiwi")) {
                System.out.println(quantity * 3.00);
            }
            if (fruit.equals("pineapple")) {
                System.out.println(quantity * 5.60);
            }
            if (fruit.equals("grapes")) {
                System.out.println(quantity * 4.20);
            }
        } else {
            System.out.println("error");
        }
    }
}
