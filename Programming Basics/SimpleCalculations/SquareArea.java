import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class SquareArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;
        System.out.println("Square is = " + area);
    }
}
