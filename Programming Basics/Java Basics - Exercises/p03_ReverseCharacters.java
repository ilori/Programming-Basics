import java.util.Scanner;

public class p03_ReverseCharacters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append(console.nextLine());
        }
        sb.reverse();
        System.out.println(sb);
    }
}
