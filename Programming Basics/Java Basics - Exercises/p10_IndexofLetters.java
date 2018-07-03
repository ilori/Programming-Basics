import java.util.Scanner;

public class p10_IndexofLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'g', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] word = console.nextLine().toCharArray();
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if (word[i] == letters[j]) {
                    System.out.printf("%c -> %d%n", word[i], j);
                }
            }
        }

    }
}
