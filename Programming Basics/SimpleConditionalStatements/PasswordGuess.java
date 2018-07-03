import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class PasswordGuess {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        if (word.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
