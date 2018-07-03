import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if (n % 2 != 0 && n != 1) {
            int leftDashes = (n - 1) / 2;
            int rightDashes = (n - 1) / 2;
            int midDashes = 1;
            int midRow = n - 2;
            System.out.println(repeat("-", leftDashes) + "*" + repeat("-", rightDashes));
            for (int i = 0; i < (n - 1) / 2; i++) {

                if (i > 0) {
                    leftDashes--;
                    rightDashes--;
                    System.out.println(repeat("-", leftDashes) + "*" + repeat("-", midDashes) + "*" + repeat("-", rightDashes));
                    midDashes += 2;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("*" + repeat("-", midRow) + "*");
            }
            for (int i = 0; i < (n - 1) / 2; i++) {

                if (i > 0) {
                    midDashes -= 2;
                    System.out.println(repeat("-", leftDashes) + "*" + repeat("-", midDashes) + "*" + repeat("-", rightDashes));
                    leftDashes++;
                    rightDashes++;
                }
            }
            System.out.println(repeat("-", leftDashes) + "*" + repeat("-", rightDashes));
        } else if (n % 2 == 0 && n != 2) {
            int rightDashes = (n - 2) / 2;
            int leftDashes = (n - 2) / 2;
            int midDashes = 2;
            int midRow = n - 2;
            System.out.println(repeat("-", leftDashes) + "**" + repeat("-", rightDashes));
            for (int i = 0; i < (n - 1) / 2; i++) {

                if (i > 0) {
                    leftDashes--;
                    rightDashes--;
                    System.out.println(repeat("-", leftDashes) + "*" + repeat("-", midDashes) + "*" + repeat("-", rightDashes));
                    midDashes += 2;
                }
            }
            for (int i = 0; i < 1; i++) {
                System.out.println("*" + repeat("-", midRow) + "*");
            }
            for (int i = 0; i < (n - 1) / 2; i++) {

                if (i > 0) {
                    midDashes -= 2;
                    System.out.println(repeat("-", leftDashes) + "*" + repeat("-", midDashes) + "*" + repeat("-", rightDashes));
                    leftDashes++;
                    rightDashes++;
                }
            }
            System.out.println(repeat("-", leftDashes) + "**" + repeat("-", rightDashes));
        }
        if (n == 2) {
            System.out.println("**");
        } else if (n == 1) {
            System.out.println("*");
        }
    }

    public static String repeat(String text, int count) {
        String output = "";
        for (int i = 0; i < count; i++) {
            output += text;
        }
        return output;
    }
}

