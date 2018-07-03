import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p03_OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int startHour = Integer.parseInt(console.nextLine()) * 60;
        int startMinutes = Integer.parseInt(console.nextLine());
        int arrivalHour = Integer.parseInt(console.nextLine()) * 60;
        int arrivalMinutes = Integer.parseInt(console.nextLine());
        int startTotalMinutes = startHour + startMinutes;
        int arrivalTotalMinutes = arrivalHour + arrivalMinutes;
        int minutesDifference = arrivalTotalMinutes - startTotalMinutes;
        if (minutesDifference < -30) {
            System.out.println("Early");
        } else if (minutesDifference <= 0) {
            System.out.println("On time");
        } else {
            System.out.println("Late");
        }
        if (minutesDifference != 0) {
            int hours = Math.abs(minutesDifference / 60);
            int minutes = Math.abs(minutesDifference % 60);
            if (hours > 0) {
                if (minutes < 10) {
                    System.out.printf("%d:0%d hours", hours, minutes);
                } else {
                    System.out.printf("%d:%d hours", hours, minutes);
                }
            } else {
                System.out.printf("%d minutes", minutes);
            }
            if (minutesDifference < 0) {
                System.out.println(" before the start");
            } else {
                System.out.println(" after the start");
            }
        }
    }
}
