import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class p04_DivisionWithouthRemainder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int loop = Integer.parseInt(console.nextLine());
        double divisionByTwo = 0;
        double divisionByThree = 0;
        double divisionByFour = 0;
        for (int i = 0; i < loop; i++) {
            int userNumber = Integer.parseInt(console.nextLine());
            if (userNumber % 2 == 0) {
                divisionByTwo++;
            }
            if (userNumber % 3 == 0) {
                divisionByThree++;
            }
            if (userNumber % 4 == 0) {
                divisionByFour++;
            }
        }
        divisionByTwo = divisionByTwo / loop * 100;
        divisionByFour = divisionByFour / loop * 100;
        divisionByThree = divisionByThree / loop * 100;
        System.out.printf("%.2f%s%n%.2f%s%n%.2f%s", divisionByTwo, "%", divisionByThree, "%", divisionByFour, "%");
    }
}
