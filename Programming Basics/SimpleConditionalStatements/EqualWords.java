import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class EqualWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstWord = console.nextLine();
        firstWord = firstWord.toLowerCase();
        String secondWord = console.nextLine();
        secondWord = secondWord.toLowerCase();
        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
