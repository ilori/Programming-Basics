import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int loop = Integer.parseInt(console.nextLine());
        double oddMax = Integer.MIN_VALUE, oddMin = Integer.MAX_VALUE, oddSum = 0, evenMax = Integer.MIN_VALUE, evenMin = Integer.MAX_VALUE, evenSum = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        for (int i = 1; i <= loop; i++) {
            double userNum = Double.parseDouble(console.nextLine());
            if (i % 2 != 0) {
                oddSum += userNum;
                if (oddMax < userNum) {
                    oddMax = userNum;
                }
                if (oddMin > userNum) {
                    oddMin = userNum;
                }
            } else {
                evenSum += userNum;
                if (evenMax < userNum) {
                    evenMax = userNum;
                }
                if (evenMin > userNum) {
                    evenMin = userNum;
                }
            }
        }
        if (loop == 1) {
            System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n%s%n%s", "OddSum=", df.format(oddSum), "OddMin=", df.format(oddMin), "OddMax=", df.format(oddMax), "EvenSum=", df.format(evenSum), "EvenMin=No", "EvenMax=No");
        } else if (loop == 0) {
            System.out.printf("%s%s%n%s%n%s%n%s%s%n%s%n%s", "OddSum=", df.format(oddSum), "OddMin=No", "OddMax=No", "EvenSum=", df.format(evenSum), "EvenMin=No", "EvenMax=No");
        } else {
            System.out.printf("%s%s%n%s%s%n%s%s%n%s%s%n%s%s%n%s%s", "OddSum=", df.format(oddSum), "OddMin=", df.format(oddMin), "OddMax=", df.format(oddMax), "EvenSum=", df.format(evenSum), "EvenMin=", df.format(evenMin), "EvenMax=", df.format(evenMax));
        }
    }
}
