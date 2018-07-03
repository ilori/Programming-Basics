import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by magix on 26-Feb-17.
 */
public class ThousandDaysAfterBirth {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        LocalDate startDate = LocalDate.parse(console.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate endDate = startDate.plusDays(999);
        System.out.println(endDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
