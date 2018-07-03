import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String gender = console.nextLine();
        gender = gender.toLowerCase();
        if (age < 16) {
            if (gender.equals("m")) {
                System.out.println("Master");
                ;
            }
            if (gender.equals("f")) {
                System.out.println("Miss");
            }
        }
        if (age >= 16) {
            if (gender.equals("m")) {
                System.out.println("Mr.");
            }
            if (gender.equals("f")) {
                System.out.println("Ms.");
            }
        }
    }
}
