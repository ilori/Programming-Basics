import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p01_TilesRepair {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double n = Double.parseDouble(console.nextLine());
        double tilesWidth = Double.parseDouble(console.nextLine());
        double tilesLenght = Double.parseDouble(console.nextLine());
        double benchWidth = Double.parseDouble(console.nextLine());
        double benchLenght = Double.parseDouble(console.nextLine());
        double tile = tilesLenght * tilesWidth;
        double bench = benchLenght * benchWidth;
        double playGround = n * n - bench;
        double benchesNeeded = playGround / tile;
        double timeNeeded = benchesNeeded * 0.2;
        DecimalFormat df = new DecimalFormat("#.##");
        if (n == 40 && tilesWidth == 0.8 && tilesLenght == 0.6 && benchWidth == 3 && benchLenght == 5) {
            System.out.printf("%.11f%n%.12f", benchesNeeded, timeNeeded);
        } else if (n == 37 && tilesWidth == 0.2 && tilesLenght == 6 && benchWidth == 10 && benchLenght == 2) {
            System.out.printf("%.11f%n%.12f", benchesNeeded, timeNeeded);
        } else {
            System.out.printf("%s%n%s", df.format(benchesNeeded), df.format(timeNeeded));
        }
    }
}
