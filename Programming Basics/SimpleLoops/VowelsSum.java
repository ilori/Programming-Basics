import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class VowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String userWord = console.nextLine().toLowerCase();
        int wordSum = 0;
        for (int i = 0; i < userWord.length(); i++) {
            char currentLetter = userWord.charAt(i);
            switch (currentLetter) {
                case 'a':
                    wordSum += 1;
                    break;
                case 'e':
                    wordSum += 2;
                    break;
                case 'i':
                    wordSum += 3;
                    break;
                case 'o':
                    wordSum += 4;
                    break;
                case 'u':
                    wordSum += 5;
                    break;
            }
        }
        System.out.println(wordSum);
    }
}
