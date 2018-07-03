import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int userNum = Integer.parseInt(console.nextLine());
        if (userNum >= 100 && userNum <= 200 || userNum == 0) {

        } else {
            System.out.println("invalid");
        }
    }
}
