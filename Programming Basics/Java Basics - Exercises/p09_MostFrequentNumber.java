import java.util.Arrays;
import java.util.Scanner;

public class p09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int element = 0;
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int tempElement = numbers[i];
            int tempCount = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == tempElement) {
                    tempCount++;
                }
            }
            if (tempCount > count) {
                element = tempElement;
                count = tempCount;
            }
        }
        System.out.println(element);
    }
}
