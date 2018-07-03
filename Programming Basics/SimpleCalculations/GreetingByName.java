import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class GreetingByName {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        System.out.printf("Hello, %s!",name);
    }
}
