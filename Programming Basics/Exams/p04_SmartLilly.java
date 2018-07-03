import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p04_SmartLilly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int ageLily = Integer.parseInt(console.nextLine());
        double washingMachinePrice = Double.parseDouble(console.nextLine());
        int toyPrice = Integer.parseInt(console.nextLine());

        int savings = 0;
        int moneyFromToys = 0;
        int moneyForBrother = -1;
        int bonusMoney = 10;
        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 == 0) {
                savings+=bonusMoney;
                savings+=moneyForBrother;
                bonusMoney+=10;
            }else{
                moneyFromToys+=toyPrice;
            }

        }
        int totalMoney = savings + moneyFromToys;
        if (totalMoney >= washingMachinePrice)
        {
            System.out.printf("Yes! %.2f",totalMoney-washingMachinePrice);
        }else
        {
            System.out.printf("No! %.2f",Math.abs(totalMoney-washingMachinePrice));
        }
    }
}
