import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TwoDRectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double x1 = Double.parseDouble(console.nextLine());
        double y1 = Double.parseDouble(console.nextLine());
        double x2 = Double.parseDouble(console.nextLine());
        double y2 = Double.parseDouble(console.nextLine());
        double a = Math.abs(x1-x2);
        double b = Math.abs(y1-y2);
        double area = a*b;
        double perimeter = (a+b)*2;
        System.out.printf("area = %f%nperimeter = %f",area,perimeter);
    }
}
