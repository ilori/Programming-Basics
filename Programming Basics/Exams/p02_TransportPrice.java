import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p02_TransportPrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int km = Integer.parseInt(console.nextLine());
        String time = console.nextLine();
        double dayTaxi = 0.70 + (0.79 * km);
        double dayBus = 0.09 * km;
        double dayTrain = 0.06 * km;
        double nightTaxi = 0.70 + (0.90 * km);
        double nightBus = dayBus;
        double nightTrain = dayTrain;
        if (km > 1 && km < 5000) {
            if (time.equals("day") || time.equals("DAY") || time.equals("Day")) {
                if (km < 20) {
                    System.out.printf("%.2f", dayTaxi);
                }
                if (km < 100 && km >= 20) {
                    if (dayTaxi < dayBus) {
                        System.out.printf("%.2f", dayTaxi);
                    } else {
                        System.out.printf("%.2f", dayBus);
                    }
                }
                if (km >= 100) {
                    if (dayTaxi < dayBus && dayTaxi < dayTrain) {
                        System.out.printf("%.2f", dayTaxi);
                    }
                    if (dayBus < dayTaxi && dayBus < dayTrain) {
                        System.out.printf("%.2f", dayBus);
                    } else {
                        System.out.printf("%.2f", dayTrain);
                    }
                }
            }
            if (time.equals("night") || time.equals("NIGHT") || time.equals("Night")) {
                if (km < 20) {
                    System.out.printf("%.2f", nightTaxi);
                }
                if (km >= 20 && km < 100) {
                    if (nightTaxi < nightBus) {
                        System.out.printf("%.2f", nightTaxi);
                    } else {
                        System.out.printf("%.2f", nightBus);
                    }
                }
                if (km >= 100) {
                    if (nightTaxi < nightBus && nightTaxi < nightTrain) {
                        System.out.printf("%.2f", nightTaxi);
                    }
                    if (nightBus < nightTaxi && nightBus < nightTrain) {
                        System.out.printf("%.2f", nightBus);
                    } else {
                        System.out.printf("%.2f", nightTrain);
                    }
                }
            }
        }
    }
}
