import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p07_MaxSequenceofEqualElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int maxSequence = 0;
        int currentSequence = 1;
        int number = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                currentSequence++;
                if (currentSequence > maxSequence) {
                    maxSequence = currentSequence;
                    number = numbers[i];

                }
            } else {
                currentSequence = 1;
            }
        }
        int[] finalNums = new int[maxSequence];
        for (int i = 0; i < finalNums.length; i++) {
            finalNums[i] = number;
        }
        String result = Arrays.stream(finalNums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }

}
