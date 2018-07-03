import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class AnimalType {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String animal = console.nextLine().toLowerCase();
        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "snake":
            case "crocodile":
            case "tortoise":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
