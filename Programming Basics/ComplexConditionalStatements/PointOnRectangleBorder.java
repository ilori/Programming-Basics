import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class PointOnRectangleBorder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        boolean onLeftSide = (x == x1) && (y >= y1 && y <= y2);
        boolean onRightSide = (x == x2) && (y >= y1 && y <= y2);
        boolean onTopSide = (y == y1) && (x >= x1 && x <= x2);
        boolean onBottomSide = (y == y2) && (x >= x1 && x <= x2);
        if (onLeftSide || onRightSide || onTopSide || onBottomSide) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }
    }
}
