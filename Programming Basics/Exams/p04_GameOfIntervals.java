import java.util.Scanner;

/**
 * Created by magix on 4/12/2017.
 */
public class p04_GameOfIntervals {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int range = Integer.parseInt(console.nextLine());
        double ten = 0.0;
        double twenty = 0;
        double thirty = 0;
        double forty = 0;
        double fifty = 0;
        double invalid = 0;
        double points = 0;
        for (int i = 0; i < range; i++) {
            int number = Integer.parseInt(console.nextLine());
            if (number >= 0 && number < 10) {
                points += number * 20 / 100.0;
                ten++;
            } else if (number >= 10 && number < 20) {
                points += number * 30 / 100.0;
                twenty++;
            } else if (number >= 20 && number < 30) {
                points += number * 40 / 100.0;
                thirty++;
            } else if (number >= 30 && number < 40) {
                points += 50;
                forty++;
            } else if (number >= 40 && number <= 50) {
                points += 100;
                fifty++;
            } else {
                points /= 2;
                invalid++;
            }
        }
        System.out.printf("%.2f%n", points);
        System.out.printf("From 0 to 9: %.2f%%%n", ten/range * 100);
        System.out.printf("From 10 to 19: %.2f%%%n", twenty/range * 100);
        System.out.printf("From 20 to 29: %.2f%%%n", thirty/range * 100);
        System.out.printf("From 30 to 39: %.2f%%%n", forty/range * 100);
        System.out.printf("From 40 to 50: %.2f%%%n", fifty/range * 100);
        System.out.printf("Invalid numbers: %.2f%%%n", invalid/range * 100);

    }
}
