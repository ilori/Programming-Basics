import java.util.Scanner;

public class p01_VariableinHexFormat {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String numStr = console.nextLine();
        int number = Integer.parseInt(numStr,16);
        System.out.println(number);
    }
}
