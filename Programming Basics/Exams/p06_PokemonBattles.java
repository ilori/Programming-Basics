import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p06_PokemonBattles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstTrainer = Integer.parseInt(console.nextLine());
        int secondTrainer = Integer.parseInt(console.nextLine());
        int maxBattles = Integer.parseInt(console.nextLine());
        int count = 0;

        for (int i = 1; i <= firstTrainer; i++) {
            for (int j = 1; j <= secondTrainer; j++) {
                count++;
                if (!(maxBattles + 1 > count)) {
                    break;
                }
                System.out.print("(" + i + " <-> " + j + ") ");
            }
        }
    }
}
