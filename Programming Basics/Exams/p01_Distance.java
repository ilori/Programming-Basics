import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p01_Distance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double startSpeed = Integer.parseInt(console.nextLine());
        double firstAccel = Integer.parseInt(console.nextLine()) / 60.0;
        double secondAccel = Integer.parseInt(console.nextLine()) / 60.0;
        double thirdAccel = Integer.parseInt(console.nextLine()) / 60.0;
        double secondSpeed = startSpeed + (startSpeed * 0.1);
        double thirdSpeed = secondSpeed - (secondSpeed * 0.05);
        double totalKilometers = startSpeed * firstAccel + secondSpeed * secondAccel + thirdSpeed * thirdAccel;
        System.out.printf("%.2f",totalKilometers);
    }
}
