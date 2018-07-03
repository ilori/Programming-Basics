import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p01_TrainingLab {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double height = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());
        if (3 <= width && width <= height && height <= 100) {
            width = width * 100;
            height = height * 100;
            double cols = Math.round(width - 100) / 70;
            double rows = Math.floor(height / 120);
            double seats = cols * rows - 3;
            System.out.println(seats);
        } else {
            System.out.println(" ");
        }
    }
}
