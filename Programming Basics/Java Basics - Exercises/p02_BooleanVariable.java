import java.util.Scanner;

public class p02_BooleanVariable {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        if(isBool(input)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    private static boolean isBool(String input) {
        if(input.equals("True")){
            return true;
        }
        return false;
    }
}
