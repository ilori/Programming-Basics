import java.util.Arrays;
import java.util.Scanner;

public class p11_EqualSums {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int leftSum = 0;
        int rightSum = 0;
        int index = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }
            if (leftSum == rightSum) {
                index = i;
                count++;
                break;
            } else {
                leftSum = 0;
                rightSum = 0;
            }
        }
        if (count > 0) {
            System.out.println(index);
        } else if (numbers.length == 1) {
            System.out.println("0");
        } else {
            System.out.println("no");
        }
    }
}
