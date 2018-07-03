import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p01_Fishland {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double skumriq = Double.parseDouble(console.nextLine());
        double caca = Double.parseDouble(console.nextLine());
        double palamud = Double.parseDouble(console.nextLine());
        double safrid = Double.parseDouble(console.nextLine());
        double midi = Double.parseDouble(console.nextLine()) * 7.50;
        double palamudPrice = (skumriq + skumriq * 0.6) * palamud;
        double safridPrice = (caca + caca * 0.8) * safrid;
        double total = palamudPrice + safridPrice + midi;
        System.out.printf("%.2f", total);
    }
}
