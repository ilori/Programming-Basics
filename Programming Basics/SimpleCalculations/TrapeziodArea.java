import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class TrapeziodArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double b1 = Double.parseDouble(console.nextLine());
        double b2 = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());
        double area = ((b1+b2)*h)/2;
        System.out.printf("Trapezoid area = %f",area);
    }
}
