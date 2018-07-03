import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double a = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double area = (a*h)/2;
        System.out.printf("Triangle area = %.2f",area);
    }
}
