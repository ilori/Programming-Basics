import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Number100to200 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double num = Double.parseDouble(console.nextLine());
        if (num < 100) {
            System.out.println("Less than 100");
        }
        if (num >= 100 && num <= 200) {
            System.out.println("Between 100 and 200");
        }
        if (num > 200) {
            System.out.println("Greater than 200");
        }
    }
}
