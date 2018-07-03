import java.util.Scanner;

/**
 * Created by magix on 5/23/2017.
 */
public class p03_BackInThirtyMinutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine()) + 30;
        if (minutes > 59) {
            hours++;
            minutes -= 60;
        }
        if (hours > 23) {
            hours -= 24;
        }
        if (minutes >= 10) {
            System.out.printf("%d:%d", hours, minutes);
        } else {
            System.out.printf("%d:%02d", hours, minutes);
        }

    }
}
