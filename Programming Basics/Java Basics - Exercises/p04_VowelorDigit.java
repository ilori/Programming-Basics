import java.util.Scanner;

public class p04_VowelorDigit {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        if (isDidgit(input)) {
            System.out.println("digit");
        } else if (isVowel(input)) {
            System.out.println("vowel");
        } else {
            System.out.println("other");
        }
    }

    private static boolean isDidgit(String input) {
        return Character.isDigit(input.charAt(0));
    }

    private static boolean isVowel(String input) {
        return "AEIOUaeiou".contains(input);


    }
}
