import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p06_LetterCombinations {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char firstLetter = console.nextLine().charAt(0);
        char secondLetter = console.nextLine().charAt(0);
        char ignoreLetter = console.nextLine().charAt(0);
        int numOfCombinations = 0;
        for (char i = firstLetter; i <= secondLetter; i++) {
            for (char j = firstLetter; j <= secondLetter; j++) {
                for (char k = firstLetter; k <= secondLetter; k++) {
                    if (i == ignoreLetter || j == ignoreLetter || k == ignoreLetter) {
                        continue;
                    }
                    numOfCombinations++;
                    System.out.print("" + i + j + k + " ");
                }
            }
        }
        System.out.print(numOfCombinations);
    }
}
