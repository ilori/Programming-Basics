import java.util.Scanner;

public class p15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String email = console.nextLine();
        String[] toReplace = email.split("@");
        String replacement = Replace(toReplace);
        String text = console.nextLine();
        text = text.replace(email, replacement);
        System.out.println(text);
    }

    private static String Replace(String[] toReplace) {
        String email = toReplace[0];
        String domain = toReplace[1];
        String result = "";
        for (int i = 0; i < email.length(); i++) {
            result += "*";
        }
        return result + "@" + domain;

    }
}
