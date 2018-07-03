import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int oddNum = 0;
        int evenNum = 0;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (i % 2 == 0) {
                evenNum += num;
            } else {
                oddNum += num;
            }
        }
        if (evenNum == oddNum) {
            System.out.println("yes sum = " + evenNum);
        } else {
            System.out.println("no diff = " + Math.abs(evenNum - oddNum));
        }
    }
}
