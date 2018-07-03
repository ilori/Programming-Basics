import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by magix on 4/3/2017.
 */
public class p01_TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int x1 = Integer.parseInt(console.nextLine());
        int y1 = Integer.parseInt(console.nextLine());
        int x2 = Integer.parseInt(console.nextLine());
        int y2 = Integer.parseInt(console.nextLine());
        int x3 = Integer.parseInt(console.nextLine());
        int y3 = Integer.parseInt(console.nextLine());
        double sideA = x2 - x3;
        double triangleHeight = y3 - y1;
        double area = (sideA * triangleHeight) / 2;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.printf("%s",df.format(area));
    }
}
