import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int leftNum = 0;
        int rightNum = 0;
        for (int i = 0; i < n; i++) {
            int userNum = Integer.parseInt(console.nextLine());
            leftNum += userNum;
        }
        for (int i = 0; i < n; i++) {
            int userNum = Integer.parseInt(console.nextLine());
            rightNum += userNum;
        }
        if (rightNum == leftNum) {
            System.out.println("yes sum " + leftNum);
        } else {
            System.out.println("no diff " + Math.abs(leftNum - rightNum));
        }
    }
}
