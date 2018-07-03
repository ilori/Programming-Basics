import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());
        int x1 = 0;
        int y1 = 0;
        int x2 = 3 * h;
        int y2 = 4 * h;
        int x3 = 2 * h;
        if (((((x == x1) || (x == x2)) && (y1 <= y) && (y <= h)) || (((y == y1) || (y == h)) && (x1 <= x) && (x <= x2)) ||
                (((x == h) || (x == x3)) && (h <= y) && (y <= y2)) || (((y == h) || (y == y2)) && (h <= x) && (x <= x3))) && (!((y == h) && (x > h) && (x < x3)))) {
            System.out.println("border");
        } else if (((x >= x1) && (x <= x2) && (y >= y1) && (y <= h)) || ((x >= h) && (x <= x3) && (y >= h) && (y <= y2)) || (y == h) && (x > h) && (x < x3)) {
            System.out.println("inside");
        } else {
            System.out.println("outside");
        }
    }
}
