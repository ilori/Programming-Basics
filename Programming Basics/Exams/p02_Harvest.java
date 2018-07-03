import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_Harvest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double harvestArea = Integer.parseInt(console.nextLine());
        double grape = Double.parseDouble(console.nextLine());
        double neededGrapes = Integer.parseInt(console.nextLine());
        int numberOfWorkers = Integer.parseInt(console.nextLine());
        double grapesLeft = 0;
        double winePerWorker = 0;
        DecimalFormat dm = new DecimalFormat("#.##");
        harvestArea = harvestArea * grape;
        harvestArea = 0.4 * harvestArea / 2.5;
        if (harvestArea >= neededGrapes) {
            grapesLeft = harvestArea - neededGrapes;
            winePerWorker = grapesLeft / numberOfWorkers;
            System.out.printf("Good harvest this year! Total wine: %s liters.%n%s liters left -> %s liters per person.", dm.format(Math.floor(harvestArea)), dm.format(Math.ceil(grapesLeft)), dm.format(Math.ceil(winePerWorker)));
        } else {
            grapesLeft = neededGrapes - harvestArea;
            System.out.printf("It will be a tough winter! More %s liters wine needed.", dm.format(Math.floor(grapesLeft)));
        }

    }
}
