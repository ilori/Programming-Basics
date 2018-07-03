import java.util.Scanner;

/**
 * Created by magix on 27-Feb-17.
 */
public class p04_Grades {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfStudents = Integer.parseInt(console.nextLine());
        double totalSum = 0;
        double topGrade = 0;
        double belowTop = 0;
        double medium = 0;
        double fail = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            double studentGrade = Double.parseDouble(console.nextLine());
            if (studentGrade >= 2 && studentGrade <= 2.99) {
                fail++;
                totalSum += studentGrade;
            } else if (studentGrade >= 3 && studentGrade <= 3.99) {
                medium++;
                totalSum += studentGrade;
            } else if (studentGrade >= 4 && studentGrade <= 4.99) {
                belowTop++;
                totalSum += studentGrade;
            } else {
                topGrade++;
                totalSum += studentGrade;
            }
        }
        double avarageGrade =totalSum / numberOfStudents;
        System.out.printf("Top students: %.2f%%%n", topGrade * 100 / numberOfStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", belowTop * 100 / numberOfStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", medium * 100 / numberOfStudents);
        System.out.printf("Fail: %.2f%%%n", fail * 100 / numberOfStudents);
        System.out.printf("Average: %.2f", avarageGrade);

    }
}
