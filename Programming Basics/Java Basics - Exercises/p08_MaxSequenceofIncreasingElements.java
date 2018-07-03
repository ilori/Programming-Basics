import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p08_MaxSequenceofIncreasingElements {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int maxStart = 0;
        int maxLenght = 1;
        int currentStart = 0;
        int currentLenght = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > numbers[i - 1]) {
                currentLenght++;
                if (currentLenght > maxLenght) {
                    maxLenght = currentLenght;
                    maxStart = currentStart;
                }
            } else {
                currentStart = i;
                currentLenght = 1;
            }
        }
        int[] finalNums = new int[maxLenght];
        int index = 0;

        for (int i = maxStart; i < maxLenght+maxStart; i++) {
            finalNums[index] = numbers[i];
            index++;
        }
        String result = Arrays.stream(finalNums)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);

    }

}
