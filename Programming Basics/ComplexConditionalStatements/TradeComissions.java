import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TradeComissions {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = console.nextLine().toLowerCase();
        double sales = Double.parseDouble(console.nextLine());
        if (city.equals("sofia") || city.equals("plovdiv") || city.equals("varna")) {
            if (sales >= 0 && sales <= 500) {
                if (city.equals("sofia")) {
                    System.out.printf("%.2f", sales * 0.05);
                }
                if (city.equals("varna")) {
                    System.out.printf("%.2f", sales * 0.045);
                }
                if (city.equals("plovdiv")) {
                    System.out.printf("%.2f", sales * 0.055);
                }
            } else if (sales > 500 && sales <= 1000) {
                if (city.equals("sofia")) {
                    System.out.printf("%.2f", sales * 0.07);
                }
                if (city.equals("plovdiv")) {
                    System.out.printf("%.2f", sales * 0.08);
                }
                if (city.equals("varna")) {
                    System.out.printf("%.2f", sales * 0.075);
                }
            } else if (sales > 1000 && sales <= 10000) {
                if (city.equals("sofia")) {
                    System.out.printf("%.2f", sales * 0.08);
                }
                if (city.equals("plovdiv")) {
                    System.out.printf("%.2f", sales * 0.12);
                }
                if (city.equals("varna")) {
                    System.out.printf("%.2f", sales * 0.1);
                }
            } else if (sales > 10000) {
                if (city.equals("sofia")) {
                    System.out.printf("%.2f", sales * 0.12);
                }
                if (city.equals("plovdiv")) {
                    System.out.printf("%.2f", sales * 0.145);
                }
                if (city.equals("varna")) {
                    System.out.printf("%.2f", sales * 0.13);
                }
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
