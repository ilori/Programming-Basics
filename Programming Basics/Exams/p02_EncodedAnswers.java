import java.util.Scanner;

/**
 * Created by magix on 4/3/2017.
 */
public class p02_EncodedAnswers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        String answers = "";
        int answerA = 0;
        int answerB = 0;
        int answerC = 0;
        int answerD = 0;
        for (int i = 0; i < input; i++) {
            double numbers = Double.parseDouble(console.nextLine());
            if (numbers % 4 == 0) {
                answers += 'a' + " ";
                answerA++;
            } else if (numbers % 4 == 1) {
                answers += 'b' + " ";
                answerB++;
            } else if (numbers % 4 == 2) {
                answers += 'c' + " ";
                answerC++;
            } else if (numbers % 4 == 3) {
                answers += 'd' + " ";
                answerD++;
            }
        }
        System.out.printf("%s\nAnswer A: %d\nAnswer B: %d\nAnswer C: %d\nAnswer D: %d", answers, answerA, answerB, answerC, answerD);
    }
}
