import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p01_DailyProfit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int workDays = Integer.parseInt(console.nextLine());
        double moneyInDollar = Double.parseDouble(console.nextLine());
        double exchangeRate = Double.parseDouble(console.nextLine());
        double monthMoney = workDays * moneyInDollar;
        double yearMoney = monthMoney * 12;
        double bonus = monthMoney * 2.5;
        double totalMoney = yearMoney + bonus;
        totalMoney -= totalMoney * 0.25;
        double moneyPerDay = totalMoney / 365;
        double moneyInLeva = moneyPerDay * exchangeRate;
        System.out.printf("%.2f", moneyInLeva);
    }
}
