import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_Flowers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int chrysanthemum = Integer.parseInt(console.nextLine());
        int roses = Integer.parseInt(console.nextLine());
        int tulips = Integer.parseInt(console.nextLine());
        String season = console.nextLine().toLowerCase();
        boolean isHoliday = console.nextLine().equals("Y");
        int totalFlowers = chrysanthemum + roses + tulips;
        double totalMoney = 0;
        if (season.equals("summer") || season.equals("spring")) {
            double chrysanthemumPrice = chrysanthemum * 2;
            double rosesPrice = roses * 4.1;
            double tulipsPrice = tulips * 2.5;
            if (isHoliday) {
                chrysanthemumPrice += chrysanthemumPrice * 0.15;
                rosesPrice += rosesPrice * 0.15;
                tulipsPrice += tulipsPrice * 0.15;
            }
            totalMoney = chrysanthemumPrice + rosesPrice + tulipsPrice;
        } else if (season.equals("winter") || season.equals("autumn")) {
            double chrysanthemumPrice = chrysanthemum * 3.75;
            double rosesPrice = roses * 4.5;
            double tulipsPrice = tulips * 4.15;
            if (isHoliday) {
                chrysanthemumPrice += chrysanthemumPrice * 0.15;
                rosesPrice += rosesPrice * 0.15;
                tulipsPrice += tulipsPrice * 0.15;
            }
            totalMoney = chrysanthemumPrice + rosesPrice + tulipsPrice;
        }
        if (tulips > 7 && season.equals("spring")) {
            totalMoney -= totalMoney * 0.05;
        }
        if (roses >= 10 && season.equals("winter")) {
            totalMoney -= totalMoney * 0.1;
        }
        if (totalFlowers > 20) {
            totalMoney -= totalMoney * 0.2;
        }
        System.out.printf("%.2f", totalMoney + 2);
    }
}
