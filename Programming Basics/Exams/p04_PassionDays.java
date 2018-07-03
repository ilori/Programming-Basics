import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by magix on 4/3/2017.
 */
public class p04_PassionDays {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double moneyForLisa = Double.parseDouble(console.nextLine());
        double moneyLisa = moneyForLisa;
        BigDecimal bd = new BigDecimal(moneyForLisa);
        String command = console.nextLine();
        int purchases = 0;
        while (!(command.equals("mall.Enter"))) {
            command = console.nextLine();
        }
        command = console.nextLine();
        while (!(command.equals("mall.Exit"))) {
            String buying = command;
            for (int i = 0; i < buying.length(); i++) {
                if (buying.charAt(i) >= 65 && buying.charAt(i) <= 90) {
                    if (moneyForLisa - (buying.charAt(i) - (buying.charAt(i) * 0.5)) >= 0) {
                        moneyForLisa -= buying.charAt(i) - (buying.charAt(i) * 0.5);
                        purchases++;
                    }
                } else if (buying.charAt(i) >= 97 && buying.charAt(i) <= 122) {
                    if (moneyForLisa - (buying.charAt(i) - (buying.charAt(i) * 0.7)) >= 0) {
                        moneyForLisa -= buying.charAt(i) - (buying.charAt(i) * 0.7);
                        purchases++;
                    }
                } else if (buying.charAt(i) == 37) {
                    if (moneyForLisa > 0) {
                        moneyForLisa /= 2;
                        purchases++;
                    }
                } else if (buying.charAt(i) == 42) {
                    moneyForLisa += 10;
                    moneyLisa += 10;
                } else {
                    if (moneyForLisa - buying.charAt(i) >= 0) {
                        moneyForLisa -= buying.charAt(i);
                        purchases++;
                    }
                }
            }
            command = console.nextLine();
        }
        if (purchases > 0) {
            System.out.printf("%d purchases. Money left: %.2f lv.", purchases, moneyForLisa);

        } else {
            System.out.printf("No purchases. Money left: %.2f lv.", moneyLisa + purchases * 10);
        }
    }

}
