import java.util.Scanner;

/**
 * Created by magix on 5/23/2017.
 */
public class p01_Passed {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double grade = Double.parseDouble(console.nextLine());
        if (grade >= 3.00) {
            System.out.println("Passed!");
        }
    }
}
