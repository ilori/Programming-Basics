import java.util.Arrays;
import java.util.Scanner;

public class p12_BombNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] numbers = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] commands = Arrays.stream(console.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int bomb = commands[0];
        int power = commands[1];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == bomb) {
                numbers[i] = 0;
                for (int j = 1; j <= power; j++) {
                    if (i + j >= numbers.length) {
                        break;
                    } else {
                        numbers[i + j] = 0;
                    }
                }
                for (int j = 1; j <= power; j++) {
                    if (i - j < 0) {
                        break;
                    } else {
                        numbers[i - j] = 0;
                    }
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(sum);

    }
}
