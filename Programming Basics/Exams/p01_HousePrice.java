import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p01_HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstRoom = Double.parseDouble(console.nextLine());
        double kitchen = Double.parseDouble(console.nextLine());
        double pricePerMeter = Double.parseDouble(console.nextLine());
        double secondRoom = (firstRoom * 0.1)+firstRoom;
        double thirdRoom = (secondRoom * 0.1)+secondRoom;
        double bathRoom = firstRoom/2;
        double totalMeters = firstRoom+secondRoom+thirdRoom+bathRoom+kitchen;
        totalMeters+=totalMeters*0.05;
        double totalMoney = totalMeters * pricePerMeter;
        System.out.printf("%.2f",totalMoney);
    }
}
