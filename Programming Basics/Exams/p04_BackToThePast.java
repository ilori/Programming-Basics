import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p04_BackToThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = 18;
        double money = Double.parseDouble(console.nextLine());
        double totalMoney = money;
        int year = Integer.parseInt(console.nextLine());
        for (int i = 1800; i <= year; i++) {
            if (i % 2 == 0) {
                totalMoney -= 12000;
            } else {
                totalMoney -= 12000 + age * 50;
            }
            age++;
        }
        if (totalMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", totalMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(totalMoney));
        }
    }
}
