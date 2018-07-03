import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hours = Integer.parseInt(console.nextLine());
        int minutes = Integer.parseInt(console.nextLine());
        hours = hours * 60;
        int totalMinutes = hours + minutes + 15;
        int hoursAfter = totalMinutes / 60;
        int minutesAfter = totalMinutes % 60;
        if (hoursAfter > 23) {
            hoursAfter -= 24;
            System.out.printf("%d:%02d", hoursAfter, minutesAfter);
        } else {
            System.out.printf("%d:%02d", hoursAfter, minutesAfter);
        }
    }
}
