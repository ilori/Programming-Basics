import java.util.Scanner;

/**
 * Created by magix on 03-Mar-17.
 */
public class p02_DreamItem {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] n = console.nextLine().split("\\\\");
        String month = n[0];
        double moneyPerHour = Double.parseDouble(n[1]);
        double hoursPerDay = Double.parseDouble(n[2]);
        double itemPrice = Double.parseDouble(n[3]);
        int days;
        switch (month) {
            case "Feb":
                days = 28;
                break;
            case "Apr":
            case "June":
            case "Sept":
            case "Nov":
                days = 30;
                break;
            default:
                days = 31;
                break;
        }
        days-=10;
        double totalMoney = hoursPerDay*moneyPerHour*days;
        if(totalMoney>700)
        {
            totalMoney+=totalMoney*0.1;
        }
        if(totalMoney-itemPrice>=0)
        {
            System.out.printf("Money left = %.2f leva.",totalMoney-itemPrice);
        }else{
            System.out.printf("Not enough money. %.2f leva needed.",itemPrice-totalMoney);
        }
    }
}