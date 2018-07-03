import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SquareOfStars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int times = Integer.parseInt(console.nextLine());
        for (int i = 0; i < times ; i++) {
            for (int j = 0; j < times; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
