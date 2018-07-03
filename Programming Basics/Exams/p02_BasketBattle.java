import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p02_BasketBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstOneShooting = console.nextLine();
        String winner = "";
        int totalRounds = Integer.parseInt(console.nextLine());
        int winningRound = 0;
        int simeonPoints = 0;
        int nakovPoints = 0;
        boolean nakovFirst = false;
        boolean simeonFirst = false;
        if (firstOneShooting.equals("Nakov")) {
            nakovFirst = true;
        } else if (firstOneShooting.equals("Simeon")) {
            simeonFirst = true;
        }
        for (int round = 1; round <= totalRounds; round++) {
            int firstShot = Integer.parseInt(console.nextLine());
            String firstSuccessfulShot = console.nextLine();
            if (simeonFirst) {
                if (firstSuccessfulShot.equals("success") && simeonPoints + firstShot <= 500) {
                    simeonPoints += firstShot;
                }
                if (simeonPoints == 500) {
                    winner = "Simeon";
                    winningRound = round;
                    break;
                }
                int secondShot = Integer.parseInt(console.nextLine());
                String secondSuccessfulShot = console.nextLine();
                if (secondSuccessfulShot.equals("success") && secondShot + nakovPoints <= 500) {
                    nakovPoints += secondShot;
                    if (nakovPoints == 500) {
                        winner = "Nakov";
                        winningRound = round;
                        break;
                    }
                }
            }
            if (nakovFirst) {
                {
                    if (firstSuccessfulShot.equals("success") && nakovPoints + firstShot <= 500) {
                        nakovPoints += firstShot;
                    }
                    if (nakovPoints == 500) {
                        winner = "Nakov";
                        winningRound = round;
                        break;
                    }
                    int secondShot = Integer.parseInt(console.nextLine());
                    String secondSuccessfulShot = console.nextLine();
                    if (secondSuccessfulShot.equals("success") && secondShot + simeonPoints <= 500) {
                        simeonPoints += secondShot;
                        if (simeonPoints == 500) {
                            winner = "Simeon";
                            winningRound = round;
                            break;
                        }
                    }
                }
            }
            nakovFirst = !nakovFirst;
            simeonFirst = !simeonFirst;
        }
        if (winner.equals("Simeon")) {
            System.out.printf("%s%n%d%n%d", winner, winningRound, nakovPoints);
        } else if (winner.equals("Nakov")) {
            System.out.printf("%s%n%d%n%d", winner, winningRound, simeonPoints);
        } else if (winner.isEmpty() && simeonPoints == nakovPoints) {
            System.out.printf("DRAW%n%d", simeonPoints);
        } else {
            if (nakovPoints > simeonPoints) {
                System.out.printf("Nakov%n%d", nakovPoints - simeonPoints);
            } else {
                System.out.printf("Simeon%n%d", simeonPoints - nakovPoints);
            }
        }
    }
}
