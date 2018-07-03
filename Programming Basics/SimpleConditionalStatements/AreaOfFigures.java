import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String figure = console.nextLine();
        figure = figure.toLowerCase();
        if (figure.equals("square")) {
            double sideA = Double.parseDouble(console.nextLine());
            double area = sideA * sideA;
            System.out.printf("%.3f", area);
        }
        if (figure.equals("rectangle")) {
            double sideA = Double.parseDouble(console.nextLine());
            double sideB = Double.parseDouble(console.nextLine());
            double area = sideA * sideB;
            System.out.printf("%.3f", area);
        }
        if (figure.equals("circle")) {
            double radius = Double.parseDouble(console.nextLine());
            double area = (radius * radius) * Math.PI;
            System.out.printf("%.3f", area);
        }
        if (figure.equals("triangle")) {
            double sideA = Double.parseDouble(console.nextLine());
            double height = Double.parseDouble(console.nextLine());
            double area = (sideA * height) / 2;
            System.out.printf("%.3f", area);
        }
    }
}
