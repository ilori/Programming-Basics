import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter side a : ");
        int a = Integer.parseInt(console.nextLine());
        System.out.print("Please enter side b : ");
        int b = Integer.parseInt(console.nextLine());
        int sum = a * b;
        System.out.println("The area is : " + sum);
    }
}
