import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p01_Money {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double bitcoin = Integer.parseInt(console.nextLine()) * 1168;
        double chineseYun = Double.parseDouble(console.nextLine()) * 0.15 * 1.76;
        double commission = Double.parseDouble(console.nextLine());
        double totalMoneyInEuro = (bitcoin + chineseYun) / 1.95;
        totalMoneyInEuro = totalMoneyInEuro - (commission / 100 * totalMoneyInEuro);
        System.out.println(totalMoneyInEuro);
    }
}
