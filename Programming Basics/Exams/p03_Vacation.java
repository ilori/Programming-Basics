import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int olderPeople = Integer.parseInt(console.nextLine());
        int youngPeople = Integer.parseInt(console.nextLine());
        int nights = Integer.parseInt(console.nextLine());
        String transport = console.nextLine().toLowerCase();
        switch (transport) {
            case "train":
                if (olderPeople + youngPeople < 50) {
                    double tripPrice = (olderPeople * 24.99 + youngPeople * 14.99) * 2;
                    double nightsPrice = nights * 82.99;
                    double commission = (tripPrice + nightsPrice) * 0.1;
                    double totalPrice = tripPrice + nightsPrice + commission;
                    System.out.printf("%.2f", totalPrice);
                } else {
                    double tripPrice = ((olderPeople * 24.99 + youngPeople * 14.99) * 0.5) * 2;
                    double nightsPrice = nights * 82.99;
                    double commission = (tripPrice + nightsPrice) * 0.1;
                    double totalPrice = tripPrice + nightsPrice + commission;
                    System.out.printf("%.2f", totalPrice);
                }
                break;
            case "bus": {
                double tripPrice = (olderPeople * 32.50 + youngPeople * 28.50) * 2;
                double nightsPrice = nights * 82.99;
                double commission = (tripPrice + nightsPrice) * 0.1;
                double totalPrice = tripPrice + nightsPrice + commission;
                System.out.printf("%.2f", totalPrice);
                break;
            }
            case "boat": {
                double tripPrice = (olderPeople * 42.99 + youngPeople * 39.99) * 2;
                double nightsPrice = nights * 82.99;
                double commission = (tripPrice + nightsPrice) * 0.1;
                double totalPrice = tripPrice + nightsPrice + commission;
                System.out.printf("%.2f", totalPrice);
                break;
            }
            case "airplane": {
                double tripPrice = (olderPeople * 70.00 + youngPeople * 50.00) * 2;
                double nightsPrice = nights * 82.99;
                double commission = (tripPrice + nightsPrice) * 0.1;
                double totalPrice = tripPrice + nightsPrice + commission;
                System.out.printf("%.2f", totalPrice);
                break;
            }
        }

    }
}
