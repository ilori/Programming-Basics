import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class EqualPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int loops = Integer.parseInt(console.nextLine());
        int sumNumbers = 0;
        int[] sumTotal = new int[loops];
        int maxNum = Integer.MIN_VALUE, minNum = Integer.MAX_VALUE;
        int maxDiff = 0;
        int[] maxDiff1 = new int[loops - 1];
        for (int i = 0; i < loops; i++) {
            int userNum1 = Integer.parseInt(console.nextLine());
            int userNum2 = Integer.parseInt(console.nextLine());
            sumNumbers = userNum1 + userNum2;
            sumTotal[i] = sumNumbers;
        }
        for (int i = 0; i < sumTotal.length; i++) {
            if (maxNum < sumTotal[i]) {
                maxNum = sumTotal[i];
            }
        }
        for (int i = 0; i < sumTotal.length; i++) {
            if (minNum > sumTotal[i]) {
                minNum = sumTotal[i];
            }
        }
        if (maxNum == minNum) {
            System.out.println("Yes, value=" + maxNum);
        } else if (sumTotal.length < 3 && sumTotal.length > 1) {
            maxDiff = sumTotal[0] - sumTotal[1];
            System.out.println("No, maxdiff=" + Math.abs(maxDiff));
        } else {
            for (int i = 0; i < loops - 1; i++) {
                maxDiff1[i] = sumTotal[i + 1] - sumTotal[i];
                if (maxDiff < maxDiff1[i] || maxDiff > Integer.MIN_VALUE) {
                    maxDiff = Math.abs(maxDiff1[i]);
                }
            }
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
