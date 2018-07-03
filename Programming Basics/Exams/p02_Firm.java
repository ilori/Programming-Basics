import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_Firm {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        double daysForWork = days - (days * 0.1);
        double hoursForWork = daysForWork * 8;
        double overtimeHours = workers * (2 * days);
        double totalHours = (int) Math.floor(hoursForWork + overtimeHours);
        if (totalHours >= hours) {
            System.out.printf("Yes!%d hours left.", (int) totalHours - hours);
        } else {
            System.out.printf("Not enough time!%d hours needed.", (int) Math.abs(totalHours - hours));
        }
    }
}
