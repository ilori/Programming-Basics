import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p04_Logistics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int total = 0;
        double bus = 0;
        double truck = 0;
        double train = 0;
        for (int i = 0; i < n; i++) {
            int times = Integer.parseInt(console.nextLine());
            total += times;
            if (times > 0 && times <= 3) {
                bus += times;
            } else if (times >= 4 && times <= 11) {
                truck += times;
            } else if (times >= 12) {
                train += times;
            }
        }
        double percentBus = (bus / total) * 100;
        double percentTrain = (train / total) * 100;
        double percentTruck = (truck / total) * 100;
        bus *= 200;
        truck *= 175;
        train *= 120;
        double avaragePrice = (bus + truck + train) / total;
        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%",avaragePrice,percentBus,percentTruck,percentTrain);
    }
}
