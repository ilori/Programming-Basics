import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p03_HotelRoom {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String month = console.nextLine().toLowerCase();
        int days = Integer.parseInt(console.nextLine());
        if (month.equals("may") || month.equals("october")) {
            double studio = 50;
            double apartment = 65;
            if (days > 7 && days <= 14) {
                studio = studio - (studio * 0.05);
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            } else if (days > 14) {
                studio = studio - (studio * 0.3);
                apartment = apartment - (apartment * 0.1);
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            }
            else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            }
        }
        if (month.equals("june") || month.equals("september")) {
            double studio = 75.20;
            double apartment = 68.70;
            if (days > 14) {
                studio = studio - (studio * 0.2);
                apartment = apartment - (apartment * 0.1);
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            } else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            }
        }
        if (month.equals("july") || month.equals("august")) {
            double studio = 76;
            double apartment = 77;
            if (days > 14) {
                apartment = apartment - (apartment * 0.1);
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);
            } else {
                System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", apartment * days, studio * days);

            }
        }
    }
}
