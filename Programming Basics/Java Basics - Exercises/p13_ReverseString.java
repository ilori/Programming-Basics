import java.util.Scanner;

public class p13_ReverseString {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String word = console.nextLine();
        StringBuilder sb = new StringBuilder(word).reverse();
        System.out.println(sb.toString());
    }
}
