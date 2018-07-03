import java.util.Scanner;

public class p17_ChangetoUppercase {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        int startIndex = text.indexOf("<upcase>");
        int endIndex = text.indexOf("</upcase>");
        String upperText = "";
        String replacement = "";
        while (startIndex != -1) {

            upperText = text.substring(startIndex + 8, endIndex).toUpperCase();
            replacement = text.substring(startIndex, endIndex + 9);
            text = text.replace(replacement, upperText);
            startIndex = text.indexOf("<upcase>");
            endIndex = text.indexOf("</upcase>");
        }
        System.out.println(text);
    }
}
