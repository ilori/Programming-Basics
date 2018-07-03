import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_ChangeTiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double haralambiMoney = Double.parseDouble(console.nextLine());
        double floorWidth = Double.parseDouble(console.nextLine());
        double floorLenght = Double.parseDouble(console.nextLine());
        double sideOfTriangle = Double.parseDouble(console.nextLine());
        double heightOfTriangle = Double.parseDouble(console.nextLine());
        double pricePerTile = Double.parseDouble(console.nextLine());
        double moneyForWorker = Double.parseDouble(console.nextLine());
        double floorArea = floorLenght * floorWidth;
        double tileArea = sideOfTriangle * heightOfTriangle / 2;
        double tilesNeeded = Math.ceil(floorArea / tileArea) + 5;
        double tilesPrice = tilesNeeded * pricePerTile + moneyForWorker;
        if (haralambiMoney >= tilesPrice) {
            System.out.printf("%.2f lv left.", Math.abs(haralambiMoney - tilesPrice));
        } else {
            System.out.printf("You'll need %.2f lv more.", Math.abs(haralambiMoney - tilesPrice));
        }

    }
}
