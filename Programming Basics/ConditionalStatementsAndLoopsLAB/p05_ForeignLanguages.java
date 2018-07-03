import java.util.Scanner;

/**
 * Created by magix on 5/23/2017.
 */
public class p05_ForeignLanguages {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String language = console.nextLine().toLowerCase();
        switch (language) {
            case "usa":
            case "england":
                System.out.println("English");
                break;
            case "spain":
            case "argentina":
            case "mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
