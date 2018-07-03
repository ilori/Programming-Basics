import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int loop = Integer.parseInt(console.nextLine());
        int maxValue = Integer.MIN_VALUE;
        int sumValue = 0;


        for (int i = 0; i < loop; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            sumValue += userNumber;
            if (userNumber > maxValue) {
                maxValue = userNumber;
            }
        }
        if ((Math.abs(maxValue - sumValue)) == maxValue) {
            System.out.println("Yes Sum = " + maxValue);
        } else {
            System.out.println("No Diff = " + Math.abs((sumValue - maxValue) - maxValue));
        }
    }
}
