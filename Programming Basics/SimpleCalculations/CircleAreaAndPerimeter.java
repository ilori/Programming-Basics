import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class CircleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double r = Double.parseDouble(console.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 2 * Math.PI * r;
        System.out.printf("area = %f%nperimeter = %f%n",area,perimeter);
    }
}
