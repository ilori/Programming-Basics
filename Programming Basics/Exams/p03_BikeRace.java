import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_BikeRace {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int juniors = Integer.parseInt(console.nextLine());
        int seniors = Integer.parseInt(console.nextLine());
        String roadType = console.nextLine().toLowerCase();
        double totalMoney = 0;
        if (roadType.equals("trail")) {
            totalMoney = juniors * 5.50 + seniors * 7;
            totalMoney -= totalMoney * 0.05;
            System.out.printf("%.2f", totalMoney);
        } else if (roadType.equals("downhill")) {
            totalMoney = juniors * 12.25 + seniors * 13.75;
            totalMoney -= totalMoney * 0.05;
            System.out.printf("%.2f", totalMoney);
        } else if (roadType.equals("road")) {
            totalMoney = juniors * 20 + seniors * 21.50;
            totalMoney -= totalMoney * 0.05;
            System.out.printf("%.2f", totalMoney);
        } else if (roadType.equals("cross-country")) {
            if (juniors + seniors >= 50) {
                totalMoney = juniors * 8 + seniors * 9.50;
                totalMoney -= totalMoney * 0.25;
                totalMoney -= totalMoney * 0.05;
                System.out.printf("%.2f", totalMoney);
            } else {
                totalMoney = juniors * 8 + seniors * 9.50;
                totalMoney -= totalMoney * 0.05;
                System.out.printf("%.2f", totalMoney);
            }
        }
    }
}
