import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p02_TomTheCat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int freeDay = Integer.parseInt(console.nextLine());
        int playWhileWork = (365 - freeDay) * 63;
        int playWhileFree = freeDay * 127;
        int totalPlay = playWhileWork + playWhileFree;
        int tomPlayTime = 30000 - totalPlay;
        int hours = tomPlayTime / 60;
        int minutes = tomPlayTime % 60;
        if (totalPlay < 30000) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hours, minutes);
        } else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", Math.abs(hours), Math.abs(minutes));
        }
    }
}
