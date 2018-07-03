import java.util.Scanner;

public class p14_FitStringin20Chars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        String result = "";
        if (word.length() >= 20) {
            result = word.substring(0, 20);
        } else {
            result = word;
            while (result.length() < 20) {
                result += "*";
            }
        }
        System.out.println(result);
    }
}
