import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p06_MaxCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int maxCombinations = Integer.parseInt(console.nextLine());
        int count = 0;
        for (int i = firstNumber; i <= secondNumber; i++) {
            for (int j = firstNumber; j <= secondNumber; j++) {
                count++;
                if (!(maxCombinations + 1 > count)) {
                    break;
                }
                System.out.print("<" + i + "-" + j + ">");
            }
        }
    }
}
