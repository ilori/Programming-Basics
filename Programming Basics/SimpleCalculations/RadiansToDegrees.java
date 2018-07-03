import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double rad = Double.parseDouble(console.nextLine());
        double deg = Math.toDegrees(rad);
        System.out.printf("%d", Math.round(deg));
    }
}
