import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Volleyball {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String year = console.nextLine();
        double holidays = Integer.parseInt(console.nextLine());
        int home = Integer.parseInt(console.nextLine());
        double games;
        double weekends = 48;
        double leap = 0.15;
        weekends = weekends - home;
        weekends = weekends * 3.0 / 4;
        holidays = holidays * 2.0 / 3;
        games = weekends + holidays + home;
        if (year.equals("leap")) {
            leap = games * leap;
            games = games + leap;
            System.out.println(Math.floor(games));
        } else {
            System.out.println(Math.floor(games));
        }
    }
}
