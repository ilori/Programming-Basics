import java.util.Scanner;

/**
 * Created by magix on 4/15/2017.
 */
public class p02_Styrofoam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double budget = Double.parseDouble(console.nextLine());
        double houseArea = Double.parseDouble(console.nextLine());
        double windows = Double.parseDouble(console.nextLine()) * 2.4;
        double styrofoam = Double.parseDouble(console.nextLine());
        double styrofoamPrice = Double.parseDouble(console.nextLine());
        houseArea = houseArea - windows;
        houseArea += houseArea * 0.1;
        double packets = Math.ceil(houseArea / styrofoam) * styrofoamPrice;
        if(packets<=budget)
        {
            System.out.printf("Spent: %.2f\nLeft: %.2f",packets,budget-packets);
        }else {
            System.out.printf("Need more: %.2f",Math.abs(budget-packets));
        }
    }
}
