import java.util.Scanner;

/**
 * Created by magix on 4/16/2017.
 */
public class p04_Bills {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int months = Integer.parseInt(console.nextLine());
        double electricityPrice = 0;
        double waterPrice = 20;
        double internetPrice = 15;
        double other = 0;
        double otherPrice = 0;
        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(console.nextLine());
            electricityPrice += electricity;
            other = (electricity + waterPrice + internetPrice);
            other += other * 0.20;
            otherPrice += other;
        }
        waterPrice *= months;
        internetPrice *= months;
        double average = (electricityPrice + waterPrice + internetPrice + otherPrice) / months;
        System.out.printf("Electricity: %.2f lv\nWater: %.2f lv\nInternet: %.2f lv\nOther: %.2f lv\nAverage: %.2f lv",electricityPrice,waterPrice,internetPrice,otherPrice,average);
    }
}
