import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p04_Histogram {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        for (int i = 0; i < n; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            if (userNumber < 200) {
                p1++;
            } else if (userNumber >= 200 && userNumber <= 399) {
                p2++;
            } else if (userNumber >= 400 && userNumber <= 599) {
                p3++;
            } else if (userNumber >= 600 && userNumber <= 799) {
                p4++;
            } else {
                p5++;
            }
        }
        double p1Percent = (double) p1 * 100 / n;
        double p2Percent = (double) p2 * 100 / n;
        double p3Percent = (double) p3 * 100 / n;
        double p4Percent = (double) p4 * 100 / n;
        double p5Percent = (double) p5 * 100 / n;
        System.out.printf("%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s%n%.2f%s", p1Percent, "%", p2Percent, "%", p3Percent, "%", p4Percent, "%", p5Percent, "%");
    }
}
