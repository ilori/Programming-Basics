import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SumSeconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int s1 = Integer.parseInt(console.nextLine());
        int s2 = Integer.parseInt(console.nextLine());
        int s3 = Integer.parseInt(console.nextLine());
        int totalSeconds = s1 + s2 + s3;
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        if (seconds < 10) {
            System.out.println(minutes + ":0" + seconds);
        } else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}
